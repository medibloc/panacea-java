package org.medibloc.panacea.encoding.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter @Setter
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("accountNumber", accountNumber)
                .append("chainId", chainId)
                .append("fee", fee)
                .append("sequence", sequence)
                .append("memo", memo)
                .append("msgs", msgs)
                .toString();
    }
}
