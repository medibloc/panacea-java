package org.medibloc.panacea.api.client;

import org.junit.Test;
import org.medibloc.panacea.api.client.domain.Account;

import static org.junit.Assert.*;

public class PanaceaApiRestClientTest {
    @Test
    public void testGetAccount() {
        PanaceaApiRestClient client = PanaceaApiClientFactory.newInstance().newRestClient("http://localhost:1317");
        try {
            Account account = client.getAccount("panacea1mm72d9c36zwszcck34nyl49j32hxx6jfhfs52l");
            System.out.println(account);
        } catch (PanaceaApiException e) {
            e.printStackTrace();
        }
    }
}