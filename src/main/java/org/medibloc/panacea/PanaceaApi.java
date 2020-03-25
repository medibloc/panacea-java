package org.medibloc.panacea;

import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.domain.aol.RecordResponse;
import org.medibloc.panacea.domain.aol.Topic;
import org.medibloc.panacea.domain.aol.Writer;
import org.medibloc.panacea.domain.bucket.Bucket;
import org.medibloc.panacea.domain.bucket.BucketObject;
import org.medibloc.panacea.domain.bucket.BucketWriter;
import org.medibloc.panacea.domain.BroadcastReq;
import retrofit2.Call;
import retrofit2.http.*;

import java.security.acl.Owner;
import java.util.List;

public interface PanaceaApi {
    @GET("auth/accounts/{address}")
    Call<AccountResponse> getAccount(@Path("address") String address);

    @GET("node_info")
    Call<NodeInfoResponse> getNodeInfo();

    @POST("txs")
    Call<SearchTxsResult> broadcast(@Body BroadcastReq req);

    @GET("txs/{hash}")
    Call<TxResponse> getTxResponse(@Path("hash") String hash);

    @GET("blocks/{height}")
    Call<BlockInfo> getBlockByHeight(@Path("height") Long height);

    @GET("blocks/latest")
    Call<BlockInfo> getLatestBlock();

    @GET("txs")
    Call<SearchTxsResult> getTxsByHeight(@Query("tx.height") Long height);

    @GET("txs")
    Call<List<TxResponse>> getTxsByAction(
            @Query("action") String action,
            @Query("page") Long page,
            @Query("limit") Long limit);

    /**
     ******************************  AOL ********************************
     */

    @GET("api/v1/aol/{ownerAddr}/listTopic")
    Call<List<Topic>> getTopics(@Path("ownerAddr") String ownerAddress);

    @GET("api/v1/aol/{ownerAddr}/topic")
    Call<Topic> getTopic(@Path("ownerAddr") String ownerAddress);

    @GET("api/v1/aol/{ownerAddr}/listWriter")
    Call<List<Writer>> getWriters(
            @Path("ownerAddr") String ownerAddress,
            @Query("topic") String topic);

    @GET("api/v1/aol/{ownerAddr}/writer")
    Call<Writer> getWriter(
            @Path("ownerAddr") String ownerAddress
    );

    @GET("api/v1/aol/{ownerAddr}/topics/{topicName}/records/{offset}")
    Call<RecordResponse> getRecord(
            @Path("ownerAddr") String ownerAddress,
            @Path("topicName") String topicName,
            @Path("offset") Long offset);

    /**
     ****************************** Bucket *******************************
     */

    @GET("/api/v1/bucket/{ownerAddr}/object")
    Call<BucketObject> getBucketObject(
            @Path("ownerAddr") String ownerAddr,
            @Query("objectKey") String objectKey
    );

    @GET("/api/v1/bucket/{ownerAddr}/objects")
    Call<List<BucketObject>> getBucketObjects(
            @Path("ownerAddr") String ownerAddr
    );

    @GET("/api/v1/bucket/{ownerAddr}/writers")
    Call<List<BucketWriter>> getBucketWriters(
            @Path("ownerAddr") String ownerAddr,
            @Query("bucketName") String bucketName
    );

    @GET("/api/v1/bucket/{ownerAddr}/writer")
    Call<BucketWriter> getBucketWriter(
            @Path("ownerAddr") String ownerAddr,
            @Query("bucketName") String bucketName
    );

    @GET("/api/v1/bucket/{ownerAddr}/buckets")
    Call<List<Bucket>> getBuckets(
            @Path("ownerAddr") String ownerAddr
    );

    @GET("api/v1/bucket/{ownerAddr}bucket")
    Call<Bucket> getBucket(
            @Path("ownerAddr") String ownerAddr
    );

    @GET("api/v1/bucket/owners")
    Call<List<Owner>> getOwners();

    @GET("api/v1/bucket/owner")
    Call<Owner> getOwner();



}
