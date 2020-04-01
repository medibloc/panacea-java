package org.medibloc.panacea;

public class PanaceaEnvironment {
    public static final PanaceaEnvironment MAIN_NET = new PanaceaEnvironment(
            "http://52.78.132.151:1317/",
            "panacea"
    );

    public static final PanaceaEnvironment TEST_NET = new PanaceaEnvironment(
            "http://52.78.196.16:1317/",
            "panacea"
    );

    public static final PanaceaEnvironment LOCAL = new PanaceaEnvironment(
            "http://localhost:1317",
            "panacea"
    );


    private String baseUrl;
    private String hrp;

    public PanaceaEnvironment(String baseUrl, String hrp) {
        this.baseUrl = baseUrl;
        this.hrp = hrp;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getHrp() {
        return hrp;
    }

}
