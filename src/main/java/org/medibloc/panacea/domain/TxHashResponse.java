package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter @Setter @ToString
public class TxHashResponse {
    private String height;
    private String txhash;
    private int code;
    @JsonProperty("raw_log")
    private String rawLog;
    private List<Log> logs;
    @JsonProperty("gas_wanted")
    private String gasWanted;
    @JsonProperty("gas_used")
    private String gasUsed;
    private StdTx tx;
    private String timestamp;
    private List<Event> events;
}
