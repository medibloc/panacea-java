package org.medibloc.panacea;

import com.google.protobuf.ByteString;
import com.subgraph.orchid.encoders.Hex;
import cosmos.auth.v1beta1.BaseAccount;
import cosmos.crypto.secp256k1.Keys;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.net.util.Base64;
import org.medibloc.panacea.encoding.Bech32;
import org.medibloc.panacea.utils.CryptoUtils;
import tendermint.p2p.DefaultNodeInfo;

import java.util.Arrays;
import java.util.List;

public class Wallet extends BaseWallet {
    private final String address;
    private final byte[] addressBytes;
    @Getter
    private final Keys.PubKey pubKeyForSign;
    @Setter
    @Getter
    private Long accountNumber;
    @Setter
    private Long sequence;
    @Getter
    private final String pubKeyBech32;
    @Getter
    private final String pubKeyBase64;
    @Getter
    private String chainId;

    public Wallet(String privateKey, String hrp) {
        super(privateKey);

        this.address = CryptoUtils.getAddressFromECKey(getEcKey(), hrp);
        this.addressBytes = CryptoUtils.decodeAddress(this.address);
        byte[] pubKeyBytes = getPubKeyBytes();
        this.pubKeyForSign = Keys.PubKey.newBuilder()
                .setKey(ByteString.copyFrom(pubKeyBytes))
                .build();
        this.pubKeyBech32 = encodeBech32PubKey(pubKeyBytes, hrp + "pub");
        this.pubKeyBase64 = Base64.encodeBase64String(pubKeyBytes);
    }

    public static Wallet createRandomWallet(String hrp) {
        return createWalletFromMnemonicCode(CryptoUtils.generateMnemonicCode(), hrp);
    }

    public static Wallet createWalletFromEntropy(String hrp, byte[] entropy) {
        return createWalletFromMnemonicCode(CryptoUtils.generateMnemonicCodeFromEntropy(entropy), hrp);
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
        String privateKey = CryptoUtils.getPrivateKeyFromMnemonicCode(words, index);
        return new Wallet(privateKey, hrp);
    }

    public synchronized void initAccount(PanaceaGrpcClient client) throws PanaceaApiException {
        BaseAccount account = client.getAccount(this.getAddress());
        if (account != null) {
            this.accountNumber = account.getAccountNumber();
            this.sequence = account.getSequence();
        } else {
            throw new IllegalStateException(
                    "Cannot get account information for address " + this.getAddress() +
                            " (does this account exist on the blockchain yet?)");
        }
    }

    public synchronized void reloadAccount(PanaceaGrpcClient client) throws PanaceaApiException {
        BaseAccount account = client.getAccount(this.getAddress());
        this.accountNumber = account.getAccountNumber();
        this.sequence = account.getSequence();
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

    @Deprecated
    public String getPubKey() {
        return getPubKeyBech32();
    }

    public synchronized void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public synchronized void invalidAccountSequence() {
        this.sequence = null;
    }

    public synchronized void ensureWalletIsReady(PanaceaGrpcClient client) throws PanaceaApiException {
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

    public synchronized void initChainId(PanaceaGrpcClient client) throws PanaceaApiException {
        DefaultNodeInfo info = client.getNodeInfo();
        chainId = info.getNetwork();
    }

    public String getAddress() {
        return address;
    }

    public byte[] getAddressBytes() {
        return addressBytes;
    }

    private String encodeBech32PubKey(byte[] data, String hrp) {
        byte[] typePrefixBytes = Hex.decode("EB5AE98721");
        byte[] bz = new byte[typePrefixBytes.length + data.length];
        System.arraycopy(typePrefixBytes, 0, bz, 0, typePrefixBytes.length);
        System.arraycopy(data, 0, bz, typePrefixBytes.length, data.length);
        return CryptoUtils.encodeAddress(hrp, bz);
    }

    private byte[] decodeBech32PubKey(String pubKey) {
        byte[] bz = CryptoUtils.decodeAddress(pubKey);
        byte[] typePrefixBytes = Hex.decode("EB5AE98721");
        return Arrays.copyOfRange(bz, typePrefixBytes.length, bz.length);
    }
}
