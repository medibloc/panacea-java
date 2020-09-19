package org.medibloc.panacea.encoding.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.apache.commons.codec.binary.Base64;
import org.medibloc.panacea.DIDWallet;
import org.medibloc.panacea.encoding.message.did.DID;
import org.medibloc.panacea.encoding.message.did.DIDSignable;
import org.medibloc.panacea.encoding.message.did.DIDVerificationMethod;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgDeactivateDID implements PanaceaTransactionMessage {
    private final String type = "did/MsgDeleteDID";
    private Value value;

    public MsgDeactivateDID(DID did, String fromAddress) {
        this.value = new Value(did, fromAddress);
    }

    public void sign(DIDVerificationMethod.ID veriMethodId, DIDWallet wallet, Long sequence) throws IOException, NoSuchAlgorithmException {
        byte[] sig = wallet.sign(new DIDSignable(this.value.getDid(), sequence));
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
        @JsonProperty("verification_method_id")
        private DIDVerificationMethod.ID verificationMethodId;
        @JsonProperty("signature")
        private String signatureBase64;
        @NonNull
        @JsonProperty("from_address")
        private String fromAddress;
    }
}
