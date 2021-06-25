package org.medibloc.panacea;

import lombok.ToString;
import org.apache.commons.lang3.StringUtils;
import org.bitcoinj.core.ECKey;
import org.medibloc.panacea.utils.CryptoUtils;

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

    public static List<String> mnemonicStringToWords(String mnemonic) {
        return Arrays.asList(mnemonic.split("\\s+"));
    }

    public byte[] sign(byte[] data) throws IOException, NoSuchAlgorithmException {
        return CryptoUtils.sign(data, getEcKey());
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
