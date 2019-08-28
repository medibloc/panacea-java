package org.medibloc.panacea;

import org.apache.commons.codec.binary.Base64;
import org.junit.Assert;
import org.junit.Test;

public class WalletTest {
    @Test
    public void testBase64() {
        String[] testStringArr = new String[]{"Encodes", "binary", "data", "using", "the", "base64", "algorithm", "but"
                , "does", "not", "chunk", "the", "output.", "NOTE:", "We", "changed", "the", "behaviour", "of", "this"
                , "method", "from", "multi-line", "chunking", "(commons-codec-1.4)", "to", "single-line", "non-chunking"
                , "(commons-codec-1.5)."};

        for (String testString: testStringArr) {
            String oldVersion = new String(Base64.encodeBase64(testString.getBytes()));
            String newVersion = Base64.encodeBase64String(testString.getBytes());

            if (!oldVersion.equals(newVersion)) {
                Assert.fail();
            }

            // System.out.println(Arrays.toString(oldVersion.getBytes()));
            // System.out.println(Arrays.toString(newVersion.getBytes()));
        }
    }
}
