package org.medibloc.panacea;

import com.google.protobuf.ByteString;
import cosmos.auth.v1beta1.BaseAccount;
import cosmos.bank.v1beta1.MsgSend;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.base.v1beta1.Coin;
import cosmos.tx.v1beta1.BroadcastMode;
import cosmos.tx.v1beta1.BroadcastTxRequest;
import cosmos.tx.v1beta1.Fee;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.medibloc.panacea.domain.Coins;
import org.medibloc.panacea.domain.DIDs;
import org.medibloc.panacea.domain.Transactions;
import org.medibloc.panacea.utils.CryptoUtils;
import panacea.aol.v2.*;
import panacea.did.v2.*;
import tendermint.p2p.DefaultNodeInfo;
import tendermint.types.Block;
import panacea.aol.v2.MsgAddRecord;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

public class GRPCTest {
    // owner mnemonic
    private final String ownerMnemonic = "genuine key outside escape oval unhappy mansion cricket practice quarter purchase picnic layer bicycle stem soup column creek convince obey rather rice there alcohol";
    private final String toMnemonic = "margin river antenna nest drama combine crystal clarify route country genuine acoustic hold ocean image fox flame invite scrub chalk destroy resource item final";

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
    public void testGetAccount() throws Exception {
        String ownerAddress = getWallet(ownerMnemonic).getAddress();
        String toAddress = getWallet(toMnemonic).getAddress();

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
    }

    @Test
    public void testSendMsg() throws PanaceaApiException, IOException, NoSuchAlgorithmException {
        Wallet ownerWallet = getWallet(ownerMnemonic);
        String ownerAddress = ownerWallet.getAddress();
        Wallet toWallet = getWallet(ownerMnemonic);
        String toAddress = toWallet.getAddress();

        Coin sendCoin = Coins.createCoin("umed", "100000000");
        MsgSend msg = MsgSend.newBuilder()
                .addAmount(sendCoin)
                .setFromAddress(ownerAddress)
                .setToAddress(toAddress)
                .build();
        String memo = "send msg";
        Fee fee = Transactions.createFee(Coins.createCoin("umed", "1000"), 200000);
        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                ownerWallet,
                msg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        TxResponse response = client.broadcast(request);
        System.out.println(response.toString());
    }

