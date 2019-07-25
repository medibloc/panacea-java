package org.medibloc.panacea.api.client;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.junit.Test;
import org.medibloc.panacea.api.client.domain.Record;
import org.medibloc.panacea.api.client.domain.Transfer;
import org.medibloc.panacea.api.client.domain.TxResponse;
import org.medibloc.panacea.api.client.encoding.EncodeUtils;
import org.medibloc.panacea.api.client.encoding.message.*;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PanaceaApiRestClientTest {
    String[] mnemonic = {"enemy","segment","cupboard","fault","basic","ahead","fine","office",
                        "ask","evidence","fortune","loan","tragic","pride","umbrella","stable",
                        "weather","barrel","network","noodle","choose","argue","animal","twenty"};
    @Test
    public void testGetAccount() {
        // client
        PanaceaApiRestClient client = PanaceaApiClientFactory.newInstance().newRestClient("http://localhost:1317");
        try {
//            Account account = client.getAccount("panacea1mm72d9c36zwszcck34nyl49j32hxx6jfhfs52l");

            // Msgs
            Transfer transfer = new Transfer();
            transfer.setAmount("1000");
            transfer.setDenom("nmed");
            transfer.setFromAddress("panacea1mm72d9c36zwszcck34nyl49j32hxx6jfhfs52l");
            transfer.setToAddress("panacea1nmmdwc00cg9tp3hzaahyte7vpvjrp2vtkn84z8");
            PanaceaTransactionMessage msg = createMsgSend(transfer);

            // Fee
            StdFee fee = new StdFee("nmed", "10000", "200000");

            // Wallet
            Wallet wallet = Wallet.createWalletFromMnemonicCode(Arrays.asList(mnemonic), "panacea");
            wallet.ensureWalletIsReady(client);

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
        } catch (PanaceaApiException | NoSuchAlgorithmException | IOException e) {
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
                    "panacea1mm72d9c36zwszcck34nyl49j32hxx6jfhfs52l",
                    "");

            StdFee fee = new StdFee("umed", "10000", "200000");

            Wallet wallet = Wallet.createWalletFromMnemonicCode(Arrays.asList(mnemonic), "panacea");
            wallet.ensureWalletIsReady(client);

            StdTx tx = new StdTx(msg, fee, "");

            tx.sign(wallet);
            wallet.increaseAccountSequence();

            BroadcastReq req = new BroadcastReq(tx, "block");

            TxResponse res = client.broadcast(req);
            byte[] data = Hex.decodeHex(res.getData());

            ResAddRecord msgRes = EncodeUtils.toObjectFromJsonString(new String(data), ResAddRecord.class);

            Record rec = client.getRecord(msgRes.getValue().getOwnerAddress(), msgRes.getValue().getTopicName(), msgRes.getValue().getOffset());
            System.out.println(new String(rec.getKey()));
            System.out.println(new String(rec.getValue()));
            System.out.println(rec);
        } catch (PanaceaApiException | NoSuchAlgorithmException | IOException | DecoderException e) {
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