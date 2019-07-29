package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {
    private String type;
    private Value value;

    @Getter @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Value {
        private String address;
        @JsonProperty("account_number")
        private Long accountNumber;
        private Long sequence;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("accountNumber", value.accountNumber)
                .append("address", value.address)
                .append("sequence", value.sequence)
                .toString();
    }
}
