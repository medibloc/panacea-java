package org.medibloc.panacea;

import org.medibloc.panacea.domain.Account;
import org.medibloc.panacea.domain.NodeInfo;
import org.medibloc.panacea.domain.Record;
import org.medibloc.panacea.domain.TxResponse;
import org.medibloc.panacea.encoding.message.BroadcastReq;

public interface PanaceaApiRestClient {
    Account getAccount(String address) throws PanaceaApiException;

    NodeInfo getNodeInfo() throws PanaceaApiException;

    TxResponse broadcast(BroadcastReq req) throws PanaceaApiException;

    Record getRecord(String ownerAddress, String topicName, Long offset) throws PanaceaApiException;

    TxResponse getTxResponse(String txHash) throws PanaceaApiException;
}
