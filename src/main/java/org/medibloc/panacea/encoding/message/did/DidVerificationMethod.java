package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.*;
import org.bitcoinj.core.Base58;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class DidVerificationMethod {
    private Id id;
    private DidKeyType type;
    private Did controller;
    private String publicKeyBase58;

    public DidVerificationMethod(Id id, DidKeyType type, Did controller, byte[] publicKey) {
        this.id = id;
        this.type = type;
        this.controller = controller;
        this.publicKeyBase58 = Base58.encode(publicKey);
    }

    @AllArgsConstructor
    @Getter
    @ToString
    @EqualsAndHashCode
    public static class Id {
        @JsonValue
        private final String value;

        public Id(Did did, String name) {
            this(String.format("%s#%s", did.getValue(), name));
        }
    }
}
