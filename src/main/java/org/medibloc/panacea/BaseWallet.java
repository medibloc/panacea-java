package org.medibloc.panacea;


import lombok.ToString;
import org.apache.commons.lang3.StringUtils;
import org.bitcoinj.core.ECKey;
import org.medibloc.panacea.encoding.Crypto;
import org.medibloc.panacea.encoding.EncodeUtils;

import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

@ToString
class BaseWallet {
    private final ECKey ecKey;

    BaseWallet(String privateKey) {
        if (!StringUtils.isEmpty(privateKey)) {
            this.ecKey = ECKey.fromPrivate(new BigInteger(privateKey, 16));
        } else {
            throw new IllegalArgumentException("Private key cannot be empty.");
        }
    }

    BaseWallet(byte[] pubKey) {
        this.ecKey = ECKey.fromPublicOnly(pubKey);
    }

    public static List<String> mnemonicStringToWords(String mnemonic) {
        return Arrays.asList(mnemonic.split("\\s+"));
    }

    public byte[] sign(byte[] data) throws IOException, NoSuchAlgorithmException {
        return Crypto.sign(data, getEcKey());
    }

    public byte[] sign(Object object) throws IOException, NoSuchAlgorithmException {
        byte[] data = EncodeUtils.toJsonEncodeBytes(object);
        return sign(data);
    }

    @Deprecated
    public String getPrivateKey() {
        return getPrivateKeyHexString();
    }

    public ECKey getEcKey() {
        return ecKey;
    }

    public String getPrivateKeyHexString() {
        return ecKey.getPrivateKeyAsHex();
    }

    public String getPubKeyHexString() {
        return ecKey.getPublicKeyAsHex();
    }

    public byte[] getPubKeyBytes() {
        return ecKey.getPubKey();
    }
}
