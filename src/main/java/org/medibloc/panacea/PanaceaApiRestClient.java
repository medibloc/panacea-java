package org.medibloc.panacea;

import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.domain.aol.RecordResponse;
import org.medibloc.panacea.domain.bucket.Bucket;
import org.medibloc.panacea.domain.bucket.BucketObject;
import org.medibloc.panacea.domain.bucket.BucketWriter;
import org.medibloc.panacea.domain.BroadcastReq;

import java.security.acl.Owner;
import java.util.List;

public interface PanaceaApiRestClient {
    AccountResponse getAccount(String address) throws PanaceaApiException;

    NodeInfoResponse getNodeInfo() throws PanaceaApiException;

    SearchTxsResult broadcast(BroadcastReq req) throws PanaceaApiException;

    RecordResponse getRecord(String ownerAddress, String topicName, Long offset) throws PanaceaApiException;

    TxResponse getTxResponse(String txHash) throws PanaceaApiException;

    BlockInfo getBlockByHeight(Long height) throws PanaceaApiException;

    BlockInfo getLatestBlock() throws PanaceaApiException;

    SearchTxsResult getTxsByHeight(Long height) throws PanaceaApiException;

    List<TxResponse> getTxsByAction(String action, Long page, Long limit) throws PanaceaApiException;

    BucketObject getBucketObject(String ownerAddr, String objectKey) throws PanaceaApiException;

    List<BucketObject> getBucketObjects(String ownerAddr) throws PanaceaApiException;

    List<BucketWriter> getBucketWriters(String ownerAddr, String bucketName) throws PanaceaApiException;

    BucketWriter getBucketWriter(String ownerAddr) throws PanaceaApiException;

    List<Bucket> getBucket(String ownerAddr) throws PanaceaApiException;

    List<Owner> getOwner() throws PanaceaApiException;

    
}
