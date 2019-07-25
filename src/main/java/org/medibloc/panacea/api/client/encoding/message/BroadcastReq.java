package org.medibloc.panacea.api.client.encoding.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

// mode = async | sync | block

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BroadcastReq {
    private StdTx tx;

    public BroadcastReq(StdTx tx, String mode) {
        this.tx = tx;
        this.mode = mode;
    }

    private String mode;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("tx", tx)
                .append("mode", mode)
                .toString();
    }
}
