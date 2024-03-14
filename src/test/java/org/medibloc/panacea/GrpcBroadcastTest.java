package org.medibloc.panacea;

import cosmos.bank.v1beta1.Input;
import cosmos.bank.v1beta1.MsgMultiSend;
import cosmos.bank.v1beta1.MsgSend;
import cosmos.bank.v1beta1.Output;
import cosmos.base.abci.v1beta1.Attribute;
import cosmos.base.abci.v1beta1.StringEvent;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.base.v1beta1.Coin;
import cosmos.tx.v1beta1.BroadcastMode;
import cosmos.tx.v1beta1.BroadcastTxRequest;
import cosmos.tx.v1beta1.Fee;
import cosmos.tx.v1beta1.Tx;
import org.junit.Assert;
import org.junit.Test;
import org.medibloc.panacea.domain.Coins;
import org.medibloc.panacea.domain.Transactions;
import org.medibloc.panacea.utils.TxUtils;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class GrpcBroadcastTest extends AbstractGrpcTest {
    @Test
    public void testSendMsg() throws Exception {
        Wallet ownerWallet = getWallet(TestConst.ownerMnemonic);
        String ownerAddress = ownerWallet.getAddress();
        Wallet toWallet = getWallet(TestConst.toMnemonic);
        String toAddress = toWallet.getAddress();

        Coin sendCoin = Coins.createCoin(TestConst.denom, "100000000");
        MsgSend msg = MsgSend.newBuilder()
                .addAmount(sendCoin)
                .setFromAddress(ownerAddress)
                .setToAddress(toAddress)
                .build();
        String memo = "send msg";
        Fee fee = Transactions.createFee(Coins.createCoin(TestConst.denom, "1000000"), 200000);
        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                ownerWallet,
                msg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_SYNC);

        TxResponse response = client.broadcast(request);
        Assert.assertEquals(0, response.getCode());
        response = TxUtils.pollTxResponse(this.client, response.getTxhash(), 10, 1000);

        Map<String, List<Attribute>> eventMap = response.getLogsList().stream()
                .flatMap(abciMessageLog -> abciMessageLog.getEventsList().stream())
                .collect(Collectors.toMap(
                        StringEvent::getType,
                        StringEvent::getAttributesList,
                        (firstList, secondList) -> firstList
                ));

        List<Attribute> messageEvent = eventMap.get("message");
        Assert.assertEquals("action", messageEvent.get(0).getKey());
        Assert.assertEquals("/cosmos.bank.v1beta1.MsgSend", messageEvent.get(0).getValue());
        Assert.assertEquals("sender", messageEvent.get(1).getKey());
        Assert.assertEquals(ownerAddress, messageEvent.get(1).getValue());
        Assert.assertEquals("module", messageEvent.get(2).getKey());
        Assert.assertEquals("bank", messageEvent.get(2).getValue());

        List<Attribute> transferEvent = eventMap.get("transfer");
        Assert.assertEquals("recipient", transferEvent.get(0).getKey());
        Assert.assertEquals(toAddress, transferEvent.get(0).getValue());
        Assert.assertEquals("sender", transferEvent.get(1).getKey());
        Assert.assertEquals(ownerAddress, transferEvent.get(1).getValue());
        Assert.assertEquals("amount", transferEvent.get(2).getKey());
        Assert.assertEquals(String.format("%s%s", sendCoin.getAmount(), sendCoin.getDenom()), transferEvent.get(2).getValue());

        Tx tx = response.getTx().unpack(Tx.class);
        Assert.assertEquals(memo, tx.getBody().getMemo());
        Assert.assertEquals(1, tx.getBody().getMessagesCount());
        Assert.assertEquals(fee, tx.getAuthInfo().getFee());
    }

    @Test
    public void testSendMsgs() throws Exception {
        Wallet ownerWallet = getWallet(TestConst.ownerMnemonic);
        Wallet toWallet = getWallet(TestConst.toMnemonic);

        Coin sendCoin = Coins.createCoin(TestConst.denom, "100000000");
        MsgSend msg = MsgSend.newBuilder()
                .addAmount(sendCoin)
                .setFromAddress(ownerWallet.getAddress())
                .setToAddress(toWallet.getAddress())
                .build();
        String memo = "send msgs";
        Fee fee = Transactions.createFee(Coins.createCoin(TestConst.denom, "1000000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                ownerWallet,
                Arrays.asList(msg, msg),
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_SYNC);

        TxResponse response = client.broadcast(request);
        Assert.assertEquals(0, response.getCode());
        response = TxUtils.pollTxResponse(this.client, response.getTxhash(), 10, 1000);
        Tx tx = response.getTx().unpack(Tx.class);
        Assert.assertEquals(memo, tx.getBody().getMemo());

        Assert.assertEquals(memo, tx.getBody().getMemo());
        Assert.assertEquals(2, tx.getBody().getMessagesCount());
        Assert.assertEquals(fee, tx.getAuthInfo().getFee());
    }

    @Test
    public void testMultiSend() throws Exception {
        Wallet ownerWallet = getWallet(TestConst.ownerMnemonic);
        Wallet toWallet = getWallet(TestConst.toMnemonic);


        MsgMultiSend msg = MsgMultiSend.newBuilder()
                .addInputs(Input.newBuilder()
                        .setAddress(ownerWallet.getAddress())
                        .addCoins(Coins.createCoin(TestConst.denom, "2000000"))
                        .build())
                .addOutputs(Output.newBuilder()
                        .setAddress(toWallet.getAddress())
                        .addCoins(Coins.createCoin(TestConst.denom, "1000000"))
                        .build())
                .addOutputs(Output.newBuilder()
                        .setAddress("panacea136e7cal0p66vrrk5plvtkay5t2j6xwx4zmx6e6")
                        .addCoins(Coins.createCoin(TestConst.denom, "1000000"))
                        .build())
                .build();
        TxResponse response = broadcast(ownerWallet, "multi send", msg);
        System.out.println(response);
    }
}
