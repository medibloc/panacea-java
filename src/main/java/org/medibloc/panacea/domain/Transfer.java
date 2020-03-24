package org.medibloc.panacea.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter @Setter @ToString
public class Transfer {
    private String fromAddress;
    private String toAddress;
    private String denom;
    private String amount;
}
