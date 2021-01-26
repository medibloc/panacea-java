package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.medibloc.panacea.DidWallet;

import java.security.NoSuchAlgorithmException;
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
public class DidDocument {
    @JsonProperty("@context")
    @JsonFormat(with = {ACCEPT_SINGLE_VALUE_AS_ARRAY, WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED})
    private List<Context> contexts;
    private Did id;
    @JsonProperty("verificationMethod")
    private List<DidVerificationMethod> verificationMethods;
    @JsonProperty("authentication")
    private List<DidAuthentication> authentications;

    @AllArgsConstructor
    @Getter
    public static enum Context {
        DID_V1("https://www.w3.org/ns/did/v1"),
        SECURITY_V1("https://w3id.org/security/v1");

        @JsonValue
        private final String value;
    }

    /**
     * Create a simple DID Document
     * @param didWallet DID Wallet
     * @return DID Document
     * @throws NoSuchAlgorithmException
     */
    public static DidDocument create(DidWallet didWallet) throws NoSuchAlgorithmException {
        byte[] pubKey = didWallet.getPubKeyBytes();

        Did did = new Did(pubKey);
        DidVerificationMethod veriMethod = new DidVerificationMethod(
                new DidVerificationMethod.Id(did, "key1"),
                DidKeyType.ES256K,
                did,
                pubKey
        );
        return new DidDocument(
                Collections.singletonList(Context.DID_V1),
                did,
                Collections.singletonList(veriMethod),
                Collections.singletonList((DidAuthentication) new DidVeriMethodIdAuthentication(veriMethod.getId()))
        );
    }
}
