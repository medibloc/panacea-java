package org.medibloc.panacea;

import com.google.protobuf.InvalidProtocolBufferException;
import cosmos.auth.v1beta1.BaseAccount;
import cosmos.auth.v1beta1.QueryAccountRequest;
import cosmos.auth.v1beta1.QueryAccountResponse;
import cosmos.bank.v1beta1.QueryBalanceRequest;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.base.tendermint.v1beta1.*;
import cosmos.base.v1beta1.Coin;
import cosmos.tx.v1beta1.*;
import io.grpc.Channel;
import panacea.aol.v2.*;
import panacea.did.v2.DIDDocumentWithSeq;
import panacea.did.v2.QueryGetDIDRequest;
import panacea.did.v2.QueryGetDIDResponse;
import tendermint.p2p.DefaultNodeInfo;
import tendermint.types.Block;

import java.util.List;

public class PanaceaGrpcClient {
    private final GrpcStub grpcStub;

    public PanaceaGrpcClient(Channel channel) {
        this.grpcStub = new GrpcStub(channel);
    }

    public BaseAccount getAccount(String address) throws PanaceaApiException {
        QueryAccountRequest request = QueryAccountRequest.newBuilder()
                .setAddress(address)
                .build();
        QueryAccountResponse response = grpcStub.getAuthQueryStub().account(request);
        try {
            return response.getAccount().unpack(BaseAccount.class);
        } catch (InvalidProtocolBufferException e) {
            throw new PanaceaApiException(e.getMessage());
        }
    }

    public Coin getBalance(String address, String denom) {
        QueryBalanceRequest request = QueryBalanceRequest.newBuilder()
                .setAddress(address)
                .setDenom(denom)
                .build();

        return grpcStub.getBankQueryStub().balance(request).getBalance();
    }

    public DefaultNodeInfo getNodeInfo() {
        GetNodeInfoRequest request = GetNodeInfoRequest.getDefaultInstance();
        GetNodeInfoResponse response = grpcStub.getTendermintQueryStub().getNodeInfo(request);
        return response.getDefaultNodeInfo();
    }

    public Topic getTopic(String ownerAddress, String topicName) {
        QueryGetTopicRequest request = QueryGetTopicRequest.newBuilder()
                .setTopicName(topicName)
                .setOwnerAddress(ownerAddress)
                .build();
        QueryGetTopicResponse response = grpcStub.getAolQueryStub().topic(request);
        return response.getTopic();
    }

    public Record getRecord(String ownerAddress, String topicName, Long offset) {
        QueryGetRecordRequest request = QueryGetRecordRequest.newBuilder()
                .setOwnerAddress(ownerAddress)
                .setTopicName(topicName)
                .setOffset(offset)
                .build();
        QueryGetRecordResponse response = grpcStub.getAolQueryStub().record(request);
        return response.getRecord();
    }

    public DIDDocumentWithSeq getDIDDocumentWithSeq(String did) {
        QueryGetDIDRequest request = QueryGetDIDRequest.newBuilder()
                .setDID(did)
                .build();
        QueryGetDIDResponse response = grpcStub.getDidQueryStub().dIDDocumentWithSeq(request);
        return response.getDIDDocumentWithSeq();
    }

    public TxResponse broadcast(BroadcastTxRequest request) {
        BroadcastTxResponse response = grpcStub.getTxServiceStub().broadcastTx(request);
        return response.getTxResponse();
    }

    public TxResponse getTxResponse(String txHash) {
        GetTxRequest request = GetTxRequest.newBuilder()
                .setHash(txHash)
                .build();
        GetTxResponse response = grpcStub.getTxServiceStub().getTx(request);
        return response.getTxResponse();
    }

    public List<TxResponse> getTxResponsesByHeight(long height) {
        GetTxsEventRequest request = GetTxsEventRequest.newBuilder()
                .addEvents("tx.height=" + height)
                .build();
        GetTxsEventResponse response = grpcStub.getTxServiceStub().getTxsEvent(request);
        return response.getTxResponsesList();
    }

    public Block getBlockByHeight(long height) {
        GetBlockByHeightRequest request = GetBlockByHeightRequest.newBuilder()
                .setHeight(height)
                .build();
        GetBlockByHeightResponse response = grpcStub.getTendermintQueryStub().getBlockByHeight(request);
        return response.getBlock();
    }

    public Block getLatestBlock() {
        GetLatestBlockResponse response = grpcStub.getTendermintQueryStub().getLatestBlock(GetLatestBlockRequest.getDefaultInstance());
        return response.getBlock();
    }
}
