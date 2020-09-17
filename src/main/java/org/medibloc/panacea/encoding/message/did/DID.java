package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.*;
import org.bitcoinj.core.Base58;

import javax.annotation.MatchesPattern;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class DID {
    @JsonValue
    private final String value;

    private static final short pubKeyTruncateLen = 16;

    public DID(NetworkID networkID, byte[] pubKey) {
        this(String.format(
                "did:panacea:%s:%s",
                networkID.getValue(),
                truncateAndEncodePubKey(pubKey)
        ));
    }

    private static String truncateAndEncodePubKey(byte[] pubKey) {
        if (pubKey.length < pubKeyTruncateLen) {
            throw new IllegalArgumentException("public key is too short. it should be >= " + pubKeyTruncateLen);
        }

        byte[] pubKeyTruncated = new byte[pubKeyTruncateLen];
        System.arraycopy(pubKey, 0, pubKeyTruncated, 0, pubKeyTruncateLen);
        return Base58.encode(pubKeyTruncated);
    }

    @AllArgsConstructor
    @Getter
    public enum NetworkID {
        MAINNET("mainnet"),
        TESTNET("testnet");

        @JsonValue
        private final String value;
    }
}
