package org.medibloc.panacea;

import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.domain.migrate.Tx_v1;
import org.medibloc.panacea.encoding.message.BroadcastReq;

import java.util.List;

public interface PanaceaApiRestClient {
    AccountResponse getAccount(String address) throws PanaceaApiException;

    NodeInfoResponse getNodeInfo() throws PanaceaApiException;

    TxResponse broadcast(BroadcastReq req) throws PanaceaApiException;

    RecordResponse getRecord(String ownerAddress, String topicName, Long offset) throws PanaceaApiException;

    TxHashResponse getTxResponse(String txHash) throws PanaceaApiException;

    BlockInfo getBlockByHeight(Long height) throws PanaceaApiException;

    BlockInfo getLatestBlock() throws PanaceaApiException;

    TxResponse getTxsByHeight(Long height) throws PanaceaApiException;

    List<Tx_v1> getTxsByAction(String action, Long page, Long limit) throws PanaceaApiException;

}
