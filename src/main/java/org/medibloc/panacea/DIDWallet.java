package org.medibloc.panacea;

import lombok.ToString;
import org.medibloc.panacea.utils.CryptoUtils;

import java.util.List;

@ToString
public class DIDWallet extends BaseWallet {

    private DIDWallet(String privateKey) {
        super(privateKey);
    }

    public static DIDWallet createRandomWallet() {
        return createWalletFromMnemonicCode(CryptoUtils.generateMnemonicCode());
    }

    public static DIDWallet createWalletFromEntropy(byte[] entropy) {
        return createWalletFromMnemonicCode(CryptoUtils.generateMnemonicCodeFromEntropy(entropy));
    }

    public static DIDWallet createWalletFromMnemonicCode(String mnemonic) {
        return createWalletFromMnemonicCode(mnemonic, 0);
    }

    public static DIDWallet createWalletFromMnemonicCode(List<String> words) {
        return createWalletFromMnemonicCode(words, 0);
    }

    public static DIDWallet createWalletFromMnemonicCode(String mnemonic, int index) {
        List<String> words = mnemonicStringToWords(mnemonic);
        return createWalletFromMnemonicCode(words, index);
    }

    public static DIDWallet createWalletFromMnemonicCode(List<String> words, int index) {
        String privateKey = CryptoUtils.getPrivateKeyFromMnemonicCode(words, index);
        return new DIDWallet(privateKey);
    }
}