    @Test
    public void testSendMsgs() throws PanaceaApiException, IOException, NoSuchAlgorithmException {
        Wallet ownerWallet = getWallet(ownerMnemonic);
        Wallet toWallet = getWallet(toMnemonic);

        Coin sendCoin = Coins.createCoin("umed", "100000000");
        MsgSend msg = MsgSend.newBuilder()
                .addAmount(sendCoin)
                .setFromAddress(ownerWallet.getAddress())
                .setToAddress(toWallet.getAddress())
                .build();
        String memo = "send msg";
        Fee fee = Transactions.createFee(Coins.createCoin("umed", "1000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                ownerWallet,
                Arrays.asList(msg, msg),
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        TxResponse response = client.broadcast(request);
        System.out.println(response.toString());
    }

    @Test
    public void testAol() throws IOException, NoSuchAlgorithmException, PanaceaApiException {
        Wallet ownerWallet = getWallet(ownerMnemonic);
        String ownerAddress = ownerWallet.getAddress();
        Wallet toWallet = getWallet(toMnemonic);
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
        testAddRecord(addRecordMsg);
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
        Fee fee = Transactions.createFee(Coins.createCoin("umed", "1000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                getWallet(ownerMnemonic),
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
        Fee fee = Transactions.createFee(Coins.createCoin("umed", "1000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                getWallet(ownerMnemonic),
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
        Fee fee = Transactions.createFee(Coins.createCoin("umed", "1000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                getWallet(ownerMnemonic),
                msg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        TxResponse response = client.broadcast(request);
        System.out.println(response.toString());
        Assert.assertNotNull(response.getTxhash());
        Assert.assertEquals(0, response.getCode());
    }

    private void testAddRecord(MsgAddRecord msg) throws PanaceaApiException, IOException, NoSuchAlgorithmException {
        String memo = "add record";
        List<Wallet> groupSignWallets = Arrays.asList(
                getWallet(toMnemonic), getWallet(ownerMnemonic));
        Fee fee = Transactions.createFee(Coins.createCoin("umed", "1000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                groupSignWallets,
                msg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        TxResponse response = client.broadcast(request);
        System.out.println(response.toString());
        Assert.assertNotNull(response.getTxhash());
        Assert.assertEquals(0, response.getCode());
    }

    private void testGetTopic(String topicName, long totalWriters, long totalRecords, String description) throws PanaceaApiException {
        Wallet ownerWallet = getWallet(ownerMnemonic);
        String ownerAddress = ownerWallet.getAddress();

        Topic topic1 = client.getTopic(ownerAddress, topicName);
        Assert.assertEquals(totalWriters, topic1.getTotalWriters());
        Assert.assertEquals(totalRecords, topic1.getTotalRecords());
        Assert.assertEquals(description, topic1.getDescription());
    }

    @Test
    public void testDid() throws NoSuchAlgorithmException, IOException, PanaceaApiException {
        DIDWallet didWallet = DIDWallet.createRandomWallet();
        String did = DIDs.createDID(didWallet.getPubKeyBytes());

        DIDDocument createDoc = DIDs.createDIDDocument(did, didWallet);
        System.out.println(createDoc);

        testCreateDID(didWallet, createDoc);

        testCheckedDID(createDoc, 0);

        DIDWallet updateDIDWallet = DIDWallet.createRandomWallet();
        VerificationMethod key2Method = DIDs.createVerificationMethod(did, updateDIDWallet, "key2");
        VerificationRelationship key2Relationship = DIDs.createVerificationRelationship(DIDs.createVerificationMethod(did, updateDIDWallet, "key2"));
        DIDDocument updateDoc = DIDDocument.newBuilder(createDoc)
                .addVerificationMethods(key2Method)
                .addAuthentications(key2Relationship)
                .build();
        System.out.println(updateDoc);

        testUpdateDID(didWallet, updateDoc, 0);

        testCheckedDID(updateDoc, 1);
    }

    @Test
    public void testGetTxResponseByHash() {
        TxResponse txResponse = client.getTxResponse("A78719222BB3A93706AE6017CEC23C02AD5BA974741273A2616901FAECA631D7");
        System.out.println(txResponse);
    }

    @Test
    public void testGetTxResponsesByHeight() {
        List<TxResponse> txResponses = client.getTxResponsesByHeight(10367);
        System.out.println(txResponses);
    }

    @Test
    public void testGetBlockByHeight() {
        Block block = client.getBlockByHeight(10367);
        System.out.println(block);
    }

    @Test
    public void testGetLatestBlock() {
        Block block = client.getLatestBlock();
        System.out.println(block);
    }

    private void testCreateDID(DIDWallet createDIDWallet, DIDDocument createDoc) throws IOException, NoSuchAlgorithmException, PanaceaApiException {
        Wallet ownerWallet = getWallet(ownerMnemonic);
        String ownerAddress = ownerWallet.getAddress();

        DataWithSeq dataWithSeq = DataWithSeq.newBuilder()
                .setData(createDoc.toByteString())
                .setSeq(0)
                .build();
        byte[] signature = createDIDWallet.sign(dataWithSeq.toByteArray());
        MsgCreateDID msg = MsgCreateDID.newBuilder()
                .setDocument(createDoc)
                .setVerificationMethodID(createDoc.getVerificationMethods(0).getID())
                .setDID(createDoc.getID())
                .setSignature(ByteString.copyFrom(signature))
                .setFromAddress(ownerAddress)
                .build();
        String memo = "create did";
        Fee fee = Transactions.createFee(Coins.createCoin("umed", "1000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                ownerWallet,
                msg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_BLOCK);

        TxResponse response = client.broadcast(request);

        System.out.println(response.toString());
        Assert.assertNotNull(response.getTxhash());
        Assert.assertEquals(0, response.getCode());
    }

    private void testUpdateDID(DIDWallet didWallet, DIDDocument doc, long seq) throws IOException, NoSuchAlgorithmException, PanaceaApiException {
        Wallet ownerWallet = getWallet(ownerMnemonic);
        String ownerAddress = ownerWallet.getAddress();

        DataWithSeq dataWithSeq = DataWithSeq.newBuilder()
                .setData(doc.toByteString())
                .setSeq(seq)
                .build();

        byte[] updateSignature = didWallet.sign(dataWithSeq.toByteArray());

        MsgUpdateDID msg = MsgUpdateDID.newBuilder()
                .setDID(doc.getID())
                .setDocument(doc)
                .setVerificationMethodID(doc.getVerificationMethods(0).getID())
                .setSignature(ByteString.copyFrom(updateSignature))
                .setFromAddress(ownerAddress)
                .build();
        String memo = "update did";
        Fee fee = Transactions.createFee(Coins.createCoin("umed", "1000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                ownerWallet,
                msg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_BLOCK);
        TxResponse response = client.broadcast(request);
        System.out.println(response.toString());
        Assert.assertNotNull(response.getTxhash());
        Assert.assertEquals(0, response.getCode());
    }

    private void testCheckedDID(DIDDocument createDoc, long seq) {
        DIDDocumentWithSeq createdDocWithSeq = client.getDIDDocumentWithSeq(createDoc.getID());
        Assert.assertEquals(seq, createdDocWithSeq.getSeq());
        Assert.assertEquals(createDoc.toString(), createdDocWithSeq.getDocument().toString());
    }
}
