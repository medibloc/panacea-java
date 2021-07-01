package org.medibloc.panacea;

import cosmos.bank.v1beta1.MsgSend;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.base.v1beta1.Coin;
import cosmos.tx.v1beta1.BroadcastMode;
import cosmos.tx.v1beta1.BroadcastTxRequest;
import cosmos.tx.v1beta1.Fee;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.medibloc.panacea.domain.Coins;
import org.medibloc.panacea.domain.Transactions;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GrpcBroadcastTest {
    private PanaceaGrpcClient client;

    @Before
    public void setUp() {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9090")
                .usePlaintext()
                .build();
        this.client = new PanaceaGrpcClient(channel);
    }

    private Wallet getWallet(String mnemonic) throws PanaceaApiException {
        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, "panacea", 0);
        wallet.ensureWalletIsReady(client);
        return wallet;
    }

    @Test
    public void testSendMsg() throws PanaceaApiException, IOException, NoSuchAlgorithmException {
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
        Fee fee = Transactions.createFee(Coins.createCoin(TestConst.denom, "1000"), 200000);
        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                ownerWallet,
                msg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        TxResponse response = client.broadcast(request);
        Assert.assertEquals(0, response.getCode());
        System.out.println(response);
    }

    @Test
    public void testSendMsgs() throws PanaceaApiException, IOException, NoSuchAlgorithmException {
        Wallet ownerWallet = getWallet(TestConst.ownerMnemonic);
        Wallet toWallet = getWallet(TestConst.toMnemonic);

        Coin sendCoin = Coins.createCoin(TestConst.denom, "100000000");
        MsgSend msg = MsgSend.newBuilder()
                .addAmount(sendCoin)
                .setFromAddress(ownerWallet.getAddress())
                .setToAddress(toWallet.getAddress())
                .build();
        String memo = "send msg";
        Fee fee = Transactions.createFee(Coins.createCoin(TestConst.denom, "1000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                ownerWallet,
                Arrays.asList(msg, msg),
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        TxResponse response = client.broadcast(request);
        Assert.assertEquals(0, response.getCode());
        System.out.println(response);
    }

}
