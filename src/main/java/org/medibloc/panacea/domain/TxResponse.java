package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class TxResponse {
    // used for fail
    private int code;
    private String data;

    private Long height;
    @JsonProperty("txhash")
    private String txHash;
    @JsonProperty("raw_log")
    private String rawLog;
    private List<Log> logs;

    private String info;

    @JsonProperty("gas_wanted")
    private Long gasWanted;

    @JsonProperty("gas_used")
    private Long gasUsed;

    private String codespace;

    private AminoStdTx tx;

    private String timestamp;

    private List<Event> events;


    @Getter @Setter @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonPropertyOrder(alphabetic = true)
    public static class AminoStdTx {
        private String type;
        private StdTx value;
    }

}