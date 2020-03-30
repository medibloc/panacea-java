package org.medibloc.panacea.domain.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgCreateObject implements PanaceaTransactionMessage {
    private String type = "bucket/MsgCreateObject";
    private Value value;

    @Getter @Setter @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonPropertyOrder(alphabetic = true)
    public static class Value {
        private String owner_address;
        private String bucket_name;
        private String writer_address;
        private String key;
        private String value;
    }
}
