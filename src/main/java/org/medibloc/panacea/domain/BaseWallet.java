package org.medibloc.panacea.domain;

import cosmos.crypto.secp256k1.Keys;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;
import org.bitcoinj.core.ECKey;
import org.medibloc.panacea.utils.CryptoUtils;
import org.medibloc.panacea.utils.EncodeUtils;

import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

@ToString
public class BaseWallet {
    private final ECKey ecKey;

    BaseWallet(Keys.PrivKey privateKey) {
        String privateKeyStr = privateKey.getKey().toStringUtf8();
        if (!StringUtils.isEmpty(privateKeyStr)) {
            this.ecKey = ECKey.fromPrivate(new BigInteger(privateKeyStr, 16));
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
        return CryptoUtils.sign(data, getEcKey());
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
