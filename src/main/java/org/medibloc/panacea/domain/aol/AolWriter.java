package org.medibloc.panacea.domain.aol;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class AolWriter {
    private String moniker;
    private String description;
    @JsonProperty("nano_timestamp")
    private long nanoTimestamp;
}
