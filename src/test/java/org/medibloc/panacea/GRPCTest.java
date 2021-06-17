package org.medibloc.panacea;

import com.google.protobuf.Any;
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
import org.medibloc.panacea.utils.CryptoUtils;
import tendermint.p2p.DefaultNodeInfo;

public class GRPCTest {
    private PanaceaGrpcClient client;

    @Before
    public void setUp() {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9090")
                .usePlaintext()
                .build();
        client = new PanaceaGrpcClient(channel);
    }

    @Test
    public void testGetAccount() throws Exception {
        BaseAccount account = client.getAccount("panacea1qtq6dmy7gz4fmgkfxla4wd37ln2zgxh3qp3z8p");
        Assert.assertEquals("panacea1qtq6dmy7gz4fmgkfxla4wd37ln2zgxh3qp3z8p", account.getAddress());
        Assert.assertEquals(1, account.getSequence());
        String publicKey = CryptoUtils.getPublicKeyFrom(account);
        Assert.assertEquals("AxyXiMTIHiB3lsHRlgPfMtzlh0TMGzX0WuXfIXzrWnih", publicKey);
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
    public void testSendMsg() throws PanaceaApiException {

        Coin coin = Coin.newBuilder()
                .setDenom("umed")
                .setAmount("1000")
                .build();
        MsgSend msg = MsgSend.newBuilder()
                .addAmount(coin)
                .setFromAddress("panacea1gtx6lmnjg6ykvv07ruyxamth6yuhgcvmhg3pqz")
                .setToAddress("panacea1qtq6dmy7gz4fmgkfxla4wd37ln2zgxh3qp3z8p")
                .build();
        TxBody txBody = TxBody.newBuilder()
                .addMessages(Any.pack(msg, ""))
                .setMemo("send msg")
                .build();
        Fee fee = Fee.newBuilder()
                .addAmount(coin)
                .setGasLimit(200000)
                .build();
        AuthInfo autoInfo = AuthInfo.newBuilder()
                .setFee(fee)
                .addSignerInfos(SignerInfo.newBuilder()
                        .setPublicKey(pubKey)
                        .build())
                .build();
        DefaultNodeInfo nodeInfo = client.getNodeInfo();
        BaseAccount account = client.getAccount("panacea1gtx6lmnjg6ykvv07ruyxamth6yuhgcvmhg3pqz");
        SignDoc sign = SignDoc.newBuilder()
                .setAccountNumber(account.getAccountNumber())
                .setChainId(nodeInfo.getDefaultNodeId())
                .setBodyBytes(txBody.toByteString())
                .setAuthInfoBytes(autoInfo.toByteString())
                .build();

        Tx tx = Tx.newBuilder()
                .setBody(txBody)
                .setAuthInfo(autoInfo)
                .addSignatures(sign.toByteString())
                .build();

        BroadcastTxRequest request = BroadcastTxRequest.newBuilder()
                .setMode(BroadcastMode.BROADCAST_MODE_SYNC)
                .setTxBytes(tx.toByteString())
                .build();


        TxResponse response = client.broadCast(request);
        System.out.println(response);


    }


}
