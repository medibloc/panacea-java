package org.medibloc.panacea.domain.aol;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class AolWriter {
    private String moniker;
    private String description;
    private long nano_timestamp;
}