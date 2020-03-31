package org.medibloc.panacea;

import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.domain.aol.AolWriter;
import org.medibloc.panacea.domain.aol.Record;
import org.medibloc.panacea.domain.aol.Topic;
import org.medibloc.panacea.domain.bucket.Bucket;
import org.medibloc.panacea.domain.bucket.BucketObject;
import org.medibloc.panacea.domain.bucket.BucketOwner;
import org.medibloc.panacea.domain.bucket.BucketWriter;
import org.medibloc.panacea.domain.NodeInfoResponse;
import org.medibloc.panacea.domain.model.response.Res;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface PanaceaApi {

    @GET("auth/accounts/{address}")
    Call<Res<Account>> getAccount(@Path("address") String address);

    @GET("node_info")
    Call<NodeInfoResponse> getNodeInfo();

    @POST("txs")
    Call<TxResponse> broadcast(@Body BroadcastReq req);

    @GET("txs/{hash}")
    Call<TxResponse> getTxResponse(@Path("hash") String hash);

    @GET("blocks/{height}")
    Call<BlockInfo> getBlockByHeight(@Path("height") Long height);

    @GET("blocks/latest")
    Call<BlockInfo> getLatestBlock();

    @GET("txs")
    Call<SearchTxsResult> getTxsByHeight(@Query("tx.height") Long height);

    @GET("txs")
    Call<SearchTxsResult> getTxsByAction(
            @Query("message.action") String action,
            @Query("page") Long page,
            @Query("limit") Long limit);

    /**
     ******************************  AOL ********************************
     */

    @GET("api/v1/aol/{ownerAddr}/topics")
    Call<Res<List<Topic>>> getTopics(@Path("ownerAddr") String ownerAddress);

    @GET("api/v1/aol/{ownerAddr}/topic")
    Call<Res<Topic>> getTopic(@Path("ownerAddr") String ownerAddress);

    @GET("api/v1/aol/{ownerAddr}/listWriter")
    Call<Res<List<String>>> getWriters(
            @Path("ownerAddr") String ownerAddress,
            @Query("topic") String topic);

    @GET("api/v1/aol/{ownerAddr}/writer")
    Call<Res<AolWriter>> getWriter(
            @Path("ownerAddr") String ownerAddress
    );

    @GET("api/v1/aol/{ownerAddr}/topics/{topicName}/records/{offset}")
    Call<Record> getRecord(
            @Path("ownerAddr") String ownerAddress,
            @Path("topicName") String topicName,
            @Path("offset") Long offset);

    /**
     ****************************** Bucket *******************************
     */

    @GET("api/v1/bucket/owners")
    Call<Res<List<BucketOwner>>> getOwners();
    @GET("api/v1/bucket/owner")
    Call<Res<BucketOwner>> getOwner(@Query("ownerAddr") String ownerAddr);

    @GET("/api/v1/bucket/buckets")
    Call<Res<List<Bucket>>> getBuckets(@Query("ownerAddr") String ownerAddr);
    @GET("api/v1/bucket/bucket")
    Call<Res<Bucket>> getBucket(
            @Query("ownerAddr") String ownerAddr,
            @Query("bucketName") String bucketName
    );

    @GET("/api/v1/bucket/objects")
    Call<Res<List<BucketObject>>> getBucketObjects(
            @Query("ownerAddr") String ownerAddr,
            @Query("bucketName") String bucketName
    );
    @GET("/api/v1/bucket/object")
    Call<Res<BucketObject>> getBucketObject(
            @Query("ownerAddr") String ownerAddr,
            @Query("objectKey") String objectKey
    );

    @GET("/api/v1/bucket/writers")
    Call<Res<List<BucketWriter>>> getBucketWriters(
            @Query("ownerAddr") String ownerAddr,
            @Query("bucketName") String bucketName
    );

    @GET("/api/v1/bucket/writer")
    Call<Res<BucketWriter>> getBucketWriter(
            @Query("ownerAddr") String ownerAddr,
            @Query("bucketName") String bucketName,
            @Query("writerAddr") String writerAddr
    );


}
