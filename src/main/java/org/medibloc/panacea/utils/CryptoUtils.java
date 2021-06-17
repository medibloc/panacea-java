package org.medibloc.panacea.utils;

import com.google.protobuf.InvalidProtocolBufferException;
import cosmos.auth.v1beta1.BaseAccount;
import cosmos.crypto.secp256k1.Keys;
import org.apache.commons.net.util.Base64;
import org.medibloc.panacea.PanaceaApiException;

public class CryptoUtils {

    public static String getPublicKeyFrom(BaseAccount account) throws PanaceaApiException {
        try {
            byte[] publicKeyToByteArray = account.getPubKey().unpack(Keys.PubKey.class).getKey().toByteArray();
            return Base64.encodeBase64StringUnChunked(publicKeyToByteArray);
        } catch (InvalidProtocolBufferException e) {
            throw new PanaceaApiException(e.getMessage());
        }
    }
}
