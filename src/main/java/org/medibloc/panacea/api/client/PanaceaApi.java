package org.medibloc.panacea.api.client;

import org.medibloc.panacea.api.client.domain.Account;
import org.medibloc.panacea.api.client.domain.TxResponse;
import org.medibloc.panacea.api.client.encoding.message.BroadcastReq;
import retrofit2.Call;
import retrofit2.http.*;

public interface PanaceaApi {
    @GET("auth/accounts/{address}")
    Call<Account> getAccount(@Path("address") String address);

    @POST("txs")
    Call<TxResponse> broadcast(@Body BroadcastReq req);
}
