package org.medibloc.panacea.api.client;

import org.junit.Test;
import org.medibloc.panacea.api.client.domain.Account;
import org.medibloc.panacea.api.client.domain.Transfer;
import org.medibloc.panacea.api.client.domain.TxResponse;
import org.medibloc.panacea.api.client.encoding.message.*;

import java.util.Collections;
import java.util.List;

public class PanaceaApiRestClientTest {
    @Test
    public void testGetAccount() {
        PanaceaApiRestClient client = PanaceaApiClientFactory.newInstance().newRestClient("http://localhost:1317");
        try {
            Account account = client.getAccount("panacea1mm72d9c36zwszcck34nyl49j32hxx6jfhfs52l");
            System.out.println(account);

            Transfer transfer = new Transfer();
            transfer.setAmount("1000");
            transfer.setDenom("nmed");
            transfer.setFromAddress("panacea1mm72d9c36zwszcck34nyl49j32hxx6jfhfs52l");
            transfer.setToAddress("panacea1nmmdwc00cg9tp3hzaahyte7vpvjrp2vtkn84z8");

            PanaceaTransactionMessage[] msgs = {createMsgSend(transfer)};

            Coin coin = new Coin();
            coin.setDenom("nmed");
            coin.setAmount("10000");
            List<Coin> amount = Collections.singletonList(coin);
            StdFee fee = new StdFee();
            fee.setAmount(amount);
            fee.setGas("1000");

            StdTx tx = createStdTx(msgs, fee, "");
            BroadcastReq req = createBroadCastReq(tx, "block");
            TxResponse res = client.broadcast(req);
            System.out.println(res);
        } catch (PanaceaApiException e) {
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