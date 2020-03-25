package org.medibloc.panacea;

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
