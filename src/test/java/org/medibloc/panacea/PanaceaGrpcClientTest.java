package org.medibloc.panacea;

import cosmos.base.query.v1beta1.PageRequest;
import cosmos.base.query.v1beta1.PageResponse;
import cosmos.tx.v1beta1.GetTxsEventRequest;
import cosmos.tx.v1beta1.GetTxsEventResponse;
import org.junit.Assert;
import org.junit.Test;

public class PanaceaGrpcClientTest {

    @Test
    public void buildsTxSearchRequestForOldAndNewCosmosSdk() {
        PageRequest pagination = PageRequest.newBuilder()
                .setOffset(10)
                .setLimit(5)
                .build();

        GetTxsEventRequest request = PanaceaGrpcClient.buildGetTxsEventRequest(123, pagination);

        Assert.assertEquals("tx.height=123", request.getEvents(0));
        Assert.assertEquals("tx.height=123", request.getQuery());
        Assert.assertEquals(pagination, request.getPagination());
        Assert.assertEquals(3, request.getPage());
        Assert.assertEquals(5, request.getLimit());
    }

    @Test
    public void mapsNewTotalToLegacyPaginationResponse() {
        GetTxsEventResponse response = GetTxsEventResponse.newBuilder()
                .setTotal(7)
                .build();

        GetTxsEventResponse normalized = PanaceaGrpcClient.normalizeGetTxsEventResponse(response);

        Assert.assertTrue(normalized.hasPagination());
        Assert.assertEquals(7, normalized.getPagination().getTotal());
    }

    @Test
    public void keepsLegacyPaginationResponse() {
        PageResponse pagination = PageResponse.newBuilder()
                .setTotal(4)
                .build();
        GetTxsEventResponse response = GetTxsEventResponse.newBuilder()
                .setPagination(pagination)
                .setTotal(9)
                .build();

        GetTxsEventResponse normalized = PanaceaGrpcClient.normalizeGetTxsEventResponse(response);

        Assert.assertSame(response, normalized);
        Assert.assertEquals(4, normalized.getPagination().getTotal());
    }
}
