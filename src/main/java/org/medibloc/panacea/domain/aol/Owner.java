package org.medibloc.panacea.domain.aol;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Owner {
    @JsonProperty("total_topics")
    private Long totalTopics;
}
