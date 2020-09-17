package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * One of the DIDAuthentication types which is a dedicated verificationMethod only for the DID authentication.
 */
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class DIDVeriMethodAuthentication implements DIDAuthentication {
    @JsonValue
    private final DIDVerificationMethod method;
}
