package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public enum DIDKeyType {
    ES256K("Secp256k1VerificationKey2018");

    @JsonValue
    private final String value;
}
