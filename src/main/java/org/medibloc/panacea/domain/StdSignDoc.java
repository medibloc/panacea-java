package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.medibloc.panacea.domain.message.PanaceaTransactionMessage;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class StdSignDoc {
    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("chain_id")
    private String chainId;
    private StdFee fee;
    private String memo;
    private PanaceaTransactionMessage[] msgs;
    private String sequence;

}
