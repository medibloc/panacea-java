package org.medibloc.panacea.domain.migrate;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.medibloc.panacea.encoding.message.Coin;
import org.medibloc.panacea.encoding.message.Pubkey;

import java.util.List;


@Getter @Setter @ToString
public class Tx_v1 {
    private String height;
    private String txhash;
    @JsonProperty("raw_log")
    private String rawLog;
    private List<Log> logs;
    @JsonProperty("gas_wanted")
    private String gasWanted;
    @JsonProperty("gas_used")
    private String gasUsed;
    private List<Tag> tags;
    private StdTx tx;
    private String timestamp;
}

@Getter @Setter @ToString
class StdTx {
    private String type;
    private Value value;

    @Getter @Setter @ToString
    static class Value {
        private List<Msg> msg;
        private Fee fee;
        private List<Signature> signatures;
        private String memo;
    }
}

@Getter @Setter @ToString
class Signature {
    @JsonProperty("pub_key")
    private Pubkey pubKey;
    private String signature;
}

@Getter @Setter @ToString
class Fee {
    private List<Coin> amount;
    private String gas;
}

@Getter @Setter @ToString
class Msg {
    private String type;
    private Object value;
}

@Getter @Setter @ToString
class Log {
    @JsonProperty("msg_index")
    private Long msgIndex;
    private boolean success;
    private String log;
}

@Getter @Setter @ToString
class Tag {
    private String key;
    private String value;
}



