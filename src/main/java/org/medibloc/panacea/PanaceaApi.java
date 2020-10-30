package org.medibloc.panacea;

import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.encoding.message.BroadcastReq;
import org.medibloc.panacea.encoding.message.did.Did;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface PanaceaApi {
    @GET("auth/accounts/{address}")
    Call<AccountResponse> getAccount(@Path("address") String address);

    @GET("node_info")
    Call<NodeInfoResponse> getNodeInfo();

    @POST("txs")
    Call<TxResponse> broadcast(@Body BroadcastReq req);

    @GET("api/v1/aol/{ownerAddress}/topics/{topicName}/records/{offset}")
    Call<RecordResponse> getRecord(@Path("ownerAddress") String ownerAddress, @Path("topicName") String topicName, @Path("offset") Long offset);

    @GET("api/v1/did/{did}")
    Call<DidDocumentResponse> getDidDocument(@Path("did") Did did);

    @GET("txs/{txHash}")
    Call<TxResponse> getTxResponse(@Path("txHash") String txHash);

    @GET("blocks/{height}")
    Call<BlockInfo> getBlockByHeight(@Path("height") Long height);

    @GET("blocks/latest")
    Call<BlockInfo> getLatestBlock();

    @GET("txs")
    Call<TxResponses> getTxsByHeight(@Query("tx.height") Long height);
}
