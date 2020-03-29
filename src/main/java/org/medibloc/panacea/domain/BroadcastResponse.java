package org.medibloc.panacea.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BroadcastResponse {

    @Getter
    @Setter
    @ToString
    static class Tx {
        private String code;
        private String data;
        private String log;
        private long gas_used;
        private long gas_wanted;
        private String info;
    }
}
