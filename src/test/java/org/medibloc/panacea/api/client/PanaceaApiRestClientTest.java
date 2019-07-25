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
            PanaceaTransactionMessage[] msgs = {createMsgSend(transfer)};

            // Fee
            Coin coin = new Coin();
            coin.setDenom("nmed");
            coin.setAmount("10000");
            List<Coin> amount = Collections.singletonList(coin);
            StdFee fee = new StdFee();
            fee.setAmount(amount);
            fee.setGas("200000");

            // Wallet
            Wallet wallet = Wallet.createWalletFromMnemonicCode(Arrays.asList(mnemonic), "panacea");
            wallet.ensureWalletIsReady(client);

            // StdTx
            StdTx tx = createStdTx(msgs, fee, "");

            // Sign
            tx.sign(wallet);
            wallet.increaseAccountSequence();

            // Broadcast Request
            BroadcastReq req = createBroadCastReq(tx, "block");

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
            MsgAddRecord msg = new MsgAddRecord();

            MsgAddRecord.Value value = new MsgAddRecord.Value();
            value.setOwnerAddress("panacea1mm72d9c36zwszcck34nyl49j32hxx6jfhfs52l");
            value.setTopicName("test");
            value.setKey("key1".getBytes());
            value.setValue("aaaa".getBytes());
            value.setWriterAddress("panacea1mm72d9c36zwszcck34nyl49j32hxx6jfhfs52l");
            msg.setValue(value);

            Coin coin = new Coin();
            coin.setDenom("nmed");
            coin.setAmount("10000");
            List<Coin> amount = Collections.singletonList(coin);
            StdFee fee = new StdFee();
            fee.setAmount(amount);
            fee.setGas("200000");

            Wallet wallet = Wallet.createWalletFromMnemonicCode(Arrays.asList(mnemonic), "panacea");
            wallet.ensureWalletIsReady(client);

            StdTx tx = createStdTx(new PanaceaTransactionMessage[]{msg}, fee, "");

            tx.sign(wallet);
            wallet.increaseAccountSequence();

            BroadcastReq req = createBroadCastReq(tx, "block");

            TxResponse res = client.broadcast(req);
            byte[] data = Hex.decodeHex(res.getData());
            System.out.println(new String(data));

            MsgAddRecordResponse msgRes = EncodeUtils.toObjectFromJsonString(new String(data), MsgAddRecordResponse.class);
            System.out.println(msgRes);

            Record rec = client.getRecord(msgRes.getValue().getOwnerAddress(), msgRes.getValue().getTopicName(), msgRes.getValue().getOffset());
            System.out.println(new String(rec.getKey()));
            System.out.println(new String(rec.getValue()));
            System.out.println(rec);

        } catch (PanaceaApiException | NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        } catch (DecoderException e) {
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

    private StdTx createStdTx(PanaceaTransactionMessage[] msgs, StdFee fee, String memo) {
        StdTx stdTx = new StdTx();
        stdTx.setMsgs(msgs);
        stdTx.setFee(fee);
        stdTx.setMemo(memo);
        return stdTx;
    }

    private StdTx signStdTx(StdTx stdTx) {
        return stdTx;
    }

    private BroadcastReq createBroadCastReq(StdTx stdTx, String mode) {
        BroadcastReq req = new BroadcastReq();
        req.setMode(mode);
        req.setTx(stdTx);
        return req;
    }
}