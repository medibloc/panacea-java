package org.medibloc.panacea.encoding.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.apache.commons.codec.binary.Base64;
import org.medibloc.panacea.DidWallet;
import org.medibloc.panacea.encoding.message.did.Did;
import org.medibloc.panacea.encoding.message.did.DidDocument;
import org.medibloc.panacea.encoding.message.did.DidSignable;
import org.medibloc.panacea.encoding.message.did.DidVerificationMethod;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgUpdateDid implements PanaceaTransactionMessage {
    private final String type = "did/MsgUpdateDID";
    private Value value;

    public MsgUpdateDid(DidDocument document, DidVerificationMethod.Id veriMethodId, DidWallet wallet, Long sequence, String fromAddress) throws IOException, NoSuchAlgorithmException {
        byte[] sig = wallet.sign(new DidSignable(document, sequence));
        this.value = new Value(
                document.getId(),
                document,
                veriMethodId,
                Base64.encodeBase64String(sig),
                fromAddress
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonPropertyOrder(alphabetic = true)
    public static class Value {
        @NonNull
        private Did did;
        @NonNull
        private DidDocument document;
        @NonNull
        @JsonProperty("verification_method_id")
        private DidVerificationMethod.Id verificationMethodId;
        @NonNull
        @JsonProperty("signature")
        private String signatureBase64;
        @NonNull
        @JsonProperty("from_address")
        private String fromAddress;
    }
}
