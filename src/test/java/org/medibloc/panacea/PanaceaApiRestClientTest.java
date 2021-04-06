package org.medibloc.panacea;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.junit.Test;
import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.encoding.Crypto;
import org.medibloc.panacea.encoding.EncodeUtils;
import org.medibloc.panacea.encoding.message.*;
import org.medibloc.panacea.encoding.message.did.*;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PanaceaApiRestClientTest {
    String mnemonic = "genuine key outside escape oval unhappy mansion cricket practice quarter purchase picnic layer bicycle stem soup column creek convince obey rather rice there alcohol";

    @Test
    public void testGetAccountTestnet() throws PanaceaApiException {
        PanaceaApiRestClient client = PanaceaApiClientFactory.newInstance().newRestClient("http://52.78.196.16:1317");
        Account acc = client.getAccount("panacea1tkat7m78exe89jkx40e3c7rurytu5pukajdamq");
        assertNotNull(acc);
        assertEquals("panacea1tkat7m78exe89jkx40e3c7rurytu5pukajdamq", acc.getValue().getAddress());
        System.out.println(acc);

        //TODO: setup proper integration tests, instead of using the magic block height
        BlockInfo bi = client.getBlockByHeight(7710L);
        assertEquals(new Long(7710), bi.getBlockMeta().getHeader().getHeight());
        System.out.println(bi);
        System.out.println(client.getLatestBlock());

        //TODO: setup proper integration tests, instead of using the magic block height
        List<TxResponse> txs = client.getTxsByHeight(7710L);
        assertEquals(1, txs.size());
        assertEquals(new Long(7710), txs.get(0).getHeight());
        System.out.println(txs);
    }

    @Test(expected = IllegalStateException.class)
    public void testEnsureWalletForUnknownAccount() throws PanaceaApiException {
        PanaceaApiRestClient client = PanaceaApiClientFactory.newInstance().newRestClient("http://52.78.196.16:1317");
        Wallet wallet = Wallet.createRandomWallet("panacea");
        wallet.ensureWalletIsReady(client);
        System.out.println(wallet);
    }

    @Test
    public void testGetAccount() throws PanaceaApiException, IOException, NoSuchAlgorithmException {
        // client
        PanaceaApiRestClient client = PanaceaApiClientFactory.newInstance().newRestClient("http://localhost:1317");

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
    }

    @Test
    public void testAddRecord() throws PanaceaApiException, IOException, NoSuchAlgorithmException, DecoderException {
        // client
        PanaceaApiRestClient client = PanaceaApiClientFactory.newInstance().newRestClient("http://localhost:1317");

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

        StdTx tx = new StdTx(msg, fee, "메 ><& 모 memo");

        tx.sign(wallet);
        wallet.increaseAccountSequence();

        BroadcastReq req = new BroadcastReq(tx, "block");

        TxResponse res = client.broadcast(req);
        System.out.println(res);
        System.out.println(res.getTx());
        byte[] data = Hex.decodeHex(res.getData());

        ResAddRecord msgRes = EncodeUtils.toObjectFromJsonString(new String(data), ResAddRecord.class);

        Record rec = client.getRecord(msgRes.getValue().getOwnerAddress(), msgRes.getValue().getTopicName(), msgRes.getValue().getOffset());
        assertEquals("key1", new String(rec.getKey()));
        assertEquals("data1", new String(rec.getValue()));
        assertEquals("panacea1gtx6lmnjg6ykvv07ruyxamth6yuhgcvmhg3pqz", rec.getWriterAddress());


        TxResponse txRes = client.getTxResponse(res.getTxHash());
        System.out.println(txRes);
        assertEquals("메 ><& 모 memo", txRes.getTx().getValue().getMemo());

        PanaceaTransactionMessage txMsg = txRes.getTx().getValue().getMsgs()[0];
        System.out.println(txMsg.getType());
        if (txMsg.getType() == "aol/MsgAddRecord") {
            MsgAddRecord m = (MsgAddRecord) txMsg;
            assertEquals("key1", new String(m.getValue().getKey()));
            assertEquals("data1", new String(m.getValue().getValue()));
        } else if (txMsg.getType() == "cosmos-sdk/MsgSend") {
            MsgSend m = (MsgSend) txMsg;
            System.out.println(m.getValue().getAmount());
        }
    }

    @Test
    public void testDid() throws IOException, NoSuchAlgorithmException, PanaceaApiException {
        // client
        PanaceaApiRestClient client = PanaceaApiClientFactory.newInstance().newRestClient("http://localhost:1317");

        // Generate a DID Wallet and a DID Document
        DidWallet didWallet = DidWallet.createRandomWallet();  // which holds a private/public key pair
        DidDocument doc = DidDocument.create(didWallet);

        // Build a message for registering the DID to Panacea (with signing by the private key which is associated with the DID).
        MsgCreateDid msg = new MsgCreateDid(
                doc,
                doc.getVerificationMethods().get(0).getId(),
                didWallet,
                "panacea1gtx6lmnjg6ykvv07ruyxamth6yuhgcvmhg3pqz"
        );

        // Prepare a Panacea account to execute a transaction
        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, "panacea", 0);
        wallet.ensureWalletIsReady(client);

        // Sign on the transaction using a private key of the Panacea account
        StdFee fee = new StdFee("umed", "10000", "200000");
        StdTx tx = new StdTx(msg, fee, "");
        tx.sign(wallet);
        wallet.increaseAccountSequence();

        // Broadcast the transaction and Get a response
        BroadcastReq req = new BroadcastReq(tx, "block");
        TxResponse res = client.broadcast(req);
        assertEquals(0, res.getCode());
        System.out.println(res);
        System.out.println(res.getTx());

        // Check if the DID was registered successfully by getting its DID Document
        DidDocumentWithMeta documentWithMeta = client.getDidDocument(doc.getId());
        assertEquals(new Long(0), documentWithMeta.getSequence());
        assertEquals(doc, documentWithMeta.getDocument());
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
