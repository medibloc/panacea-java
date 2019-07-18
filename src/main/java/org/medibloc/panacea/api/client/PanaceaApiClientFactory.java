package org.medibloc.panacea.api.client;

import org.medibloc.panacea.api.client.impl.PanaceaApiRestClientImpl;

public class PanaceaApiClientFactory {
    private PanaceaApiClientFactory() {
    }

    public static PanaceaApiClientFactory newInstance() {
        return new PanaceaApiClientFactory();
    }

//    TODO
//    public PanaceaApiRestClient newRestClient() {
//        return newRestClient(PanaceaEnvironment.PROD.getBaseUrl());
//    }

    public PanaceaApiRestClient newRestClient(String baseUrl) {
        return new PanaceaApiRestClientImpl(baseUrl);
    }
}
