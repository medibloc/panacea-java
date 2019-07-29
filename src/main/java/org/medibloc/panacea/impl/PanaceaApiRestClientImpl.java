package org.medibloc.panacea.impl;

import org.medibloc.panacea.PanaceaApi;
import org.medibloc.panacea.PanaceaApiClientGenerator;
import org.medibloc.panacea.PanaceaApiException;
import org.medibloc.panacea.PanaceaApiRestClient;
import org.medibloc.panacea.domain.Account;
import org.medibloc.panacea.domain.NodeInfo;
import org.medibloc.panacea.domain.Record;
import org.medibloc.panacea.domain.TxResponse;
import org.medibloc.panacea.encoding.message.BroadcastReq;

/**
 * Panacea API rest client, supporting synchronous/blocking access Panacea's REST API.
 */
public class PanaceaApiRestClientImpl implements PanaceaApiRestClient {
    private PanaceaApi panaceaApi;

    public PanaceaApiRestClientImpl(String baseUrl) {
        this.panaceaApi = PanaceaApiClientGenerator.createService(PanaceaApi.class, baseUrl);
    }

    public Account getAccount(String address) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getAccount(address));
    }

    public NodeInfo getNodeInfo() throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getNodeInfo());
    }

    public TxResponse broadcast(BroadcastReq req) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.broadcast(req));
    }

    public Record getRecord(String ownerAddress, String topicName, Long offset) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getRecord(ownerAddress, topicName, offset));
    }

    public TxResponse getTxResponse(String txHash) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getTxResponse(txHash));
    }
}
