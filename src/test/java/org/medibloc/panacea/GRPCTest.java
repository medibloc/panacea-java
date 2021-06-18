package org.medibloc.panacea;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import cosmos.auth.v1beta1.BaseAccount;
import cosmos.bank.v1beta1.MsgSend;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.base.v1beta1.Coin;
import cosmos.crypto.secp256k1.Keys;
import cosmos.tx.signing.v1beta1.SignMode;
import cosmos.tx.v1beta1.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.medibloc.panacea.domain.Wallet;
import org.medibloc.panacea.utils.CryptoUtils;
import tendermint.p2p.DefaultNodeInfo;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

public class GRPCTest {
    String mnemonic = "genuine key outside escape oval unhappy mansion cricket practice quarter purchase picnic layer bicycle stem soup column creek convince obey rather rice there alcohol";
    String mnemonic2 = "margin river antenna nest drama combine crystal clarify route country genuine acoustic hold ocean image fox flame invite scrub chalk destroy resource item final";

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
        BaseAccount account = client.getAccount("panacea1gtx6lmnjg6ykvv07ruyxamth6yuhgcvmhg3pqz");
        Assert.assertEquals("panacea1gtx6lmnjg6ykvv07ruyxamth6yuhgcvmhg3pqz", account.getAddress());
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
    public void testSendMsg() throws PanaceaApiException, IOException, NoSuchAlgorithmException {

        Coin coin = Coin.newBuilder()
                .setDenom("umed")
                .setAmount("1000")
                .build();
        MsgSend msg = MsgSend.newBuilder()
                .addAmount(coin)
                .setFromAddress("panacea1gtx6lmnjg6ykvv07ruyxamth6yuhgcvmhg3pqz")
                .setToAddress("panacea1rwxd29u3cmsuh9gmmrzlujl2e5lc8p33flpz2e")
                .build();
        TxBody txBody = TxBody.newBuilder()
                .addMessages(Any.pack(msg, ""))
                .setMemo("send msg")
                .build();
        Fee fee = Fee.newBuilder()
                .addAmount(coin)
                .setGasLimit(200000)
                .build();

        Wallet wallet = Wallet.createWalletFromMnemonicCode(Arrays.asList(mnemonic.split("\\s+")), "panacea", 0);
        wallet.ensureWalletIsReady(client);

        System.out.println(wallet.getPubKeyBech32());
        System.out.println(wallet.getPubKeyForSign().getKey().toStringUtf8());
        System.out.println(wallet.getPrivateKeyHexString());

        AuthInfo autoInfo = AuthInfo.newBuilder()
                .setFee(fee)
                .addSignerInfos(SignerInfo.newBuilder()
                        .setPublicKey(Any.pack(wallet.getPubKeyForSign(), ""))
                        .setModeInfo(ModeInfo.newBuilder()
                                .setSingle(ModeInfo.Single.newBuilder()
                                        .setMode(SignMode.SIGN_MODE_DIRECT)
                                        .build())

                        .build())
                        .setSequence(wallet.getSequence())
                        .build())
                .build();
        DefaultNodeInfo nodeInfo = client.getNodeInfo();

        SignDoc sign = SignDoc.newBuilder()
                .setAccountNumber(wallet.getAccountNumber())
                .setChainId(nodeInfo.getDefaultNodeId())
                .setBodyBytes(txBody.toByteString())
                .setAuthInfoBytes(autoInfo.toByteString())
                .build();

        Tx tx = Tx.newBuilder()
                .setBody(txBody)
                .setAuthInfo(autoInfo)
                .addSignatures(ByteString.copyFrom(wallet.sign(sign.toByteArray())))
                .build();

        BroadcastTxRequest request = BroadcastTxRequest.newBuilder()
                .setMode(BroadcastMode.BROADCAST_MODE_SYNC)
                .setTxBytes(tx.toByteString())
                .build();


        TxResponse response = client.broadCast(request);
        System.out.println(response);


    }

    private Keys.PrivKey create(List<String> words, String hrp, int index) {
        String privateKey = CryptoUtils.getPrivateKeyFromMnemonicCode(words, index);
        return Keys.PrivKey.newBuilder().setKey(ByteString.copyFromUtf8(privateKey)).build();
    }


}
