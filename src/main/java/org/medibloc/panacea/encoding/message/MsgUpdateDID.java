package org.medibloc.panacea.encoding.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.apache.commons.codec.binary.Base64;
import org.medibloc.panacea.DIDWallet;
import org.medibloc.panacea.encoding.message.did.DID;
import org.medibloc.panacea.encoding.message.did.DIDDocument;
import org.medibloc.panacea.encoding.message.did.DIDSignable;
import org.medibloc.panacea.encoding.message.did.DIDVerificationMethod;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgUpdateDID implements PanaceaTransactionMessage {
    private final String type = "did/MsgUpdateDID";
    private Value value;

    public MsgUpdateDID(DID did, DIDDocument document, String fromAddress) {
        this.value = new MsgUpdateDID.Value(did, document, fromAddress);
    }

    public void sign(DIDVerificationMethod.ID veriMethodId, DIDWallet wallet, Long sequence) throws IOException, NoSuchAlgorithmException {
        byte[] sig = wallet.sign(new DIDSignable(this.value.getDocument(), sequence));
        this.value.setSignatureBase64(Base64.encodeBase64String(sig));
        this.value.setVerificationMethodId(veriMethodId);
    }

    @RequiredArgsConstructor
    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonPropertyOrder(alphabetic = true)
    public static class Value {
        @NonNull
        private DID did;
        @NonNull
        private DIDDocument document;
        @JsonProperty("verification_method_id")
        private DIDVerificationMethod.ID verificationMethodId;
        @JsonProperty("signature")
        private String signatureBase64;
        @NonNull
        @JsonProperty("from_address")
        private String fromAddress;
    }
}
