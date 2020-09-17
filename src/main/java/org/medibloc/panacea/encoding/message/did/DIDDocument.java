package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.Collections;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
import static com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class DIDDocument {
    @JsonProperty("@context")
    @JsonFormat(with = {ACCEPT_SINGLE_VALUE_AS_ARRAY, WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED})
    private List<Context> contexts;
    private DID id;
    @JsonProperty("verificationMethod")
    private List<DIDVerificationMethod> verificationMethods;
    @JsonProperty("authentication")
    private List<DIDAuthentication> authentications;

    @AllArgsConstructor
    @Getter
    public static enum Context {
        DID_V1("https://www.w3.org/ns/did/v1"),
        Security_V1("https://www.w3.org/ns/did/v1");

        @JsonValue
        private final String value;
    }
}
