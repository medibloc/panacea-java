package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class StdTxWrapper {
    private String type;
    private StdTx value;
}
