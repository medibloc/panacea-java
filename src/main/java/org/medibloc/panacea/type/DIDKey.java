package org.medibloc.panacea.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DIDKey {
    ES256K("Secp256k1VerificationKey2018");

    private final String value;
}
