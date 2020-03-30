package org.medibloc.panacea.local;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.medibloc.panacea.*;
import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.domain.bucket.Bucket;
import org.medibloc.panacea.domain.bucket.BucketObject;
import org.medibloc.panacea.domain.bucket.BucketOwner;
import org.medibloc.panacea.domain.bucket.BucketWriter;
import org.medibloc.panacea.domain.message.*;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class BucketTest {
    private PanaceaApiRestClient restClient = null;

    private StdTx stdTx = null;

    @Before
    public void setup() {
        restClient = PanaceaApiClientFactory.newInstance()
                .newRestClient(
                        PanaceaEnvironment.LOCAL.getBaseUrl()
                );
    }

    @Test
    public void testGetOwners() throws PanaceaApiException {
        Res<List<BucketOwner>> owners = restClient.getOwners();
        System.out.println(owners);
        Assert.assertNotNull(owners);
    }

    @Test
    public void testGetOwner() throws PanaceaApiException {
        Res<BucketOwner> owner = restClient.getOwner("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        System.out.println(owner);
        Assert.assertNotNull(owner);
    }

    @Test
    public void testGetTxsByAction() throws PanaceaApiException {
        SearchTxsResult result = restClient.getTxsByAction("send", 1L, 30L);
        System.out.println(result);
        Assert.assertNotNull(result);
        SearchTxsResult result2 = restClient.getTxsByAction("create_topic", 1L, 30L);
        System.out.println(result2);
        Assert.assertNotNull(result2);
    }

    @Test
    public void testGetBucketObject() throws PanaceaApiException {
        Res<BucketObject> bucketObject = restClient.getBucketObject("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g", "key");
        System.out.println(bucketObject);
        Assert.assertNotNull(bucketObject);
    }

    @Test
    public void testGetBucketObjects() throws PanaceaApiException {
        Res<List<BucketObject>> bucketObjects = restClient.getBucketObjects(
                "panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g",
                "1234"
        );
        System.out.println(bucketObjects);
        Assert.assertNotNull(bucketObjects);
    }

    @Test
    public void testGetBucketWriters() throws PanaceaApiException {
        Res<List<BucketWriter>> bucketWriters = restClient.getBucketWriters("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g","1234");
        System.out.println(bucketWriters);
        Assert.assertNotNull(bucketWriters);
    }

    @Test
    public void testGetBucketWriter() throws PanaceaApiException {
        Res<BucketWriter> bucketWriter = restClient.getBucketWriter("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g","1234",
                "panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        System.out.println(bucketWriter);
        Assert.assertNotNull(bucketWriter);
    }

    @Test
    public void testGetBuckets() throws PanaceaApiException {
        Res<List<Bucket>> buckets = restClient.getBuckets("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        System.out.println(buckets);
        Assert.assertNotNull(buckets);
    }

    @Test
    public void testGetBucket() throws PanaceaApiException {
        Res<Bucket> bucket = restClient.getBucket("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g", "1234");
        System.out.println(bucket);
        Assert.assertNotNull(bucket);
    }

    @Test
    public void testCreateBucket() throws PanaceaApiException {
        MsgCreateBucket msg = new MsgCreateBucket();
        MsgCreateBucket.Value value = new MsgCreateBucket.Value();
        value.setBucket_name("123ab");
        value.setBucket_owner("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setDescription("test bucket");
        msg.setValue(value);
        broadcastMsgSync(msg);
    }

    @Test
    public void testDeleteBucket() throws PanaceaApiException {
        MsgDeleteBucket msg = new MsgDeleteBucket();
        MsgDeleteBucket.Value value = new MsgDeleteBucket.Value();
        value.setBucket_name("123ab");
        value.setOwner_address("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        msg.setValue(value);
        broadcastMsgSync(msg);
    }

    @Test
    public void testAddWriter() throws PanaceaApiException {
        MsgAddWriter msg = new MsgAddWriter();
        MsgAddWriter.Value value = new MsgAddWriter.Value();
        value.setOwnerAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setTopicName("123ab");
        value.setWriterAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setDescription("ownerWriter");
        value.setMoniker("gg");
        msg.setValue(value);
        broadcastMsgSync(msg);
    }

    @Test
    public void testRemoveWriter() throws PanaceaApiException {
        MsgRemoveWriter msg = new MsgRemoveWriter();
        MsgRemoveWriter.Value value = new MsgRemoveWriter.Value();
        value.setBucket_name("123ab");
        value.setOwner_address("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setWriter_address("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        msg.setValue(value);
        broadcastMsgSync(msg);
    }

    @Test
    public void testCreateObject() throws PanaceaApiException {
        MsgCreateObject msg = new MsgCreateObject();
        MsgCreateObject.Value value = new MsgCreateObject.Value();
        value.setBucket_name("123ab");
        value.setOwner_address("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setWriter_address("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setKey("key11");
        value.setValue("22value");
        broadcastMsgSync(msg);
    }

    @Test
    public void testDeleteObject() throws PanaceaApiException {
        MsgDeleteObject msg = new MsgDeleteObject();
        MsgDeleteObject.Value value = new MsgDeleteObject.Value();
        value.setBucket_name("123ab");
        value.setOwner_address("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setWriter_address("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setKey("key11");
        broadcastMsgSync(msg);
    }

    @Test
    public void testUpdateObject() throws PanaceaApiException {
    }


    private void broadcastMsgSync(PanaceaTransactionMessage msg) throws PanaceaApiException {
        StdFee fee = new StdFee("umed", "10000", "80000");

        String mnemonic = "giraffe wreck kit enemy anger nephew silk sphere tuna tube lady evil market lizard humor usage sand cattle wedding access wall basket define fresh";

        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, "panacea");
        wallet.ensureWalletIsReady(restClient);

        StdTx tx = new StdTx(msg, fee, "");

        try {
            tx.sign(wallet);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        wallet.increaseAccountSequence();

        BroadcastReq req = new BroadcastReq(tx, "block");

        TxResponse res = restClient.broadcast(req);
        System.out.println(res);
    }

}
