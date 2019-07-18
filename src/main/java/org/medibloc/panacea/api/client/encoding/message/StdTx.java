package org.medibloc.panacea.api.client.encoding.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class StdTx {
    @JsonProperty("msg")
    private PanaceaTransactionMessage[] msgs;
    private StdFee fee;
    private StdSignature[] signatures;
    private String memo;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("msgs", msgs)
                .append("fee", fee)
                .append("signatures", signatures)
                .append("memo", memo)
                .toString();
    }
}
