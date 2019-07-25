package org.medibloc.panacea.api.client;

import org.medibloc.panacea.api.client.domain.Account;
import org.medibloc.panacea.api.client.domain.NodeInfo;
import org.medibloc.panacea.api.client.domain.Record;
import org.medibloc.panacea.api.client.domain.TxResponse;
import org.medibloc.panacea.api.client.encoding.message.BroadcastReq;
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
}
