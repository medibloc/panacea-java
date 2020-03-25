package org.medibloc.panacea;

import org.junit.Before;
import org.junit.Test;
import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.encoding.Crypto;
import org.medibloc.panacea.domain.message.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PanaceaApiRestClientTest {


    String mnemonic = "genuine key outside escape oval unhappy mansion cricket practice quarter purchase picnic layer bicycle stem soup column creek convince obey rather rice there alcohol";

    private PanaceaApiRestClient restClient = null;

    @Before
    public void setup() {
        restClient = PanaceaApiClientFactory.newInstance().newRestClient("http://52.78.196.16:1317");
    }

    @Test
    public void testGetAccountTestnet() throws PanaceaApiException {
        AccountResponse acc = restClient.getAccount("panacea1tkat7m78exe89jkx40e3c7rurytu5pukajdamq");
        System.out.println(acc);

        BlockInfo bi = restClient.getBlockByHeight(3171824L);
        System.out.println(bi);

        BlockInfo latestBlock = restClient.getLatestBlock();
        System.out.println(latestBlock);
    }

    @Test
    public void testGetTxsByHeight() throws PanaceaApiException {
        SearchTxsResult txs = restClient.getTxsByHeight(3171824L);
        System.out.println(txs);
    }

    @Test
    public void testGetAccount() {
        // client
        PanaceaApiRestClient client = PanaceaApiClientFactory.newInstance().newRestClient("http://localhost:1317");
        try {
            System.out.println(Crypto.generateMnemonicCodeFromEntropy("asjdkfjafahkdfhdsakjhfkadshfkjasdhfkjsdhfkjsadhfkjhkjwehrkqwhaekjhakjsdhfkdsahfksadhkf".getBytes()));
            System.out.println(Wallet.createWalletFromEntropy("panacea", "asjdkfjafahkdfhdsakjhfkadshfkjasdhfkjsdhfkjsadhfkjhkjwehrkqwhaekjhakjsdhfkdsahfksadhkf".getBytes()));
            AccountResponse accountResponse = client.getAccount("panacea1tkat7m78exe89jkx40e3c7rurytu5pukajdamq");
            System.out.println(accountResponse);

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
            SearchTxsResult res = client.broadcast(req);
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

            SearchTxsResult res = client.broadcast(req);
            System.out.println(res);
//            System.out.println(res.getTx());
//            byte[] data = Hex.decodeHex(res.getData());

//            ResAddRecord msgRes = EncodeUtils.toObjectFromJsonString(new String(data), ResAddRecord.class);

//            Record rec = client.getRecord(msgRes.getValue().getOwnerAddress(), msgRes.getValue().getTopicName(), msgRes.getValue().getOffset());
//            System.out.println(new String(rec.getKey()));
//            System.out.println(new String(rec.getValue()));
//            System.out.println(rec);
//
//
//            TxResponse txRes = client.getTxResponse(res.getTxHash());
//            System.out.println(txRes);
//
//            PanaceaTransactionMessage txMsg = txRes.getTx().getValue().getMsgs()[0];
//            System.out.println(txMsg.getType());
//            if (txMsg.getType() == "aol/MsgAddRecord") {
//                MsgAddRecord m = (MsgAddRecord) txMsg;
//                System.out.println(new String(m.getValue().getKey()));
//                System.out.println(new String(m.getValue().getValue()));
//            } else if (txMsg.getType() == "cosmos-sdk/MsgSend") {
//                MsgSend m = (MsgSend) txMsg;
//                System.out.println(m.getValue().getAmount());
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }

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