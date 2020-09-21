package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DidKeyType {
    ES256K("Secp256k1VerificationKey2018");

    @JsonValue
    private final String value;
}
