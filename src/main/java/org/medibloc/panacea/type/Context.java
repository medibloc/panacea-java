package org.medibloc.panacea.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Context {
    DID_V1("https://www.w3.org/ns/did/v1"),
    SECURITY_V1("https://w3id.org/security/v1");

    private final String value;
}
