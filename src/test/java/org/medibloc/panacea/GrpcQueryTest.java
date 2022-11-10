package org.medibloc.panacea;

import cosmos.auth.v1beta1.BaseAccount;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.base.query.v1beta1.PageRequest;
import cosmos.base.v1beta1.Coin;
import cosmos.tx.v1beta1.BroadcastMode;
import cosmos.tx.v1beta1.BroadcastTxRequest;
import cosmos.tx.v1beta1.Fee;
import cosmos.tx.v1beta1.GetTxsEventResponse;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.medibloc.panacea.domain.Coins;
import org.medibloc.panacea.domain.Transactions;
import org.medibloc.panacea.utils.CryptoUtils;
import panacea.aol.v2.MsgCreateTopic;
import tendermint.p2p.DefaultNodeInfo;
import tendermint.types.Block;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GrpcQueryTest extends AbstractGrpcTest {

    @Test
    public void testGetAccount() throws Exception {
        String ownerAddress = getWallet(TestConst.ownerMnemonic).getAddress();
        String toAddress = getWallet(TestConst.toMnemonic).getAddress();

        BaseAccount account = client.getAccount(ownerAddress);
        Assert.assertEquals(ownerAddress, account.getAddress());
        String publicKey = CryptoUtils.getPublicKeyFrom(account);
        Assert.assertNotNull(publicKey);

        BaseAccount account2 = client.getAccount(toAddress);
        Assert.assertEquals(toAddress, account2.getAddress());
    }

    @Test
    public void testGetBalance() throws PanaceaApiException {
        String ownerAddress = getWallet(TestConst.ownerMnemonic).getAddress();
        Coin ownerCoin = client.getBalance(ownerAddress, TestConst.denom);
        Assert.assertEquals(TestConst.denom, ownerCoin.getDenom());
        Assert.assertNotNull(ownerCoin.getAmount());
        System.out.println(ownerCoin);
    }

    @Test
    public void testGetNodeInfo() {
        DefaultNodeInfo nodeInfo = client.getNodeInfo();
        Assert.assertNotNull(nodeInfo.getDefaultNodeId());
        Assert.assertNotNull(nodeInfo.getListenAddr());
        Assert.assertNotNull(nodeInfo.getNetwork());
        Assert.assertNotNull(nodeInfo.getVersion());
    }

    @Test
    public void testGetTxResponseByHash() throws PanaceaApiException, IOException, NoSuchAlgorithmException, InterruptedException {
        TxResponse sendTx = simpleSendTx();
        TimeUnit.SECONDS.sleep(1);
        TxResponse txResponse = client.getTxResponse(sendTx.getTxhash());
        System.out.println(txResponse);
    }

    private TxResponse simpleSendTx() throws PanaceaApiException, IOException, NoSuchAlgorithmException {
        Wallet ownerWallet = getWallet(TestConst.ownerMnemonic);
        String ownerAddress = ownerWallet.getAddress();

        String topicName = RandomStringUtils.randomAlphabetic(10);
        System.out.printf("Create topic : %s\n", topicName);

        MsgCreateTopic createTopicMsg = MsgCreateTopic.newBuilder()
                .setTopicName(topicName)
                .setDescription("test topic")
                .setOwnerAddress(ownerAddress)
                .build();

        String memo = "create topic :" + createTopicMsg.getTopicName();
        Fee fee = Transactions.createFee(Coins.createCoin(TestConst.denom, "1000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                getWallet(TestConst.ownerMnemonic),
                createTopicMsg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        return  client.broadcast(request);
    }

    @Test
    public void testGetTxResponsesByHeight() throws PanaceaApiException, IOException, NoSuchAlgorithmException, InterruptedException {
        TxResponse txResp = simpleSendTx();
        TimeUnit.SECONDS.sleep(1);

        List<TxResponse> txResponses = client.getTxResponsesByHeight(txResp.getHeight());
        Assert.assertEquals(1, txResponses.size());
        Assert.assertEquals(txResp.getTxhash(), txResponses.get(0).getTxhash());
    }

    @Test
    public void testGetTxsByHeightWithPagination() throws PanaceaApiException, IOException, NoSuchAlgorithmException, InterruptedException {
        TxResponse txResp = simpleSendTx();
        TimeUnit.SECONDS.sleep(1);

        PageRequest pagination = PageRequest.newBuilder().setOffset(0).setLimit(10).setCountTotal(true).build();
        GetTxsEventResponse resp = client.getTxsByHeight(txResp.getHeight(), pagination);
        Assert.assertEquals(1, resp.getTxsCount());
        Assert.assertEquals(txResp.getTxhash(), resp.getTxResponsesList().get(0).getTxhash());
        Assert.assertEquals(1, resp.getPagination().getTotal());
        System.out.println("next key: " + resp.getPagination().getNextKey());
    }

    @Test
    public void testGetBlockByHeight() {
        Block block = client.getBlockByHeight(1);
        System.out.println(block);
    }

    @Test
    public void testGetLatestBlock() {
        Block block = client.getLatestBlock();
        System.out.println(block);
    }
}
