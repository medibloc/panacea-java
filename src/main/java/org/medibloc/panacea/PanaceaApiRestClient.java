package org.medibloc.panacea;

import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.domain.aol.AolWriter;
import org.medibloc.panacea.domain.aol.Record;
import org.medibloc.panacea.domain.aol.Topic;
import org.medibloc.panacea.domain.bucket.Bucket;
import org.medibloc.panacea.domain.bucket.BucketObject;
import org.medibloc.panacea.domain.bucket.BucketOwner;
import org.medibloc.panacea.domain.bucket.BucketWriter;
import org.medibloc.panacea.domain.model.response.Res;

import java.util.List;

public interface PanaceaApiRestClient {

    Account getAccount(String address) throws PanaceaApiException;

    NodeInfo getNodeInfo() throws PanaceaApiException;

    TxResponse broadcast(BroadcastReq req) throws PanaceaApiException;

    Record getRecord(String ownerAddress, String topicName, Long offset) throws PanaceaApiException;

    TxResponse getTxResponse(String txHash) throws PanaceaApiException;

    BlockInfo getBlockByHeight(Long height) throws PanaceaApiException;

    BlockInfo getLatestBlock() throws PanaceaApiException;

    List<TxResponse> getTxsByHeight(Long height) throws PanaceaApiException;


    Res<List<Topic>> getTopics(String ownerAddress) throws PanaceaApiException;

    Res<Topic> getTopic(String ownerAddress) throws PanaceaApiException;

    Res<List<String>> getAolWriters(String ownerAddress, String topic) throws PanaceaApiException;

    Res<AolWriter> getAolWriter(String ownerAddress) throws PanaceaApiException;

    /**
     ****************************** Bucket *******************************
     */

    Res<BucketObject> getBucketObject(String ownerAddr, String objectKey) throws PanaceaApiException;

    Res<List<BucketObject>> getBucketObjects(String ownerAddr, String bucketName) throws PanaceaApiException;

    Res<List<BucketWriter>> getBucketWriters(String ownerAddr, String bucketName) throws PanaceaApiException;

    Res<BucketWriter> getBucketWriter(String ownerAddr, String bucketName, String writerAddr) throws PanaceaApiException;

    Res<List<Bucket>> getBuckets(String ownerAddr) throws PanaceaApiException;

    Res<Bucket> getBucket(String ownerAddr, String bucketName) throws PanaceaApiException;

    Res<List<BucketOwner>> getOwners() throws PanaceaApiException;

    Res<BucketOwner> getOwner(String ownerAddr) throws PanaceaApiException;
}
