package org.medibloc.panacea;

import com.google.protobuf.InvalidProtocolBufferException;
import cosmos.auth.v1beta1.BaseAccount;
import cosmos.auth.v1beta1.QueryAccountRequest;
import cosmos.auth.v1beta1.QueryAccountResponse;
import cosmos.bank.v1beta1.QueryBalanceRequest;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.base.query.v1beta1.PageRequest;
import cosmos.base.tendermint.v1beta1.*;
import cosmos.base.v1beta1.Coin;
import cosmos.tx.v1beta1.*;
import cosmos.tx.v1beta1.Tx;
import io.grpc.Channel;
import org.apache.commons.net.util.Base64;
import panacea.aol.v2.*;
import panacea.did.v2.DIDDocumentWithSeq;
import panacea.did.v2.QueryDIDRequest;
import panacea.did.v2.QueryDIDResponse;
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
        QueryTopicRequest request = QueryTopicRequest.newBuilder()
                .setTopicName(topicName)
                .setOwnerAddress(ownerAddress)
                .build();
        QueryTopicResponse response = grpcStub.getAolQueryStub().topic(request);
        return response.getTopic();
    }

    public Record getRecord(String ownerAddress, String topicName, Long offset) {
        QueryRecordRequest request = QueryRecordRequest.newBuilder()
                .setOwnerAddress(ownerAddress)
                .setTopicName(topicName)
                .setOffset(offset)
                .build();
        QueryRecordResponse response = grpcStub.getAolQueryStub().record(request);
        return response.getRecord();
    }

    public DIDDocumentWithSeq getDIDDocumentWithSeq(String did) {
        QueryDIDRequest request = QueryDIDRequest.newBuilder()
                .setDidBase64(Base64.encodeBase64String(did.getBytes()))
                .build();
        QueryDIDResponse response = grpcStub.getDidQueryStub().dID(request);
        return response.getDidDocumentWithSeq();
    }

    public TxResponse broadcast(BroadcastTxRequest request) {
        BroadcastTxResponse response = grpcStub.getTxServiceStub().broadcastTx(request);
        return response.getTxResponse();
    }

    public Tx getTx(String txHash) {
        return callGetTx(txHash).getTx();
    }

    public TxResponse getTxResponse(String txHash) {
        return callGetTx(txHash).getTxResponse();
    }

    private GetTxResponse callGetTx(String txHash) {
        GetTxRequest request = GetTxRequest.newBuilder()
                .setHash(txHash)
                .build();
        return grpcStub.getTxServiceStub().getTx(request);
    }

    public List<Tx> getTxsByHeight(long height) {
        return getTxsByHeight(height, null).getTxsList();
    }

    public List<TxResponse> getTxResponsesByHeight(long height) {
        return getTxsByHeight(height, null).getTxResponsesList();
    }

    /**
     * @param height A block height
     * @param pagination A pagination request. For details: https://github.com/cosmos/cosmos-sdk/blob/2582f0aab7b2cbf66ade066fe570a4622cf0b098/proto/cosmos/base/query/v1beta1/pagination.proto#L13
     * @return An object which contains Txs, TxResponses, and PageResult. For details: https://github.com/cosmos/cosmos-sdk/blob/2582f0aab7b2cbf66ade066fe570a4622cf0b098/proto/cosmos/tx/v1beta1/service.proto#L69
     */
    public GetTxsEventResponse getTxsByHeight(long height, PageRequest pagination) {
        return callGetTxsEvent(height, pagination);
    }

    private GetTxsEventResponse callGetTxsEvent(long height, PageRequest pagination) {
        GetTxsEventRequest.Builder builder = GetTxsEventRequest.newBuilder()
                .addEvents("tx.height=" + height);

        if (pagination != null) {
            builder.setPagination(pagination);
        }

        return grpcStub.getTxServiceStub().getTxsEvent(builder.build());
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
