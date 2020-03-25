package org.medibloc.panacea;


import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.domain.aol.RecordResponse;
import org.medibloc.panacea.domain.bucket.Bucket;
import org.medibloc.panacea.domain.bucket.BucketObject;
import org.medibloc.panacea.domain.bucket.BucketWriter;
import org.medibloc.panacea.domain.BroadcastReq;

import java.security.acl.Owner;
import java.util.List;

/**
 * Panacea API rest client, supporting synchronous/blocking access Panacea's REST API.
 */
public class PanaceaApiRestClientImpl implements PanaceaApiRestClient {
    private PanaceaApi panaceaApi;

    public PanaceaApiRestClientImpl(String baseUrl) {
        this.panaceaApi = PanaceaApiClientGenerator.createService(PanaceaApi.class, baseUrl);
    }

    public AccountResponse getAccount(String address) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getAccount(address));
    }

    public NodeInfoResponse getNodeInfo() throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getNodeInfo());
    }

    public SearchTxsResult broadcast(BroadcastReq req) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.broadcast(req));
    }

    public RecordResponse getRecord(String ownerAddress, String topicName, Long offset) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getRecord(ownerAddress, topicName, offset));
    }

    public TxResponse getTxResponse(String txHash) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getTxResponse(txHash));
    }

    public BlockInfo getBlockByHeight(Long height) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getBlockByHeight(height));
    }

    public BlockInfo getLatestBlock() throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getLatestBlock());
    }

    public SearchTxsResult getTxsByHeight(Long height) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getTxsByHeight(height));
    }

    public List<TxResponse> getTxsByAction(String action, Long page, Long limit) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getTxsByAction(action, page, limit));
    }

    @Override
    public BucketObject getBucketObject(String ownerAddr, String objectKey) throws PanaceaApiException {
        return null;
    }

    @Override
    public List<BucketObject> getBucketObjects(String ownerAddr) throws PanaceaApiException {
        return null;
    }

    @Override
    public List<BucketWriter> getBucketWriters(String ownerAddr, String bucketName) throws PanaceaApiException {
        return null;
    }

    @Override
    public BucketWriter getBucketWriter(String ownerAddr) throws PanaceaApiException {
        return null;
    }

    @Override
    public List<Bucket> getBucket(String ownerAddr) throws PanaceaApiException {
        return null;
    }

    @Override
    public List<Owner> getOwner() throws PanaceaApiException {
        return null;
    }
}
