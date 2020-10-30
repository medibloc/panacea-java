package org.medibloc.panacea.impl;

import org.medibloc.panacea.PanaceaApi;
import org.medibloc.panacea.PanaceaApiClientGenerator;
import org.medibloc.panacea.PanaceaApiException;
import org.medibloc.panacea.PanaceaApiRestClient;
import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.encoding.message.BroadcastReq;

import java.util.List;

/**
 * Panacea API rest client, supporting synchronous/blocking access Panacea's REST API.
 */
public class PanaceaApiRestClientImpl implements PanaceaApiRestClient {
    private PanaceaApi panaceaApi;

    public PanaceaApiRestClientImpl(String baseUrl) {
        this.panaceaApi = PanaceaApiClientGenerator.createService(PanaceaApi.class, baseUrl);
    }

    public Account getAccount(String address) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getAccount(address)).getAccount();
    }

    public NodeInfo getNodeInfo() throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getNodeInfo()).getNodeInfo();
    }

    public TxResponse broadcast(BroadcastReq req) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.broadcast(req));
    }

    public Record getRecord(String ownerAddress, String topicName, Long offset) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getRecord(ownerAddress, topicName, offset)).getRecord();
    }

    public TxResponse getTxResponse(String txHash) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getTxResponse(txHash));
    }

    public BlockInfo getBlockByHeight(Long height) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getBlockByHeight(height));
    }

    public BlockInfo getLatestBlock() throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getLatestBlock());
    }

    public List<TxResponse> getTxsByHeight(Long height) throws PanaceaApiException {
        return PanaceaApiClientGenerator.executeSync(panaceaApi.getTxsByHeight(height)).getResponses();
    }
}
