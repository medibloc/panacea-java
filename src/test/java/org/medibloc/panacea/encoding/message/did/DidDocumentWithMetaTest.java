package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class DidDocumentWithMetaTest {
    private static final String serialized = "{\"document\":{\"@context\":\"https://www.w3.org/ns/did/v1\",\"authentication\":[\"did:panacea:testnet:LGtDg3tDCvRbeL1K2NPwp#key1\",{\"controller\":\"did:panacea:testnet:LGtDg3tDCvRbeL1K2NPwp\",\"id\":\"did:panacea:testnet:LGtDg3tDCvRbeL1K2NPwp#key1\",\"publicKeyBase58\":\"oNFmtpKBr77dp5SvpBm2EzMdGfe2pe4kT5snftXTPw4b\",\"type\":\"Secp256k1VerificationKey2018\"}],\"id\":\"did:panacea:testnet:LGtDg3tDCvRbeL1K2NPwp\",\"verificationMethod\":[{\"controller\":\"did:panacea:testnet:LGtDg3tDCvRbeL1K2NPwp\",\"id\":\"did:panacea:testnet:LGtDg3tDCvRbeL1K2NPwp#key1\",\"publicKeyBase58\":\"oNFmtpKBr77dp5SvpBm2EzMdGfe2pe4kT5snftXTPw4b\",\"type\":\"Secp256k1VerificationKey2018\"}]},\"sequence\":\"100\"}";

    private static final Did did = new Did("did:panacea:testnet:LGtDg3tDCvRbeL1K2NPwp");
    private static final DidVerificationMethod veriMethod = new DidVerificationMethod(
            new DidVerificationMethod.Id(did, "key1"),
            DidKeyType.ES256K,
            did,
            "oNFmtpKBr77dp5SvpBm2EzMdGfe2pe4kT5snftXTPw4b"
    );
    private static final DidDocumentWithMeta docWithMeta = new DidDocumentWithMeta(
            new DidDocument(
                    Arrays.asList(DidDocument.Context.DID_V1),
                    did,
                    Collections.singletonList(veriMethod),
                    Arrays.asList(
                            new DidVeriMethodIdAuthentication(veriMethod.getId()),
                            new DidVeriMethodAuthentication(veriMethod)
                    )
            ),
            100L
    );

    @Test
    public void testJSONSerialization() throws JsonProcessingException {
        assertEquals(serialized, new ObjectMapper().writeValueAsString(docWithMeta));
    }

    @Test
    public void testJSONDeserialization() throws IOException {
        assertEquals(docWithMeta, new ObjectMapper().readValue(serialized, DidDocumentWithMeta.class));
    }
}
