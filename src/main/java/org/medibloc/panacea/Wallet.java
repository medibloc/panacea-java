package org.medibloc.panacea;


import lombok.ToString;
import org.apache.commons.net.util.Base64;
import org.medibloc.panacea.domain.Account;
import org.medibloc.panacea.domain.NodeInfo;
import org.medibloc.panacea.encoding.Crypto;
import org.medibloc.panacea.encoding.EncodeUtils;
import org.medibloc.panacea.encoding.message.Pubkey;
import org.medibloc.panacea.ledger.LedgerDevice;
import org.medibloc.panacea.ledger.LedgerKey;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

@ToString
public class Wallet extends BaseWallet {
    private final LedgerKey ledgerKey;
    private final String address;
    private final byte[] addressBytes;
    private final Pubkey pubKeyForSign;
    private Long accountNumber;
    private Long sequence;
    private final String pubKeyBech32;
    private String chainId;

    public Wallet(String privateKey, String hrp) {
        super(privateKey);

        this.ledgerKey = null;
        this.address = Crypto.getAddressFromECKey(getEcKey(), hrp);
        this.addressBytes = Crypto.decodeAddress(this.address);
        this.pubKeyForSign = new Pubkey();
        byte[] pubKeyBytes = getPubKeyBytes();
        this.pubKeyForSign.setValue(Base64.encodeBase64String(pubKeyBytes));
        this.pubKeyBech32 = encodeBech32PubKey(pubKeyBytes, hrp + "pub");
    }

    public Wallet(int[] bip44Path, LedgerDevice ledgerDevice, String hrp) throws IOException {
        this(new LedgerKey(ledgerDevice, bip44Path, hrp), hrp);
    }

    private Wallet(LedgerKey ledgerKey, String hrp) throws IOException {
        super(ledgerKey.getPubKey());

        this.ledgerKey = ledgerKey;
        this.address = Crypto.getAddressFromECKey(getEcKey(), hrp);
        this.addressBytes = Crypto.decodeAddress(this.address);
        this.pubKeyForSign = new Pubkey();
        byte[] pubKeyBytes = getPubKeyBytes();
        this.pubKeyForSign.setValue(Base64.encodeBase64String(pubKeyBytes));
        this.pubKeyBech32 = encodeBech32PubKey(pubKeyBytes, hrp + "pub");
    }

    public static Wallet createRandomWallet(String hrp) {
        return createWalletFromMnemonicCode(Crypto.generateMnemonicCode(), hrp);
    }

    public static Wallet createWalletFromEntropy(String hrp, byte[] entropy) {
        return createWalletFromMnemonicCode(Crypto.generateMnemonicCodeFromEntropy(entropy), hrp);
    }

    public static Wallet createWalletFromMnemonicCode(String mnemonic, String hrp) {
        return createWalletFromMnemonicCode(mnemonic, hrp, 0);
    }

    public static Wallet createWalletFromMnemonicCode(List<String> words, String hrp) {
        return createWalletFromMnemonicCode(words, hrp, 0);
    }

    public static Wallet createWalletFromMnemonicCode(String mnemonic, String hrp, int index) {
        List<String> words = mnemonicStringToWords(mnemonic);
        return createWalletFromMnemonicCode(words, hrp, index);
    }

    public static Wallet createWalletFromMnemonicCode(List<String> words, String hrp, int index) {
        String privateKey = Crypto.getPrivateKeyFromMnemonicCode(words, index);
        return new Wallet(privateKey, hrp);
    }

    @Override
    public byte[] sign(byte[] data) throws IOException, NoSuchAlgorithmException {
        if (getEcKey().isPubKeyOnly() && ledgerKey != null) {
            return Crypto.sign(data, ledgerKey);
        }
        return super.sign(data);
    }

    public synchronized void initAccount(PanaceaApiRestClient client) throws PanaceaApiException {
        Account account = client.getAccount(this.getAddress());
        if (account != null) {
            this.accountNumber = account.getValue().getAccountNumber();
            this.sequence = account.getValue().getSequence();
        } else {
            throw new IllegalStateException(
                    "Cannot get account information for address " + this.getAddress() +
                            " (does this account exist on the blockchain yet?)");
        }
    }

    public synchronized void reloadAccount(PanaceaApiRestClient client) throws PanaceaApiException {
        Account account = client.getAccount(this.getAddress());
        this.accountNumber = account.getValue().getAccountNumber();
        this.sequence = account.getValue().getSequence();
    }

    public synchronized void reloadAccountOffline(Long accountNumber, Long sequence, String chainId) {
        this.accountNumber = accountNumber;
        this.sequence = sequence;
        this.chainId = chainId;
    }

    public synchronized void increaseAccountSequence() {
        if (this.sequence != null)
            this.sequence++;
    }

    public synchronized void decreaseAccountSequence() {
        if (this.sequence != null)
            this.sequence--;
    }

    public synchronized long getSequence() {
        if (sequence == null)
            throw new IllegalStateException("Account sequence is not initialized.");
        return sequence;
    }

    public synchronized void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public synchronized void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public synchronized void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public synchronized void invalidAccountSequence() {
        this.sequence = null;
    }

    public synchronized void ensureWalletIsReady(PanaceaApiRestClient client) throws PanaceaApiException {
        if (accountNumber == null) {
            initAccount(client);
        }
        if (sequence == null) {
            reloadAccount(client);
        }

        if (chainId == null) {
            initChainId(client);
        }
    }

    public synchronized void ensureWalletIsReadyOffline(Long accountNumber, Long sequence, String chainId) {
        reloadAccountOffline(accountNumber, sequence, chainId);
    }

    public synchronized void initChainId(PanaceaApiRestClient client) throws PanaceaApiException {
        NodeInfo info = client.getNodeInfo();
        chainId = info.getNetwork();
    }

    public String getAddress() {
        return address;
    }

    public LedgerKey getLedgerKey() {
        return ledgerKey;
    }

    public Pubkey getPubKeyForSign() {
        return pubKeyForSign;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public String getChainId() {
        return chainId;
    }

    public byte[] getAddressBytes() {
        return addressBytes;
    }

    @Deprecated
    public String getPubKey() {
        return getPubKeyBech32();
    }

    public String getPubKeyBech32() {
        return pubKeyBech32;
    }

    private String encodeBech32PubKey(byte[] data, String hrp) {
        byte[] typePrefixBytes = EncodeUtils.hexStringToByteArray("EB5AE98721");
        byte[] bz = new byte[typePrefixBytes.length + data.length];
        System.arraycopy(typePrefixBytes, 0, bz, 0, typePrefixBytes.length);
        System.arraycopy(data, 0, bz, typePrefixBytes.length, data.length);
        return Crypto.encodeAddress(hrp, bz);
    }

    private byte[] decodeBech32PubKey(String pubKey) {
        byte[] bz = Crypto.decodeAddress(pubKey);
        byte[] typePrefixBytes = EncodeUtils.hexStringToByteArray("EB5AE98721");
        return Arrays.copyOfRange(bz, typePrefixBytes.length, bz.length);
    }
}
