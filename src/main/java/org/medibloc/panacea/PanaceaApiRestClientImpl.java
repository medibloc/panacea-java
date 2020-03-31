package org.medibloc.panacea;


import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.domain.aol.AolWriter;
import org.medibloc.panacea.domain.aol.Record;
import org.medibloc.panacea.domain.aol.Topic;
import org.medibloc.panacea.domain.bucket.Bucket;
import org.medibloc.panacea.domain.bucket.BucketObject;
import org.medibloc.panacea.domain.bucket.BucketOwner;
import org.medibloc.panacea.domain.bucket.BucketWriter;
import org.medibloc.panacea.domain.model.response.NodeInfoResponse;
import org.medibloc.panacea.domain.model.response.RecordResponse;
import org.medibloc.panacea.domain.model.response.Res;

import java.util.ArrayList;
import java.util.List;

/**
 * Panacea API rest client, supporting synchronous/blocking access Panacea's REST API.
 */
public class PanaceaApiRestClientImpl implements PanaceaApiRestClient {

    private PanaceaApi panaceaApi;

    public PanaceaApiRestClientImpl(String baseUrl) {
        this.panaceaApi = PanaceaApiClientGenerator.createService(PanaceaApi.class, baseUrl);
    }

    @Override
    public Account getAccount(String address) throws PanaceaApiException {
        Res<Account> resAccount = PanaceaApiClientGenerator.executeSync(panaceaApi.getAccount(address));
        return resAccount.getResult();
    }

    @Override
    public NodeInfo getNodeInfo() throws PanaceaApiException {
        NodeInfoResponse nodeInfo = PanaceaApiClientGenerator.executeSync(panaceaApi.getNodeInfo());
        return nodeInfo.getNodeInfo();
    }

    @Override
    public TxResponse broadcast(BroadcastReq req) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.broadcast(req));
    }

    @Override
    public Record getRecord(String ownerAddress, String topicName, Long offset) throws PanaceaApiException {
        Res<RecordResponse> recordResponse = PanaceaApiClientGenerator.executeSync(panaceaApi.getRecord(ownerAddress, topicName, offset));
        Record record = new Record();
        record.setWriterAddress(recordResponse.getResult().getWriterAddress());
        record.setNanoTimestamp(recordResponse.getResult().getNanoTimestamp());
        record.setKey(recordResponse.getResult().getKey());
        record.setValue(recordResponse.getResult().getValue());
        return record;
    }

    @Override
    public TxResponse getTxResponse(String txHash) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getTxResponse(txHash));
    }

    @Override
    public BlockInfo getBlockByHeight(Long height) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getBlockByHeight(height));
    }

    @Override
    public BlockInfo getLatestBlock() throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getLatestBlock());
    }

    @Override
    public List<TxResponse> getTxsByHeight(Long height) throws PanaceaApiException {

        List<TxResponse> txResponses = new ArrayList<TxResponse>();
        SearchTxsResult txsResult;

        for (int i = 1;; i++) {
            txsResult = PanaceaApiClientGenerator.executeSync(panaceaApi.getTxsByHeight(height, i));

            txResponses.addAll(txsResult.getTxs());
            if (txsResult.getTxs().size() < 30) {
                break;
            }
        }

        return txResponses;
    }

    @Override
    public Res<List<Topic>> getTopics(String ownerAddress) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getTopics(ownerAddress));
    }

    @Override
    public Res<Topic> getTopic(String ownerAddress) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getTopic(ownerAddress));
    }

    @Override
    public Res<List<String>> getAolWriters(String ownerAddress, String topic) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getWriters(ownerAddress, topic));
    }

    @Override
    public Res<AolWriter> getAolWriter(String ownerAddress) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getWriter(ownerAddress));
    }

    @Override
    public Res<BucketObject> getBucketObject(String ownerAddr, String objectKey) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getBucketObject(ownerAddr, objectKey));
    }

    @Override
    public Res<List<BucketObject>> getBucketObjects(String ownerAddr, String bucketName) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getBucketObjects(ownerAddr, bucketName));
    }

    @Override
    public Res<List<BucketWriter>> getBucketWriters(String ownerAddr, String bucketName) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getBucketWriters(ownerAddr, bucketName));
    }

    @Override
    public Res<BucketWriter> getBucketWriter(String ownerAddr, String bucketName, String writerAddr) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getBucketWriter(ownerAddr, bucketName, writerAddr));
    }

    @Override
    public Res<List<Bucket>> getBuckets(String ownerAddr) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getBuckets(ownerAddr));
    }

    @Override
    public Res<Bucket> getBucket(String ownerAddr, String bucketName) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getBucket(ownerAddr, bucketName));
    }

    @Override
    public Res<List<BucketOwner>> getOwners() throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getOwners());
    }

    @Override
    public Res<BucketOwner> getOwner(String ownerAddr) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getOwner(ownerAddr));
    }
}
