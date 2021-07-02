package org.medibloc.panacea;

import cosmos.auth.v1beta1.BaseAccount;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.base.v1beta1.Coin;
import org.junit.Assert;
import org.junit.Test;
import org.medibloc.panacea.utils.CryptoUtils;
import tendermint.p2p.DefaultNodeInfo;
import tendermint.types.Block;

import java.util.List;

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
        Assert.assertNotNull(CryptoUtils.getPublicKeyFrom(account2));
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
    public void testGetTxResponseByHash() {
        TxResponse txResponse = client.getTxResponse("30FAB3C12B46C0424D04006557028872D0F2674F8B9E695A722383F3CA2078FB");
        System.out.println(txResponse);
    }

    @Test
    public void testGetTxResponsesByHeight() {
        List<TxResponse> txResponses = client.getTxResponsesByHeight(10367);
        System.out.println(txResponses);
    }

    @Test
    public void testGetBlockByHeight() {
        Block block = client.getBlockByHeight(10);
        System.out.println(block);
    }

    @Test
    public void testGetLatestBlock() {
        Block block = client.getLatestBlock();
        System.out.println(block);
    }
}
