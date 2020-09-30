package org.medibloc.panacea.encoding.message.did;

import org.junit.Test;

import static org.junit.Assert.*;

public class DidVerificationMethodTest {
    @Test
    public void testFromString() {
        Did did = new Did("did:panacea:7Prd74ry1Uct87nZqL3ny7aR7Cg46JamVbJgk8azVgUm");
        DidVerificationMethod.Id id = new DidVerificationMethod.Id(did, "key1");
        assertEquals("did:panacea:7Prd74ry1Uct87nZqL3ny7aR7Cg46JamVbJgk8azVgUm#key1", id.getValue());
    }
}
