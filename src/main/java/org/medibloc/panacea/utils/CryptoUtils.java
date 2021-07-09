package org.medibloc.panacea.utils;

import com.google.protobuf.InvalidProtocolBufferException;
import cosmos.auth.v1beta1.BaseAccount;
import cosmos.crypto.secp256k1.Keys;
import cosmos.crypto.secp256k1.PrivKey;
import cosmos.crypto.secp256k1.PubKey;
import org.apache.commons.net.util.Base64;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.Sha256Hash;
import org.bitcoinj.core.Utils;
import org.bitcoinj.crypto.*;
import org.medibloc.panacea.PanaceaApiException;
import org.medibloc.panacea.encoding.Bech32;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class CryptoUtils {
    private static final String HD_PATH = "44H/371H/0H/0/0";
    private static final String HD_PATH_PREFIX = "44H/371H/0H/0/";

    public static byte[] sign(byte[] msg, ECKey k) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] msgHash = digest.digest(msg);

        ECKey.ECDSASignature signature = k.sign(Sha256Hash.wrap(msgHash));

        byte[] result = new byte[64];
        System.arraycopy(Utils.bigIntegerToBytes(signature.r, 32), 0, result, 0, 32);
        System.arraycopy(Utils.bigIntegerToBytes(signature.s, 32), 0, result, 32, 32);
        return result;
    }

    public static byte[] decodeAddress(String address) throws SegwitAddressException {
        byte[] dec = Bech32.decode(address).getData();
        return convertBits(dec, 0, dec.length, 5, 8, false);
    }

    public static String encodeAddress(String hrp, byte[] code) {
        byte[] convertedCode = CryptoUtils.convertBits(code, 0, code.length, 8, 5, true);
        return Bech32.encode(hrp, convertedCode);
    }

    public static String getAddressFromPrivateKey(PrivKey privateKey, String hrp) {
        ECKey ecKey = ECKey.fromPrivate(new BigInteger(privateKey.getKey().toStringUtf8(), 16));
        return getAddressFromECKey(ecKey, hrp);
    }

    public static String getAddressFromECKey(ECKey ecKey, String hrp) {
        byte[] hash = ecKey.getPubKeyHash();
        return Bech32.encode(hrp, convertBits(hash, 0, hash.length, 8, 5, false));
    }

    public static String getPublicKeyFrom(BaseAccount account) throws PanaceaApiException {
        try {
            byte[] publicKeyToByteArray = account.getPubKey().unpack(PubKey.class).getKey().toByteArray();
            return Base64.encodeBase64StringUnChunked(publicKeyToByteArray);
        } catch (InvalidProtocolBufferException e) {
            throw new PanaceaApiException(e.getMessage());
        }
    }

    public static DeterministicKey getDeterministicKey(List<String> words, String hdPath) {
        byte[] seed = MnemonicCode.toSeed(words, "");
        DeterministicKey key = HDKeyDerivation.createMasterPrivateKey(seed);

        List<ChildNumber> childNumbers = HDUtils.parsePath(hdPath);
        for (ChildNumber childNumber : childNumbers) {
            key = HDKeyDerivation.deriveChildKey(key, childNumber);
        }
        return key;
    }

    public static String getPublicKeyFromMnemonicCode(List<String> words) {
        return getPublicKeyFromMnemonicCode(words, HD_PATH);
    }

    public static String getPublicKeyFromMnemonicCode(List<String> words, int index) {
        return getPublicKeyFromMnemonicCode(words, String.format("%s%d", HD_PATH_PREFIX, index));
    }

    public static String getPublicKeyFromMnemonicCode(List<String> words, String hdPath) {
        return getDeterministicKey(words, hdPath).getPublicKeyAsHex();
    }

    public static String getPrivateKeyFromMnemonicCode(List<String> words) {
        return getPrivateKeyFromMnemonicCode(words, HD_PATH);
    }

    public static String getPrivateKeyFromMnemonicCode(List<String> words, String hdPath) {
        return getDeterministicKey(words, hdPath).getPrivateKeyAsHex();
    }

    public static String getPrivateKeyFromMnemonicCode(List<String> words, int index) {
        return getPrivateKeyFromMnemonicCode(words, String.format("%s%d", HD_PATH_PREFIX, index));
    }

    public static List<String> generateMnemonicCode() {
        byte[] entropy = new byte[256 / 8];
        new SecureRandom().nextBytes(entropy);
        try {
            return MnemonicCode.INSTANCE.toMnemonic(entropy);
        } catch (MnemonicException.MnemonicLengthException e) {
            return null;
        }
    }

    public static List<String> generateMnemonicCodeFromEntropy(byte[] entropy) {
        try {
            byte[] hash = Sha256Hash.hash(entropy);
            return MnemonicCode.INSTANCE.toMnemonic(hash);
        } catch (MnemonicException.MnemonicLengthException e) {
            return null;
        }
    }

    /**
     * see https://github.com/sipa/bech32/pull/40/files
     */
    public static byte[] convertBits(final byte[] in, final int inStart, final int inLen,
                                     final int fromBits, final int toBits, final boolean pad)
            throws SegwitAddressException {
        int acc = 0;
        int bits = 0;
        ByteArrayOutputStream out = new ByteArrayOutputStream(64);
        final int maxv = (1 << toBits) - 1;
        final int max_acc = (1 << (fromBits + toBits - 1)) - 1;
        for (int i = 0; i < inLen; i++) {
            int value = in[i + inStart] & 0xff;
            if ((value >>> fromBits) != 0) {
                throw new SegwitAddressException(String.format(
                        "Input value '%X' exceeds '%d' bit size", value, fromBits));
            }
            acc = ((acc << fromBits) | value) & max_acc;
            bits += fromBits;
            while (bits >= toBits) {
                bits -= toBits;
                out.write((acc >>> bits) & maxv);
            }
        }
        if (pad) {
            if (bits > 0) out.write((acc << (toBits - bits)) & maxv);
        } else if (bits >= fromBits || ((acc << (toBits - bits)) & maxv) != 0) {
            throw new SegwitAddressException("Could not convert bits, invalid padding");
        }
        return out.toByteArray();
    }

    public static byte[] signatureConvertDERtoBER(byte[] signature) throws IOException {
        int minSigLen = 8;
        if (signature.length < minSigLen) {
            throw new IOException("malformed signature: too short");
        }
        int index = 0;
        if (signature[index] != 0x30) {
            throw new IOException("malformed signature: no header magic");
        }
        index++;
        int siglen = signature[index];
        index++;

        if ((siglen + 2) > signature.length || (siglen + 2) < minSigLen) {
            throw new IOException("malformed signature: bad length");
        }
        signature = Arrays.copyOfRange(signature, 0, siglen + 2);

        if (signature[index] != 0x02) {
            throw new IOException("malformed signature: no 1st int marker");
        }
        index++;

        // Length of signature R.
        int rLen = (int) signature[index];
        index++;
        if (rLen <= 0 || rLen > signature.length - index - 3) {
            throw new IOException("malformed signature: bogus R length");
        }

        byte[] rBytes = Arrays.copyOfRange(signature, index, index + rLen);
        BigInteger signatureR = new BigInteger(rBytes);

        index += rLen;

        if (signature[index] != 0x02) {
            throw new IOException("malformed signature: no 2nd int marker");
        }
        index++;

        // Length of signature S.
        int sLen = (int) signature[index];
        index++;

        if (sLen <= 0 || sLen > (signature.length - index)) {
            throw new IOException("malformed signature: bogus S length");
        }

        byte[] sBytes = Arrays.copyOfRange(signature, index, index + sLen);
        BigInteger signatureS = new BigInteger(sBytes);

        byte[] result = new byte[64];
        System.arraycopy(Utils.bigIntegerToBytes(signatureR, 32), 0, result, 0, 32);
        System.arraycopy(Utils.bigIntegerToBytes(signatureS, 32), 0, result, 32, 32);
        return result;
    }

    public static class SegwitAddressException extends IllegalArgumentException {
        SegwitAddressException(Exception e) {
            super(e);
        }

        SegwitAddressException(String s) {
            super(s);
        }
    }


}
