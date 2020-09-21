package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * One of the DIDAuthentication types with reference to one of verificationMethods registered in the DID document.
 */
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class DidVeriMethodIdAuthentication implements DidAuthentication {
    @JsonValue
    private final DidVerificationMethod.Id id;
}
