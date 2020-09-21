package org.medibloc.panacea.encoding.message.did;

import org.bitcoinj.core.ECKey;
import org.junit.Test;

import java.security.SecureRandom;

import static org.junit.Assert.*;

public class DidTest {

    @Test
    public void testGenerate() {
        ECKey ecKey = new ECKey(new SecureRandom());
        byte[] pubKey = ecKey.getPubKeyPoint().getEncoded(true);

        Did did = new Did(Did.NetworkID.TESTNET, pubKey);
        System.out.println(did);
        assertTrue(did.getValue().matches("^did:panacea:(mainnet|testnet):[123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz]{21,22}$"));
    }
}
