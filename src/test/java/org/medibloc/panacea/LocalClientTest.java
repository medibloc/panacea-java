package org.medibloc.panacea;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.domain.aol.RecordResponse;
import org.medibloc.panacea.domain.StdTx;
import org.medibloc.panacea.domain.bucket.Bucket;
import org.medibloc.panacea.domain.bucket.BucketObject;
import org.medibloc.panacea.domain.bucket.BucketWriter;

import java.security.acl.Owner;
import java.util.List;

public class LocalClientTest {

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
    public void testGetAccount() throws PanaceaApiException {
        AccountResponse acc = restClient.getAccount("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        System.out.println(acc);
        Assert.assertNotNull(acc);
    }

    @Test
    public void testGetNodeInfo() throws PanaceaApiException {
        NodeInfoResponse nodeInfo = restClient.getNodeInfo();
        System.out.println(nodeInfo);
        Assert.assertNotNull(nodeInfo);
    }

    @Test
    public void testGetRecord() throws PanaceaApiException {
        RecordResponse record = restClient.getRecord("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g", "abc", 0L);
        System.out.println(record);
        Assert.assertNotNull(record);
    }

    @Test
    public void testBlockInfo() throws PanaceaApiException {
        BlockInfo latestBlock = restClient.getLatestBlock();
        System.out.println(latestBlock);
        Assert.assertNotNull(latestBlock);
    }

    @Test
    public void testBroadcast() throws PanaceaApiException {
        BroadcastReq req = new BroadcastReq(stdTx, "block"); // todo sync async 모델도 같은지 테스트
        SearchTxsResult res = restClient.broadcast(req);
        System.out.println(res);

        BroadcastReq syncReq = new BroadcastReq(stdTx, "sync");
        SearchTxsResult syncRes = restClient.broadcast(syncReq);
        System.out.println(syncRes);

        BroadcastReq asyncReq = new BroadcastReq(stdTx, "async");
        SearchTxsResult asyncRes = restClient.broadcast(asyncReq);
        System.out.println(asyncRes);
    }

    @Test
    public void testGetTxResponse() throws PanaceaApiException {
        String txHash = "192C1AF789D035FCA7C9374EEACBAC23817BB2ED18938027BB2ACF04B492A89F";

        TxResponse res = restClient.getTxResponse(txHash);
        System.out.println(res);
        Assert.assertNotNull(res);
    }

    @Test
    public void testGetBlockByHeight() throws PanaceaApiException {
        BlockInfo blockInfo = restClient.getBlockByHeight(123L);
        System.out.println(blockInfo);
        Assert.assertNotNull(blockInfo);
    }

    @Test
    public void testGetLatestBlock() throws PanaceaApiException {
        BlockInfo latestBlock = restClient.getLatestBlock();
        System.out.println(latestBlock);
        Assert.assertNotNull(latestBlock);
    }

    @Test
    public void testGetTxsByHeight() throws PanaceaApiException {
        SearchTxsResult responses = restClient.getTxsByHeight(4911L);
        System.out.println(responses);
        Assert.assertNotNull(responses);
    }

    @Test
    public void testGetTxsByAction() throws PanaceaApiException {
        List<TxResponse> txResponse = restClient.getTxsByAction("", 0L, 0L);
        System.out.println(txResponse);
    }

    @Test
    public void testGetBucketObject() throws PanaceaApiException {
        BucketObject bucketObject = restClient.getBucketObject("", "");
        System.out.println(bucketObject);
    }

    @Test
    public void testGetBucketObjects() throws PanaceaApiException {
        List<BucketObject> bucketObjects = restClient.getBucketObjects("");
        System.out.println(bucketObjects);
    }

    @Test
    public void testGetBucketWriters() throws PanaceaApiException {
        List<BucketWriter> bucketWriters = restClient.getBucketWriters("","");
        System.out.println(bucketWriters);
    }

    @Test
    public void testGetBucketWriter() throws PanaceaApiException {
        BucketWriter bucketWriter = restClient.getBucketWriter("");
        System.out.println(bucketWriter);
    }

    @Test
    public void testGetBucket() throws PanaceaApiException {
        List<Bucket> buckets = restClient.getBucket("");
        System.out.println(buckets);
    }

    @Test
    public void testGetOwner() throws PanaceaApiException {
        List<Owner> owners = restClient.getOwner();
        System.out.println(owners);
    }



}
