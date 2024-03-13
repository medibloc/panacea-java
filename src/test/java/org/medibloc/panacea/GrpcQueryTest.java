package org.medibloc.panacea;

import cosmos.auth.v1beta1.BaseAccount;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.base.v1beta1.Coin;
import cosmos.tx.v1beta1.BroadcastMode;
import cosmos.tx.v1beta1.BroadcastTxRequest;
import cosmos.tx.v1beta1.Fee;
import cosmos.tx.v1beta1.Tx;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.medibloc.panacea.domain.Coins;
import org.medibloc.panacea.domain.Transactions;
import org.medibloc.panacea.utils.CryptoUtils;
import org.medibloc.panacea.utils.TxUtils;
import panacea.aol.v2.MsgCreateTopicRequest;
import tendermint.p2p.DefaultNodeInfo;
import tendermint.types.Block;

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
    public void testGetTxResponseByHash() throws Exception {
        TxResponse txResp = broadcastCreateTopicTx(TestConst.ownerMnemonic, BroadcastMode.BROADCAST_MODE_SYNC);
        txResp = TxUtils.pollTxResponse(client, txResp.getTxhash(), 10, 1000);
        TxResponse txResponse = client.getTxResponse(txResp.getTxhash());
        Assert.assertEquals(0, txResponse.getCode());
    }

    private TxResponse broadcastCreateTopicTx(String mnemonic, BroadcastMode broadcastMode) throws Exception {
        Wallet wallet = getWallet(mnemonic);

        String topicName = RandomStringUtils.randomAlphabetic(10);

        MsgCreateTopicRequest createTopicMsg = MsgCreateTopicRequest.newBuilder()
                .setTopicName(topicName)
                .setDescription("test topic")
                .setOwnerAddress(wallet.getAddress())
                .build();

        String memo = "create topic :" + createTopicMsg.getTopicName();
        Fee fee = Transactions.createFee(Coins.createCoin(TestConst.denom, "1000000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                wallet,
                createTopicMsg,
                memo,
                fee,
                broadcastMode);

        return client.broadcast(request);
    }

    @Test
    public void testGetTxResponsesByHeight() throws Exception {
        TxResponse txResp = broadcastCreateTopicTx(TestConst.ownerMnemonic, BroadcastMode.BROADCAST_MODE_SYNC);
        txResp = TxUtils.pollTxResponse(client, txResp.getTxhash(), 10, 1000);

        List<TxResponse> txResponses = client.getTxResponsesByHeight(txResp.getHeight());
        Assert.assertEquals(1, txResponses.size());
        Assert.assertEquals(txResp.getTxhash(), txResponses.get(0).getTxhash());
    }

    @Test
    public void testGetTxsByHeightWithPagination() throws Exception {
        TxResponse txResp1 = broadcastCreateTopicTx(TestConst.ownerMnemonic, BroadcastMode.BROADCAST_MODE_SYNC);
        TxResponse txResp2 = broadcastCreateTopicTx(TestConst.toMnemonic, BroadcastMode.BROADCAST_MODE_SYNC);
        txResp1 = TxUtils.pollTxResponse(client, txResp1.getTxhash(), 10, 1000);
        txResp2 = TxUtils.pollTxResponse(client, txResp2.getTxhash(), 10, 1000);

        System.out.println(txResp1.getTxhash() + " " + txResp2.getTxhash());
        System.out.println(txResp1.getHeight() + " " + txResp2.getHeight());

        long height = txResp1.getHeight();
        List<Tx> resp = client.getTxsByHeight(height);
        Assert.assertEquals(2, resp.size());
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
