package org.medibloc.panacea;

import org.bitcoinj.core.ECKey;
import org.junit.Test;
import org.medibloc.panacea.domain.DIDs;
import panacea.did.v2.DIDDocument;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DIDTest {

    @Test
    public void testGenerate() throws NoSuchAlgorithmException {
        ECKey ecKey = new ECKey(new SecureRandom());
        byte[] pubKey = ecKey.getPubKeyPoint().getEncoded(true);

        String did = DIDs.createDID(pubKey);
        assertTrue(did.matches("^did:panacea:[123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz]{32,44}$"));
    }

    @Test
    public void testVerificationMethod() {
        String did = "did:panacea:7Prd74ry1Uct87nZqL3ny7aR7Cg46JamVbJgk8azVgUm";
        assertEquals("did:panacea:7Prd74ry1Uct87nZqL3ny7aR7Cg46JamVbJgk8azVgUm#key1", DIDs.createVerificationMethodId(did, "key1"));
    }
}
