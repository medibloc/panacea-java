package org.medibloc.panacea.encoding.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.medibloc.panacea.encoding.message.did.DID;
import org.medibloc.panacea.encoding.message.did.DIDDocument;
import org.medibloc.panacea.encoding.message.did.DIDVerificationMethod;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgCreateDID implements PanaceaTransactionMessage {
    private final String type = "did/MsgCreateDID";
    private Value value;

    @AllArgsConstructor
    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonPropertyOrder(alphabetic = true)
    public static class Value {
        private DID did;
        private DIDDocument document;
        @JsonProperty("verification_method_id")
        private DIDVerificationMethod.ID verificationMethodId;
        @JsonProperty("signature")
        private String signatureBase64;
        @JsonProperty("from_address")
        private String fromAddress;
    }
}
