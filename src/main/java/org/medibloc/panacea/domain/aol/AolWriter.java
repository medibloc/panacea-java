package org.medibloc.panacea.domain.aol;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class AolWriter {
    private String moniker;
    private String description;
    private long nano_timestamp;
}
