package org.medibloc.panacea;

import com.google.protobuf.ByteString;
import cosmos.base.abci.v1beta1.TxMsgData;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.tx.v1beta1.BroadcastMode;
import cosmos.tx.v1beta1.BroadcastTxRequest;
import cosmos.tx.v1beta1.Fee;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.medibloc.panacea.domain.Coins;
import org.medibloc.panacea.domain.Transactions;
import panacea.aol.v2.*;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GrpcAolTest extends AbstractGrpcTest {

    @Test
    public void testAol() throws Exception {
        Wallet ownerWallet = getWallet(TestConst.ownerMnemonic);
        String ownerAddress = ownerWallet.getAddress();
        Wallet toWallet = getWallet(TestConst.toMnemonic);
        String toAddress = toWallet.getAddress();

        String topicName = RandomStringUtils.randomAlphabetic(10);
        System.out.printf("Create topic : %s\n", topicName);

        MsgCreateTopic createTopicMsg = MsgCreateTopic.newBuilder()
                .setTopicName(topicName)
                .setDescription("test topic")
                .setOwnerAddress(ownerAddress)
                .build();
        testCreateTopic(createTopicMsg);
        testGetTopic(topicName, 0, 0, createTopicMsg.getDescription());

        MsgAddWriter addWriterMsg = MsgAddWriter.newBuilder()
                .setWriterAddress(ownerAddress)
                .setDescription("test add writer")
                .setTopicName(topicName)
                .setOwnerAddress(ownerAddress)
                .build();
        testAddWriter(addWriterMsg);
        testGetTopic(topicName, 1, 0, createTopicMsg.getDescription());

        String key = "key1";
        String value = "value";
        MsgAddRecord addRecordMsg = MsgAddRecord.newBuilder()
                .setOwnerAddress(ownerAddress)
                .setTopicName(topicName)
                .setKey(ByteString.copyFromUtf8(key))
                .setValue(ByteString.copyFromUtf8(value))
                .setWriterAddress(ownerAddress)
                .setFeePayerAddress(toAddress)
                .build();
        testAddRecord(addRecordMsg, 0);
        testGetTopic(topicName, 1, 1, createTopicMsg.getDescription());

        MsgDeleteWriter deleteWriteMsg = MsgDeleteWriter.newBuilder()
                .setTopicName(topicName)
                .setOwnerAddress(ownerAddress)
                .setWriterAddress(ownerAddress)
                .build();
        testDeleteWriter(deleteWriteMsg);
        testGetTopic(topicName, 0, 1, createTopicMsg.getDescription());
    }

    private void testDeleteWriter(MsgDeleteWriter deleteWriteMsg) throws IOException, NoSuchAlgorithmException, PanaceaApiException {
        String memo = "remove writer";
        Fee fee = Transactions.createFee(Coins.createCoin(TestConst.denom, "1000000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                getWallet(TestConst.ownerMnemonic),
                deleteWriteMsg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        TxResponse response = client.broadcast(request);
        System.out.println(response.toString());
        Assert.assertNotNull(response.getTxhash());
        Assert.assertEquals(0, response.getCode());
    }

    private void testCreateTopic(MsgCreateTopic createTopicMsg) throws IOException, NoSuchAlgorithmException, PanaceaApiException {
        String memo = "create topic :" + createTopicMsg.getTopicName();
        Fee fee = Transactions.createFee(Coins.createCoin(TestConst.denom, "1000000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                getWallet(TestConst.ownerMnemonic),
                createTopicMsg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        TxResponse response = client.broadcast(request);
        System.out.println(response.toString());
        Assert.assertNotNull(response.getTxhash());
        Assert.assertEquals(0, response.getCode());
    }

    private void testAddWriter(MsgAddWriter msg) throws IOException, NoSuchAlgorithmException, PanaceaApiException {
        String memo = "add writer";
        Fee fee = Transactions.createFee(Coins.createCoin(TestConst.denom, "1000000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                getWallet(TestConst.ownerMnemonic),
                msg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        TxResponse response = client.broadcast(request);
        System.out.println(response.toString());
        Assert.assertNotNull(response.getTxhash());
        Assert.assertEquals(0, response.getCode());
    }

    private void testAddRecord(MsgAddRecord msg, long expectedOffset) throws Exception {
        String memo = "add record";
        List<Wallet> groupSignWallets = Arrays.asList(
                getWallet(TestConst.toMnemonic), getWallet(TestConst.ownerMnemonic));
        Fee fee = Transactions.createFee(Coins.createCoin("umed", "1000000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                groupSignWallets,
                msg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_SYNC);  // Used the sync mode as an example

        TxResponse response = client.broadcast(request);
        System.out.println(response.toString());
        Assert.assertNotNull(response.getTxhash());
        Assert.assertEquals(0, response.getCode());

        response = pollTxResponse(response.getTxhash(), 10, 1000);
        TxMsgData txMsgData = TxMsgData.parseFrom(Hex.decodeHex(response.getData()));
        MsgAddRecordResponse msgRes = MsgAddRecordResponse.parseFrom(txMsgData.getData(0).getData());
        Assert.assertEquals(expectedOffset, msgRes.getOffset());
    }

    private TxResponse pollTxResponse(String txHash, int maxTries, int sleepMs) throws Exception {
        // This test code does polling to wait until the tx is included in the block.
        // But, in real world, pls use more fancy ways such as async jobs.
        for (int tries = 0; tries < maxTries; tries++) {
            try {
                return client.getTxResponse(txHash);
            } catch (StatusRuntimeException e) {
                // if tx was not found (if tx isn't included in the block yet)
                if (e.getStatus().getCode().equals(Status.Code.NOT_FOUND)) {
                    Thread.sleep(sleepMs);
                    continue;
                }
                throw e;
            }
        }

        throw new Exception("tx not found. maxTries: " + maxTries);
    }

    private void testGetTopic(String topicName, long totalWriters, long totalRecords, String description) throws PanaceaApiException {
        Wallet ownerWallet = getWallet(TestConst.ownerMnemonic);
        String ownerAddress = ownerWallet.getAddress();

        Topic topic1 = client.getTopic(ownerAddress, topicName);
        Assert.assertEquals(totalWriters, topic1.getTotalWriters());
        Assert.assertEquals(totalRecords, topic1.getTotalRecords());
        Assert.assertEquals(description, topic1.getDescription());
    }

}
