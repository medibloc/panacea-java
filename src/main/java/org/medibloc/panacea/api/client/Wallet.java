package org.medibloc.panacea.api.client;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.bitcoinj.core.ECKey;
import org.medibloc.panacea.api.client.domain.Account;
import org.medibloc.panacea.api.client.domain.NodeInfo;
import org.medibloc.panacea.api.client.encoding.Crypto;
import org.medibloc.panacea.api.client.encoding.EncodeUtils;
import org.medibloc.panacea.api.client.encoding.message.Pubkey;
import org.medibloc.panacea.api.client.ledger.LedgerDevice;
import org.medibloc.panacea.api.client.ledger.LedgerKey;

import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

public class Wallet {
    private String privateKey;
    private LedgerKey ledgerKey;
    private String address;
    private ECKey ecKey;
    private byte[] addressBytes;
    private Pubkey pubKeyForSign;
    private Long accountNumber;
    private Long sequence;

    private String chainId;

    public Wallet(String privateKey, String hrp) {
        if (!StringUtils.isEmpty(privateKey)) {
            this.privateKey = privateKey;
            this.ecKey = ECKey.fromPrivate(new BigInteger(privateKey, 16));
            this.address = Crypto.getAddressFromECKey(this.ecKey, hrp);
            this.addressBytes = Crypto.decodeAddress(this.address);
            byte[] pubKey= ecKey.getPubKeyPoint().getEncoded(true);
            this.pubKeyForSign = new Pubkey();
            this.pubKeyForSign.setValue(Base64.encodeBase64String(pubKey));
        } else {
            throw new IllegalArgumentException("Private key cannot be empty.");
        }
    }

    public Wallet(int[]bip44Path, LedgerDevice ledgerDevice, String hrp) throws IOException {
        this.ledgerKey = new LedgerKey(ledgerDevice, bip44Path, hrp);
        this.address = this.ledgerKey.getAddress();
        this.addressBytes = Crypto.decodeAddress(this.address);
        byte[] pubKey = this.ledgerKey.getPubKey();
        this.pubKeyForSign = new Pubkey();
        this.pubKeyForSign.setValue(Base64.encodeBase64String(pubKey));
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

    public static List<String> mnemonicStringToWords(String mnemonic) {
        return Arrays.asList(mnemonic.split("\\s+"));
    }

    public byte[] sign(byte[] data) throws IOException, NoSuchAlgorithmException {
        if (getEcKey() == null && getLedgerKey() != null) {
            return Crypto.sign(data, getLedgerKey());
        }
        return Crypto.sign(data, getEcKey());
    }

    public byte[] sign(Object object) throws IOException, NoSuchAlgorithmException {
        byte[] data = EncodeUtils.toJsonEncodeBytes(object);
        return sign(data);
    }

    public synchronized void initAccount(PanaceaApiRestClient client) throws PanaceaApiException {
        Account account = client.getAccount(this.address);
        if (account != null) {
            this.accountNumber = account.getValue().getAccountNumber();
            this.sequence = account.getValue().getSequence();
        } else {
            throw new IllegalStateException(
                "Cannot get account information for address " + this.address +
                    " (does this account exist on the blockchain yet?)");
        }
    }

    public synchronized void reloadAccount(PanaceaApiRestClient client) throws PanaceaApiException {
        Account account = client.getAccount(this.address);
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

    public String getPrivateKey() {
        return privateKey;
    }

    public String getAddress() {
        return address;
    }

    public ECKey getEcKey() {
        return ecKey;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("addressBytes", addressBytes)
                .append("address", address)
                .append("ecKey", ecKey)
                .append("pubKeyForSign", pubKeyForSign)
                .append("accountNumber", accountNumber)
                .append("sequence", sequence)
                .append("chainId", chainId)
                .toString();
    }
}
