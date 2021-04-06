package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;
import lombok.ToString;

/**
 * A wrapper class of {@link Account} for the HTTP response of '/auth/accounts/{address}'.
 * <p></p>
 * Since cosmos-sdk@v0.36.0, the REST API has returned a <code>height</code> in the response, and the account is nested as the <code>result</code> field.
 * See https://github.com/cosmos/cosmos-sdk/issues/4536.
 */
@Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountResponse {
    private Long height;
    @JsonProperty("result")
    private Account account;

    public Account getAccount() {
        return this.account.isEmpty() ? null : this.account;
    }
}
