package org.medibloc.panacea;

import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.encoding.message.BroadcastReq;
import org.medibloc.panacea.encoding.message.did.Did;
import org.medibloc.panacea.encoding.message.did.DidDocumentWithMeta;

import java.util.List;

public interface PanaceaApiRestClient {
    Account getAccount(String address) throws PanaceaApiException;

    NodeInfo getNodeInfo() throws PanaceaApiException;

    TxResponse broadcast(BroadcastReq req) throws PanaceaApiException;

    Record getRecord(String ownerAddress, String topicName, Long offset) throws PanaceaApiException;

    DidDocumentWithMeta getDidDocument(Did did) throws PanaceaApiException;

    TxResponse getTxResponse(String txHash) throws PanaceaApiException;

    BlockInfo getBlockByHeight(Long height) throws PanaceaApiException;

    BlockInfo getLatestBlock() throws PanaceaApiException;

    List<TxResponse> getTxsByHeight(Long height) throws PanaceaApiException;
}
