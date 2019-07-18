package org.medibloc.panacea.api.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.medibloc.panacea.api.client.encoding.message.StdTx;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TxResponse {
    private Long height;
    @JsonProperty("txhash")
    private String txHash;
    private Integer code;
    private String data;
    @JsonProperty("raw_log")
    private String rawLog;
    private String info;
    @JsonProperty("gas_wanted")
    private Long gasWanted;
    @JsonProperty("gas_used")
    private Long gasUsed;
    private String codespace;
    private StdTx tx;
    private String timestamp;

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
                .append("tx", tx)
                .append("timestamp", timestamp)
                .toString();
    }
}
