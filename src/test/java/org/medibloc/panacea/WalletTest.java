package org.medibloc.panacea;

import org.junit.Assert;
import org.junit.Test;

public class WalletTest {

    String mnemonic = "giraffe wreck kit enemy anger nephew silk sphere tuna tube lady evil market lizard humor usage sand cattle wedding access wall basket define fresh";
    String hrp = "panacea";

    @Test
    public void createWalletFromMnemonicCodeTest() {
        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, hrp);
        System.out.println(wallet.getAddress());
        Assert.assertEquals("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm", wallet.getAddress());
    }

    @Test
    public void test() {
        
    }
}
