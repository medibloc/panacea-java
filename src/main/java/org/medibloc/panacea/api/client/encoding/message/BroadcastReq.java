package org.medibloc.panacea.api.client.encoding.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BroadcastReq {
    private StdTx tx;
    private String mode;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("tx", tx)
                .append("mode", mode)
                .toString();
    }
}
