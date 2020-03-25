package org.medibloc.panacea.domain.aol;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Topic {
    private String description;
    private long total_records;
    private long total_writers;
}
