package org.medibloc.panacea.api.client;

import org.medibloc.panacea.api.client.domain.Account;
import org.medibloc.panacea.api.client.domain.NodeInfo;
import org.medibloc.panacea.api.client.domain.Record;
import org.medibloc.panacea.api.client.domain.TxResponse;
import org.medibloc.panacea.api.client.encoding.message.BroadcastReq;

public interface PanaceaApiRestClient {
    Account getAccount(String address) throws PanaceaApiException;

    NodeInfo getNodeInfo() throws PanaceaApiException;

    TxResponse broadcast(BroadcastReq req) throws PanaceaApiException;

    Record getRecord(String ownerAddress, String topicName, Long offset) throws PanaceaApiException;

    TxResponse getTxResponse(String txHash) throws PanaceaApiException;
}
