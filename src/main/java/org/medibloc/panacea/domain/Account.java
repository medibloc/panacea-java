package org.medibloc.panacea.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {
    @Deprecated
    private String type = "cosmos-sdk/Account";
    @Deprecated
    private Value value;

    private String address;
    private List<Coin> coins;
    @JsonProperty("public_key")
    private Pubkey publicKey;
    @JsonProperty("account_number")
    private Long accountNumber;
    private Long sequence;

    @Deprecated
    @JsonIgnoreProperties(ignoreUnknown = true)
    @Getter @Setter @ToString
    public static class Value {
        private String address;
        @JsonProperty("account_number")
        private Long accountNumber;
        private Long sequence;
        private List<Coin> coins;
    }


}
