package org.medibloc.panacea.encoding.message.did;

import org.junit.Test;

import static org.junit.Assert.*;

public class DIDVerificationMethodTest {
    @Test
    public void testFromString() {
        DID did = new DID("did:panacea:testnet:LGtDg3tDCvRbeL1K2NPwp");
        DIDVerificationMethod.ID id = new DIDVerificationMethod.ID(did, "key1");
        assertEquals("did:panacea:testnet:LGtDg3tDCvRbeL1K2NPwp#key1", id.getValue());
    }
}
