package org.medibloc.panacea.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class RecordResponse {

    private long height;
    private Record result;

}
