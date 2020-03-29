package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.Nullable;
import java.util.List;

@Getter @Setter @ToString
@JsonPropertyOrder(alphabetic = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TxResponse {
    // used for fail
    private int code;
    private String data;

    // success
    private String height;
    private String txhash;
    @JsonProperty("raw_log")
    private String rawLog;
    private List<Log> logs;
    private String info;
    @JsonProperty("gas_wanted")
    private String gasWanted;
    @JsonProperty("gas_used")
    private String gasUsed;
    private String codespace;
    private StdTx tx;
    private String timestamp;
    private List<Event> events;
}
