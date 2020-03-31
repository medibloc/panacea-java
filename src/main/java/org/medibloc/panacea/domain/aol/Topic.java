package org.medibloc.panacea.domain.aol;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Topic {
    private String description;
    @JsonProperty("total_records")
    private long totalRecords;
    @JsonProperty("total_writers")
    private long totalWriters;
}
