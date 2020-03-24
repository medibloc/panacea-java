package org.medibloc.panacea;

import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.domain.bucket.Bucket;
import org.medibloc.panacea.domain.bucket.BucketObject;
import org.medibloc.panacea.domain.bucket.BucketWriter;
import org.medibloc.panacea.domain.migrate.Tx_v1;
import org.medibloc.panacea.encoding.message.BroadcastReq;
import org.medibloc.panacea.encoding.message.StdTx;
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
    Call<TxResponse> broadcast(@Body BroadcastReq req);

    @GET("api/v1/aol/{ownerAddress}/topics/{topicName}/records/{offset}")
    Call<RecordResponse> getRecord(
            @Path("ownerAddress") String ownerAddress,
            @Path("topicName") String topicName,
            @Path("offset") Long offset);

    @GET("txs/{hash}")
    Call<TxHashResponse> getTxResponse(@Path("hash") String hash);

    @GET("blocks/{height}")
    Call<BlockInfo> getBlockByHeight(@Path("height") Long height);

    @GET("blocks/latest")
    Call<BlockInfo> getLatestBlock();

    @GET("txs")
    Call<TxResponse> getTxsByHeight(@Query("tx.height") Long height);

    @GET("txs")
    Call<List<Tx_v1>> getTxsByAction(
            @Query("action") String action,
            @Query("page") Long page,
            @Query("limit") Long limit);

    @GET("/api/v1/bucket/{ownerAddr}/object")
    Call<BucketObject> getBucketObject(
            @Path("ownerAddr") String ownerAddress,
            @Query("objectKey") String objectKey
    );

    @GET("/api/v1/bucket/{ownerAddr}/objects")
    Call<List<BucketObject>> getBucketObjects(
            @Path("ownerAddr") String ownerAddress
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

    @POST("api/v1/bucket/createBucket")
    Call<StdTx> createBucket();

    @DELETE("api/v1/bucket/deleteBucket")
    Call<StdTx> deleteBucket();

    @POST("api/v1/bucket/addWriter")
    Call<StdTx> addWriter();

    @DELETE("api/v1/bucket/removeWriter")
    Call<StdTx> removeWriter();

    @POST("api/v1/bucket/createObject")
    Call<StdTx> createObject();

    @DELETE("api/v1/bucket/deleteObject")
    Call<StdTx> deleteObject();

    @POST("api/v1/bucket/updateObject")
    Call<StdTx> updateObject();


}
