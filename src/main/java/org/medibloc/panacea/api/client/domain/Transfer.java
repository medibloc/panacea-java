package org.medibloc.panacea.api.client.domain;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter @Setter
public class Transfer {
    private String fromAddress;
    private String toAddress;
    private String denom;
    private String amount;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("fromAddress", fromAddress)
                .append("toAddress", toAddress)
                .append("denom", denom)
                .append("amount", amount)
                .toString();
    }
}
