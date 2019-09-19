package org.medibloc.panacea;

import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.encoding.message.BroadcastReq;
import retrofit2.Call;
import retrofit2.http.*;

public interface PanaceaApi {
    @GET("auth/accounts/{address}")
    Call<Account> getAccount(@Path("address") String address);

    @GET("node_info")
    Call<NodeInfo> getNodeInfo();

    @POST("txs")
    Call<TxResponse> broadcast(@Body BroadcastReq req);

    @GET("api/v1/aol/{ownerAddress}/topics/{topicName}/records/{offset}")
    Call<Record> getRecord(@Path("ownerAddress") String ownerAddress, @Path("topicName") String topicName, @Path("offset") Long offset);

    @GET("txs/{txHash}")
    Call<TxResponse> getTxResponse(@Path("txHash") String txHash);

    @GET("blocks/{height}")
    Call<BlockInfo> getBlockByHeight(@Path("height") Long height);

    @GET("blocks/latest")
    Call<BlockInfo> getLatestBlock();
}
