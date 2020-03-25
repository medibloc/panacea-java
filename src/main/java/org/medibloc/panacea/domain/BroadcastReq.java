package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.medibloc.panacea.domain.StdTx;

// mode = async | sync | block

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class BroadcastReq {
    private StdTx tx;
    private String mode;

    public BroadcastReq(StdTx tx, String mode) {
        this.tx = tx;
        this.mode = mode;
    }

}
