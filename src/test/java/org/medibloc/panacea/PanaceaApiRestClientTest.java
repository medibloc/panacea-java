package org.medibloc.panacea;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.bitcoinj.core.Base58;
import org.bitcoinj.core.ECKey;
import org.junit.Test;
import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.encoding.Crypto;
import org.medibloc.panacea.encoding.EncodeUtils;
import org.medibloc.panacea.encoding.message.*;
import org.medibloc.panacea.encoding.message.did.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PanaceaApiRestClientTest {
    String mnemonic = "genuine key outside escape oval unhappy mansion cricket practice quarter purchase picnic layer bicycle stem soup column creek convince obey rather rice there alcohol";

    @Test
    public void testGetAccountTestnet() throws PanaceaApiException {
        PanaceaApiRestClient client = PanaceaApiClientFactory.newInstance().newRestClient("http://52.78.196.16:1317");
        Account acc = client.getAccount("panacea1tkat7m78exe89jkx40e3c7rurytu5pukajdamq");
        System.out.println(acc);
        BlockInfo bi = client.getBlockByHeight(3171824L);
        System.out.println(bi);
        System.out.println(client.getLatestBlock());

        List<TxResponse> txs = client.getTxsByHeight(3171824L);
        System.out.println(txs);
    }

    @Test
    public void testGetAccount() {
        // client
        PanaceaApiRestClient client = PanaceaApiClientFactory.newInstance().newRestClient("http://localhost:1317");
        try {
            System.out.println(Crypto.generateMnemonicCodeFromEntropy("asjdkfjafahkdfhdsakjhfkadshfkjasdhfkjsdhfkjsadhfkjhkjwehrkqwhaekjhakjsdhfkdsahfksadhkf".getBytes()));
            System.out.println(Wallet.createWalletFromEntropy("panacea", "asjdkfjafahkdfhdsakjhfkadshfkjasdhfkjsdhfkjsadhfkjhkjwehrkqwhaekjhakjsdhfkdsahfksadhkf".getBytes()));
            Account account = client.getAccount("panacea1mm72d9c36zwszcck34nyl49j32hxx6jfhfs52l");
            System.out.println(account);

            // Msgs
            Transfer transfer = new Transfer();
            transfer.setAmount("1000");
            transfer.setDenom("umed");
            transfer.setFromAddress("panacea1gtx6lmnjg6ykvv07ruyxamth6yuhgcvmhg3pqz");
            transfer.setToAddress("panacea1nmmdwc00cg9tp3hzaahyte7vpvjrp2vtkn84z8");
            PanaceaTransactionMessage msg = createMsgSend(transfer);

            // Fee
            StdFee fee = new StdFee("umed", "10000", "200000");

            // Wallet
            Wallet wallet = Wallet.createWalletFromMnemonicCode(Arrays.asList(mnemonic.split("\\s+")), "panacea", 0);
            wallet.ensureWalletIsReady(client);

            System.out.println(wallet.getPubKeyHexString());
            System.out.println(wallet.getPrivateKeyHexString());

            // StdTx
            StdTx tx = new StdTx(msg, fee, "");

            // Sign
            tx.sign(wallet);
            wallet.increaseAccountSequence();

            // Broadcast Request
            BroadcastReq req = new BroadcastReq(tx, "block");

            // Broadcast
            TxResponse res = client.broadcast(req);
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAddRecord() {
        // client
        PanaceaApiRestClient client = PanaceaApiClientFactory.newInstance().newRestClient("http://localhost:1317");
        try {
            MsgAddRecord msg = new MsgAddRecord(
                    "panacea1gtx6lmnjg6ykvv07ruyxamth6yuhgcvmhg3pqz",
                    "test",
                    "key1".getBytes(),
                    "data1".getBytes(),
                    "panacea1gtx6lmnjg6ykvv07ruyxamth6yuhgcvmhg3pqz",
                    "");

            StdFee fee = new StdFee("umed", "10000", "200000");

            Wallet wallet = Wallet.createWalletFromMnemonicCode(Arrays.asList(mnemonic), "panacea", 0);
            wallet.ensureWalletIsReady(client);

            StdTx tx = new StdTx(msg, fee, "");

            tx.sign(wallet);
            wallet.increaseAccountSequence();

            BroadcastReq req = new BroadcastReq(tx, "block");

            TxResponse res = client.broadcast(req);
            System.out.println(res);
            System.out.println(res.getTx());
            byte[] data = Hex.decodeHex(res.getData());

            ResAddRecord msgRes = EncodeUtils.toObjectFromJsonString(new String(data), ResAddRecord.class);

            Record rec = client.getRecord(msgRes.getValue().getOwnerAddress(), msgRes.getValue().getTopicName(), msgRes.getValue().getOffset());
            System.out.println(new String(rec.getKey()));
            System.out.println(new String(rec.getValue()));
            System.out.println(rec);


            TxResponse txRes = client.getTxResponse(res.getTxHash());
            System.out.println(txRes);

            PanaceaTransactionMessage txMsg = txRes.getTx().getValue().getMsgs()[0];
            System.out.println(txMsg.getType());
            if (txMsg.getType() == "aol/MsgAddRecord") {
                MsgAddRecord m = (MsgAddRecord) txMsg;
                System.out.println(new String(m.getValue().getKey()));
                System.out.println(new String(m.getValue().getValue()));
            } else if (txMsg.getType() == "cosmos-sdk/MsgSend") {
                MsgSend m = (MsgSend) txMsg;
                System.out.println(m.getValue().getAmount());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testDID() throws JsonProcessingException, NoSuchAlgorithmException {
        // client
        PanaceaApiRestClient client = PanaceaApiClientFactory.newInstance().newRestClient("http://localhost:1317");

        ECKey ecKey = new ECKey(new SecureRandom());
        byte[] pubKey = ecKey.getPubKeyPoint().getEncoded(true);

        DID did = new DID(DID.NetworkID.TESTNET, pubKey);
        DIDVerificationMethod veriMethod = new DIDVerificationMethod(
                new DIDVerificationMethod.ID(did, "key1"),
                DIDKeyType.ES256K,
                did,
                pubKey
        );
        DIDDocument doc = new DIDDocument(
                Collections.singletonList(DIDDocument.Context.DID_V1),
                did,
                Collections.singletonList(veriMethod),
                Collections.singletonList((DIDAuthentication) new DIDVeriMethodIdAuthentication(veriMethod.getId()))
        );
        String sigBase64 = Base64.encodeBase64String(Crypto.sign(EncodeUtils.toJsonEncodeBytes(doc), ecKey));

        MsgCreateDID msg = new MsgCreateDID(
                new MsgCreateDID.Value(
                        did,
                        doc,
                        veriMethod.getId(),
                        sigBase64,
                        "panacea1gtx6lmnjg6ykvv07ruyxamth6yuhgcvmhg3pqz"
                )
        );
    }

    private MsgSend createMsgSend(Transfer transfer) {
        Coin coin = new Coin();
        coin.setDenom(transfer.getDenom());
        coin.setAmount(transfer.getAmount());
        List<Coin> amount = Collections.singletonList(coin);

        MsgSend.Value msgSendValue = new MsgSend.Value();
        msgSendValue.setAmount(amount);
        msgSendValue.setFromAddress(transfer.getFromAddress());
        msgSendValue.setToAddress(transfer.getToAddress());

        MsgSend msgSend = new MsgSend();
        msgSend.setValue(msgSendValue);
        return msgSend;
    }
}
