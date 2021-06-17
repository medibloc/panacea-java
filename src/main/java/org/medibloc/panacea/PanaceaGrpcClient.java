package org.medibloc.panacea;

import com.google.protobuf.InvalidProtocolBufferException;
import cosmos.auth.v1beta1.BaseAccount;
import cosmos.auth.v1beta1.QueryAccountRequest;
import cosmos.auth.v1beta1.QueryAccountResponse;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.base.tendermint.v1beta1.GetNodeInfoRequest;
import cosmos.base.tendermint.v1beta1.GetNodeInfoResponse;
import cosmos.tx.v1beta1.BroadcastMode;
import cosmos.tx.v1beta1.BroadcastTxRequest;
import cosmos.tx.v1beta1.BroadcastTxResponse;
import io.grpc.Channel;
import medibloc.panaceacore.aol.QueryGetRecordRequest;
import medibloc.panaceacore.aol.QueryGetRecordResponse;
import medibloc.panaceacore.aol.Record;
import tendermint.p2p.DefaultNodeInfo;

public class PanaceaGrpcClient {
    private final cosmos.auth.v1beta1.QueryGrpc.QueryBlockingStub authQueryStub;
    private final medibloc.panaceacore.aol.QueryGrpc.QueryBlockingStub aolQueryStub;
    private final cosmos.base.tendermint.v1beta1.ServiceGrpc.ServiceBlockingStub tendermintQueryStub;
    private final cosmos.tx.v1beta1.ServiceGrpc.ServiceBlockingStub txServiceStub;

    public PanaceaGrpcClient(Channel channel) {
        this.authQueryStub = cosmos.auth.v1beta1.QueryGrpc.newBlockingStub(channel);
        this.aolQueryStub = medibloc.panaceacore.aol.QueryGrpc.newBlockingStub(channel);
        this.tendermintQueryStub = cosmos.base.tendermint.v1beta1.ServiceGrpc.newBlockingStub(channel);
        this.txServiceStub = cosmos.tx.v1beta1.ServiceGrpc.newBlockingStub(channel);
    }

    public BaseAccount getAccount(String address) throws PanaceaApiException {
        QueryAccountRequest request = QueryAccountRequest.newBuilder()
                .setAddress(address)
                .build();

        QueryAccountResponse response = authQueryStub.account(request);
        try {
            return response.getAccount().unpack(BaseAccount.class);
        } catch (InvalidProtocolBufferException e) {
            throw new PanaceaApiException(e.getMessage());
        }
    }

    public DefaultNodeInfo getNodeInfo() {
        GetNodeInfoRequest request = GetNodeInfoRequest.getDefaultInstance();
        GetNodeInfoResponse response = tendermintQueryStub.getNodeInfo(request);
        return response.getDefaultNodeInfo();
    }

    public Record getRecord(String ownerAddress, String topicName, Long offset) {
        QueryGetRecordRequest request = QueryGetRecordRequest.newBuilder()
                .setOwnerAddress(ownerAddress)
                .setTopicName(topicName)
                .setOffset(offset)
                .build();
        QueryGetRecordResponse response = aolQueryStub.record(request);
        return response.getRecord();
    }

    public TxResponse broadCast(BroadcastTxRequest request) {
        BroadcastTxResponse response = txServiceStub.broadcastTx(request);
        return response.getTxResponse();
    }



}
