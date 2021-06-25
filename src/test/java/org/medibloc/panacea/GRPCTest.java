package org.medibloc.panacea;

import com.google.protobuf.ByteString;
import cosmos.auth.v1beta1.BaseAccount;
import cosmos.bank.v1beta1.MsgSend;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.base.v1beta1.Coin;
import cosmos.tx.v1beta1.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.medibloc.panacea.domain.Coins;
import org.medibloc.panacea.domain.Transactions;
import org.medibloc.panacea.utils.CryptoUtils;
import panacea.aol.v2.MsgAddRecord;
import tendermint.p2p.DefaultNodeInfo;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

public class GRPCTest {
    // owner mnemonic
    String ownerMnemonic = "genuine key outside escape oval unhappy mansion cricket practice quarter purchase picnic layer bicycle stem soup column creek convince obey rather rice there alcohol";
    String ownerAddress;

    // to mnemonic
    String toMnemonic = "margin river antenna nest drama combine crystal clarify route country genuine acoustic hold ocean image fox flame invite scrub chalk destroy resource item final";
    String toAddress;

    private PanaceaGrpcClient client;
    private Wallet ownerWallet;
    private Wallet toWallet;

    @Before
    public void setUp() throws PanaceaApiException {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9090")
                .usePlaintext()
                .build();
        this.client = new PanaceaGrpcClient(channel);
        this.ownerWallet = Wallet.createWalletFromMnemonicCode(ownerMnemonic, "panacea", 0);
        this.ownerWallet.ensureWalletIsReady(client);
        this.ownerAddress = ownerWallet.getAddress();
        this.toWallet = Wallet.createWalletFromMnemonicCode(toMnemonic, "panacea", 0);
        this.toWallet.ensureWalletIsReady(client);
        this.toAddress = toWallet.getAddress();
    }

    @Test
    public void testGetAccount() throws Exception {
        BaseAccount account = client.getAccount(ownerAddress);
        Assert.assertEquals(ownerAddress, account.getAddress());
        String publicKey = CryptoUtils.getPublicKeyFrom(account);
        Assert.assertNotNull(publicKey);

        BaseAccount account2 = client.getAccount(toAddress);
        Assert.assertEquals(toAddress, account2.getAddress());
        Assert.assertNotNull(CryptoUtils.getPublicKeyFrom(account2));
    }

    @Test
    public void testGetNodeInfo() {
        DefaultNodeInfo nodeInfo = client.getNodeInfo();
        Assert.assertNotNull(nodeInfo.getDefaultNodeId());
        Assert.assertNotNull(nodeInfo.getListenAddr());
        Assert.assertNotNull(nodeInfo.getNetwork());
        Assert.assertNotNull(nodeInfo.getVersion());

        System.out.println(nodeInfo.getDefaultNodeId());
        System.out.println(nodeInfo.getListenAddr());
        System.out.println(nodeInfo.getNetwork());
        System.out.println(nodeInfo.getProtocolVersion());
        System.out.println(nodeInfo);
    }

    @Test
    public void testSendMsg() throws PanaceaApiException, IOException, NoSuchAlgorithmException {
        Coin sendCoin = Coins.createCoin("umed", "100000000");
        MsgSend msg = MsgSend.newBuilder()
                .addAmount(sendCoin)
                .setFromAddress(ownerAddress)
                .setToAddress(toAddress)
                .build();
        String memo = "send msg";
        Coin feeCoin = Coins.createCoin("umed", "1000");
        long gasLimit = 200000;

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                ownerWallet,
                msg,
                memo,
                feeCoin,
                gasLimit,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        TxResponse response = client.broadcast(request);
        System.out.println(response.toString());
    }

    @Test
    public void testSendMsgs() throws PanaceaApiException, IOException, NoSuchAlgorithmException {
        Coin sendCoin = Coins.createCoin("umed", "100000000");
        MsgSend msg = MsgSend.newBuilder()
                .addAmount(sendCoin)
                .setFromAddress(ownerAddress)
                .setToAddress(toAddress)
                .build();
        String memo = "send msg";
        Coin feeCoin = Coins.createCoin("umed", "1000");
        long gasLimit = 200000;

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                ownerWallet,
                Arrays.asList(msg, msg),
                memo,
                feeCoin,
                gasLimit,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        TxResponse response = client.broadcast(request);
        System.out.println(response.toString());
    }

    @Test
    public void testAddRecord() throws IOException, NoSuchAlgorithmException {
        // create txBody
        MsgAddRecord msg = MsgAddRecord.newBuilder()
                .setOwnerAddress(ownerAddress)
                .setTopicName("test")
                .setKey(ByteString.copyFromUtf8("key1"))
                .setValue(ByteString.copyFromUtf8("data1"))
                .setWriterAddress(ownerAddress)
                .setFeePayerAddress(toAddress)
                .build();
        String memo = "add record";
        List<Wallet> groupSignWallets = Arrays.asList(toWallet, ownerWallet);
        Coin feeCoin = Coins.createCoin("umed", "1000");
        long gasLimit = 200000;

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                groupSignWallets,
                msg,
                memo,
                feeCoin,
                gasLimit,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        TxResponse response = client.broadcast(request);
        System.out.println(response.toString());
        Assert.assertNotNull(response.getTxhash());
        Assert.assertEquals(0, response.getCode());
    }
}
