package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.*;
import org.bitcoinj.core.Base58;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Did {
    @JsonValue
    private final String value;

    public Did(byte[] pubKey) throws NoSuchAlgorithmException {
        this(String.format("did:panacea:%s", encodePubKey(pubKey)));
    }

    private static String encodePubKey(byte[] pubKey) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        return Base58.encode(digest.digest(pubKey));
    }

    @Override
    public String toString() {
        return value;
    }
}
