package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter @Setter @ToString
public class AccountResponse {

    private String height;
    private Result result;

    @Getter @Setter @ToString
    public static class Result {
        private String type;
        private Value value;
    }

    @Getter @Setter @ToString
    public static class Value {
        private String address;
        private List<Coin> coins;
        @JsonProperty("public_key")
        private Pubkey publicKey;
        @JsonProperty("account_number")
        private Long accountNumber;
        private Long sequence;
    }
}
