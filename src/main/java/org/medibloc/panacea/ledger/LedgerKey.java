package org.medibloc.panacea.ledger;

import org.bitcoinj.core.Utils;
import org.medibloc.panacea.encoding.Crypto;

import java.io.IOException;

public class LedgerKey {
    private LedgerDevice ledgerDevice;
    private int[] bip44Path;
    private byte[] pubKey;
    private String hrp;

    public LedgerKey(LedgerDevice ledgerDevice, int[] bip44Path, String hrp) throws IOException, IllegalArgumentException {
        if (!LedgerUtils.verifyBIP44Path(bip44Path)) {
            throw new IllegalArgumentException("Invalid BIP44 path.");
        }
        if (!LedgerDevice.hasLedgerConnected()) {
            throw new IOException("No ledger device found");
        }
        this.ledgerDevice = ledgerDevice;
        this.bip44Path = bip44Path;
        this.pubKey = ledgerDevice.getPublicKeySECP256K1(bip44Path);
        this.hrp = hrp;
    }

    public String getAddress() {
        byte[] hash = Utils.sha256hash160(this.pubKey);
        return Crypto.encodeAddress(hrp, hash);
    }

    public LedgerDevice getLedgerDevice() {
        return ledgerDevice;
    }

    public int[] getBip44Path() {
        return bip44Path;
    }

    public byte[] getPubKey() {
        return pubKey;
    }

    public String getHrp() {
        return hrp;
    }
}
