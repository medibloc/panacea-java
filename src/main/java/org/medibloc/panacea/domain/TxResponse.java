package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.medibloc.panacea.encoding.message.StdTx;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class TxResponse {
    private Long height;
    @JsonProperty("txhash")
    private String txHash;
    private int code;
    private String data;
    @JsonProperty("raw_log")
    private String rawLog;
    private String info;
    @JsonProperty("gas_wanted")
    private Long gasWanted;
    @JsonProperty("gas_used")
    private Long gasUsed;
    private String codespace;
    private AminoStdTx tx;
    private String timestamp;

    @Getter @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonPropertyOrder(alphabetic = true)
    public static class AminoStdTx {
        private String type;
        private StdTx value;
        public String toString() {
            return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).
                    append("type", type).
                    append("value", value).
                    toString();
        }
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("height", height)
                .append("txHash", txHash)
                .append("code", code)
                .append("data", data)
                .append("rawLog", rawLog)
                .append("info", info)
                .append("gasWanted", gasWanted)
                .append("gasUsed", gasUsed)
                .append("codespace", codespace)
                .append("timestamp", timestamp)
                .append("tx", tx)
                .toString();
    }
}
