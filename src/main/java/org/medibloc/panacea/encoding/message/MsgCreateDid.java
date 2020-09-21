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
public class MsgCreateDid implements PanaceaTransactionMessage {
    private final String type = "did/MsgCreateDID";
    private Value value;

    public MsgCreateDid(Did did, DidDocument document, String fromAddress) {
        this.value = new Value(did, document, fromAddress);
    }

    public void sign(DidVerificationMethod.Id veriMethodId, DidWallet wallet, Long sequence) throws IOException, NoSuchAlgorithmException {
        byte[] sig = wallet.sign(new DidSignable(this.value.getDocument(), sequence));
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
        private Did did;
        @NonNull
        private DidDocument document;
        @JsonProperty("verification_method_id")
        private DidVerificationMethod.Id verificationMethodId;
        @JsonProperty("signature")
        private String signatureBase64;
        @NonNull
        @JsonProperty("from_address")
        private String fromAddress;
    }
}
