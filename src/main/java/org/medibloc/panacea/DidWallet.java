package org.medibloc.panacea;


import lombok.ToString;
import org.medibloc.panacea.encoding.Crypto;

import java.util.List;

@ToString
public class DidWallet extends BaseWallet {
    private DidWallet(String privateKey) {
        super(privateKey);
    }

    public static DidWallet createRandomWallet() {
        return createWalletFromMnemonicCode(Crypto.generateMnemonicCode());
    }

    public static DidWallet createWalletFromEntropy(byte[] entropy) {
        return createWalletFromMnemonicCode(Crypto.generateMnemonicCodeFromEntropy(entropy));
    }

    public static DidWallet createWalletFromMnemonicCode(String mnemonic) {
        return createWalletFromMnemonicCode(mnemonic, 0);
    }

    public static DidWallet createWalletFromMnemonicCode(List<String> words) {
        return createWalletFromMnemonicCode(words, 0);
    }

    public static DidWallet createWalletFromMnemonicCode(String mnemonic, int index) {
        List<String> words = mnemonicStringToWords(mnemonic);
        return createWalletFromMnemonicCode(words, index);
    }

    public static DidWallet createWalletFromMnemonicCode(List<String> words, int index) {
        String privateKey = Crypto.getPrivateKeyFromMnemonicCode(words, index);
        return new DidWallet(privateKey);
    }
}
