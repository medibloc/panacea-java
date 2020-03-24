package org.medibloc.panacea;

import org.medibloc.panacea.impl.PanaceaApiRestClientImpl;

public class PanaceaApiClientFactory {
    private PanaceaApiClientFactory() {
    }

    public static PanaceaApiClientFactory newInstance() {
        return new PanaceaApiClientFactory();
    }

    public PanaceaApiRestClient newRestClient(String baseUrl) {
        return new PanaceaApiRestClientImpl(baseUrl);
    }
}
