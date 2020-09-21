package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * One of the DidAuthentication types which is a dedicated verificationMethod only for the DID authentication.
 */
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class DidVeriMethodAuthentication implements DidAuthentication {
    @JsonValue
    private final DidVerificationMethod method;
}
