package org.medibloc.panacea;

import org.bitcoinj.core.ECKey;
import org.junit.Test;
import org.medibloc.panacea.utils.CryptoUtils;

import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class WalletTest {
    // test data
    private static final String hrp = "panacea";
    private static final String mnemonic = "benefit draft eye juice custom short project alone churn boss program tackle tobacco update chimney";
    private static final String privKeyHex = "1f93bd070c548d1b4f80afb0cce311f45146ab75ab6b944f0db3dbd496822436";
    private static final String pubKeyForSign = "A+Di0Y5PBFyCCuWrzKRPsnrte9SR/Qe0XeWPed1vkvIS\r\n";
    private static final String pubKeyBech32 = "panaceapub1addwnpepq0sw95vwfuz9eqs2uk4uefz0kfaw6775j87s0dzauk8hnht0jtepyshtrwg";
    private static final String pubKeyHex = "03e0e2d18e4f045c820ae5abcca44fb27aed7bd491fd07b45de58f79dd6f92f212";
    private static final String address = "panacea19ca5yrl6av7fu63rcg26mq3s7dhc57fhqg5x5g";

    @Test
    public void signViaPrivKey() throws IOException, NoSuchAlgorithmException {
        String data = "hello";
        byte[] expectedSig = CryptoUtils.sign(
                data.getBytes(),
                ECKey.fromPrivate(new BigInteger(privKeyHex, 16))
        );

        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, hrp);
        assertArrayEquals(expectedSig, wallet.sign(data.getBytes()));
    }

    @Test
    public void getPrivateKeyHexString() {
        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, hrp);
        assertEquals(privKeyHex, wallet.getPrivateKey());
        assertEquals(privKeyHex, wallet.getPrivateKeyHexString());
    }

    @Test
    public void getAddress() {
        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, hrp);
        assertEquals(address, wallet.getAddress());
    }

    @Test
    public void getPubKeyForSign() {
        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, hrp);
        assertEquals(pubKeyForSign, wallet.getPubKeyBase64());
    }

    @Test
    public void getPubKeyBech32() {
        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, hrp);
        assertEquals(pubKeyBech32, wallet.getPubKey());
        assertEquals(pubKeyBech32, wallet.getPubKeyBech32());
    }

    @Test
    public void getPubKeyHexString() {
        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, hrp);
        assertEquals(pubKeyHex, wallet.getPubKeyHexString());
    }
}
