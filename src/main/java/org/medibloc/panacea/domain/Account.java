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
    private String type = "cosmos-sdk/Account";
    private Value value;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Getter @Setter @ToString
    public static class Value {
        private String address;
        @JsonProperty("account_number")
        private Long accountNumber;
        @JsonProperty("public_key")
        private Pubkey publicKey;
        private Long sequence;
        private List<Coin> coins;
    }

}
