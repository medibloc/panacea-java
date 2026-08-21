package org.medibloc.panacea;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageV3;
import cosmos.tx.v1beta1.GetTxsEventRequest;
import cosmos.tx.v1beta1.GetTxsEventResponse;
import cosmos.tx.v1beta1.OrderBy;
import cosmos.tx.v1beta1.Tx;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class GrpcGeneralTxTest {
    private ManagedChannel channel;
    private cosmos.tx.v1beta1.ServiceGrpc.ServiceBlockingStub txService;

    @Before
    public void setUp() {
        channel = ManagedChannelBuilder.forTarget("testnet-grpc.gopanacea.org")
                .useTransportSecurity()
                .build();
        txService = cosmos.tx.v1beta1.ServiceGrpc.newBlockingStub(channel);
    }

    @After
    public void tearDown() throws InterruptedException {
        channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }

    @Test
    public void testBankSendTxDecoding() throws Exception {
        cosmos.bank.v1beta1.MsgSend message = latestMessage(
                "/cosmos.bank.v1beta1.MsgSend",
                cosmos.bank.v1beta1.MsgSend.class);

        Assert.assertFalse(message.getFromAddress().isEmpty());
        Assert.assertFalse(message.getToAddress().isEmpty());
    }

    @Test
    public void testAolTxDecoding() throws Exception {
        panacea.aol.v2.MsgCreateTopicRequest message = latestMessage(
                "/panacea.aol.v2.MsgCreateTopicRequest",
                panacea.aol.v2.MsgCreateTopicRequest.class);

        Assert.assertFalse(message.getOwnerAddress().isEmpty());
        Assert.assertFalse(message.getTopicName().isEmpty());
    }

    @Test
    public void testDidTxDecoding() throws Exception {
        panacea.did.v2.MsgCreateDIDRequest message = latestMessage(
                "/panacea.did.v2.MsgCreateDIDRequest",
                panacea.did.v2.MsgCreateDIDRequest.class);

        Assert.assertFalse(message.getFromAddress().isEmpty());
        Assert.assertFalse(message.getDid().isEmpty());
    }

    private <T extends GeneratedMessageV3> T latestMessage(String typeUrl, java.lang.Class<T> messageType)
            throws Exception {
        GetTxsEventRequest request = GetTxsEventRequest.newBuilder()
                .setQuery("message.action='" + typeUrl + "'")
                .setLimit(1)
                .setOrderBy(OrderBy.ORDER_BY_DESC)
                .build();
        GetTxsEventResponse response = txService.getTxsEvent(request);

        Assert.assertTrue("No testnet transaction found for " + typeUrl, response.getTxsCount() > 0);
        Tx tx = response.getTxs(0);
        for (Any message : tx.getBody().getMessagesList()) {
            if (typeUrl.equals(message.getTypeUrl())) {
                System.out.println("Decoded " + typeUrl + " at height "
                        + response.getTxResponses(0).getHeight());
                return message.unpack(messageType);
            }
        }

        Assert.fail("Queried transaction did not contain " + typeUrl);
        return null;
    }
}
