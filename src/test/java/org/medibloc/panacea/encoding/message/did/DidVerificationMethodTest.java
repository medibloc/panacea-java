package org.medibloc.panacea.encoding.message.did;

import org.junit.Test;

import static org.junit.Assert.*;

public class DidVerificationMethodTest {
    @Test
    public void testFromString() {
        Did did = new Did("did:panacea:testnet:LGtDg3tDCvRbeL1K2NPwp");
        DidVerificationMethod.Id id = new DidVerificationMethod.Id(did, "key1");
        assertEquals("did:panacea:testnet:LGtDg3tDCvRbeL1K2NPwp#key1", id.getValue());
    }
}
