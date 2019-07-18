package org.medibloc.panacea.api.client;

import org.medibloc.panacea.api.client.domain.Account;

public interface PanaceaApiRestClient {
    Account getAccount(String address) throws PanaceaApiException;
}
