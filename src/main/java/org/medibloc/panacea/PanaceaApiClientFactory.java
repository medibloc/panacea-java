package org.medibloc.panacea;

import org.medibloc.panacea.impl.PanaceaApiRestClientImpl;

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
