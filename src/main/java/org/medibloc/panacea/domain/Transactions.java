package org.medibloc.panacea.domain;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import cosmos.base.v1beta1.Coin;
import cosmos.tx.signing.v1beta1.SignMode;
import cosmos.tx.v1beta1.*;
import org.medibloc.panacea.Wallet;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Transactions {

    public static TxBody createTxBody(GeneratedMessageV3 message, String memo) {
        return TxBody.newBuilder()
                .addMessages(Any.pack(message, ""))
                .setMemo(memo)
                .build();
    }

    public static TxBody createTxBody(List<? extends GeneratedMessageV3> messages, String memo) {
        TxBody.Builder builder = TxBody.newBuilder();
        for (GeneratedMessageV3 message : messages) {
            builder.addMessages(Any.pack(message, ""));
        }
        return builder.build();
    }

    public static Fee createFee(Coin coin, long gasLimit) {
        return createFee(Collections.singletonList(coin), gasLimit);
    }

    public static Fee createFee(List<Coin> coins, long gasLimit) {
        return Fee.newBuilder()
                .addAllAmount(coins)
                .setGasLimit(gasLimit)
                .build();
    }

    public static ModeInfo createSingleModeInfo() {
        return ModeInfo.newBuilder()
                .setSingle(ModeInfo.Single.newBuilder()
                        .setMode(SignMode.SIGN_MODE_DIRECT)
                        .build())
                .build();
    }

    public static SignerInfo createSignerInfo(Wallet wallet) {
        return SignerInfo.newBuilder()
                .setPublicKey(Any.pack(wallet.getPubKeyForSign(), ""))
                .setModeInfo(createSingleModeInfo())
                .setSequence(wallet.getSequence())
                .build();
    }

    public static AuthInfo createAutoInfo(Wallet wallet, Coin coin, long gasLimit) {
        return createAutoInfo(Collections.singletonList(wallet), createFee(coin, gasLimit));
    }

    public static AuthInfo createAutoInfo(Wallet wallet, Fee fee) {
        return createAutoInfo(Collections.singletonList(wallet), fee);
    }

    public static AuthInfo createAutoInfo(List<Wallet> wallets, Coin coin, long gasLimit) {
        return createAutoInfo(wallets, createFee(coin, gasLimit));
    }

    public static AuthInfo createAutoInfo(List<Wallet> wallets, Fee fee) {
        List<SignerInfo> signerInfos = new ArrayList<SignerInfo>();
        for (Wallet wallet : wallets) {
            signerInfos.add(createSignerInfo(wallet));
        }

        return AuthInfo.newBuilder()
                .setFee(fee)
                .addAllSignerInfos(signerInfos)
                .build();
    }

    public static SignDoc createSignDoc(Wallet wallet, TxBody txBody, AuthInfo authInfo) {
        return SignDoc.newBuilder()
                .setAccountNumber(wallet.getAccountNumber())
                .setChainId(wallet.getChainId())
                .setBodyBytes(txBody.toByteString())
                .setAuthInfoBytes(authInfo.toByteString())
                .build();
    }

    public static ByteString createSignature(Wallet wallet, TxBody txBody, AuthInfo authInfo) throws IOException, NoSuchAlgorithmException {
        return ByteString.copyFrom(wallet.sign(createSignDoc(wallet, txBody, authInfo).toByteArray()));
    }

    public static List<ByteString> createSignatures(List<Wallet> wallets, TxBody txBody, AuthInfo authInfo) throws IOException, NoSuchAlgorithmException {
        List<ByteString> signatures = new ArrayList<ByteString>();
        for (Wallet wallet : wallets) {
            signatures.add(createSignature(wallet, txBody, authInfo));
        }
        return signatures;
    }

    public static Tx createTxWithSign(Wallet wallet, TxBody txBody, AuthInfo authInfo) throws IOException, NoSuchAlgorithmException {
        return createTxWithSign(Collections.singletonList(wallet), txBody, authInfo);
    }

    public static Tx createTxWithSign(List<Wallet> wallets, TxBody txBody, AuthInfo authInfo) throws IOException, NoSuchAlgorithmException {
        return Tx.newBuilder()
                .setBody(txBody)
                .setAuthInfo(authInfo)
                .addAllSignatures(createSignatures(wallets, txBody, authInfo))
                .build();
    }

    public static Tx createTxWithSign(List<Wallet> wallets,
                                      GeneratedMessageV3 msg,
                                      String memo,
                                      Fee fee) throws IOException, NoSuchAlgorithmException {
        return createTxWithSign(wallets, Collections.singletonList(msg), memo, fee);
    }

    public static Tx createTxWithSign(List<Wallet> wallets,
                                      List<? extends GeneratedMessageV3> msgs,
                                      String memo,
                                      Fee fee) throws IOException, NoSuchAlgorithmException {
        TxBody txBody = createTxBody(msgs, memo);
        AuthInfo authInfo = createAutoInfo(wallets, fee);
        return createTxWithSign(wallets, txBody, authInfo);
    }

    public static BroadcastTxRequest createBroadcastTxRequest(Wallet wallet,
                                                              GeneratedMessageV3 message,
                                                              String memo,
                                                              Fee fee,
                                                              BroadcastMode mode) throws IOException, NoSuchAlgorithmException {
        return createBroadcastTxRequest(Collections.singletonList(wallet), Collections.singletonList(message), memo, fee, mode);
    }

    public static BroadcastTxRequest createBroadcastTxRequest(Wallet wallet,
                                                              List<? extends GeneratedMessageV3> messages,
                                                              String memo,
                                                              Fee fee,
                                                              BroadcastMode mode) throws IOException, NoSuchAlgorithmException {

        return createBroadcastTxRequest(Collections.singletonList(wallet), messages, memo, fee, mode);
    }

    public static BroadcastTxRequest createBroadcastTxRequest(List<Wallet> wallets,
                                                              GeneratedMessageV3 message,
                                                              String memo,
                                                              Fee fee,
                                                              BroadcastMode mode) throws IOException, NoSuchAlgorithmException {
        Tx tx = createTxWithSign(wallets, Collections.singletonList(message), memo, fee);
        return createBroadcastTxRequest(mode, tx);
    }

    public static BroadcastTxRequest createBroadcastTxRequest(List<Wallet> wallets,
                                                              List<? extends GeneratedMessageV3> messages,
                                                              String memo,
                                                              Fee fee,
                                                              BroadcastMode mode) throws IOException, NoSuchAlgorithmException {
        Tx tx = createTxWithSign(wallets, messages, memo, fee);
        return createBroadcastTxRequest(mode, tx);
    }

    public static BroadcastTxRequest createBroadcastTxRequest(BroadcastMode mode, Tx tx) {
        return BroadcastTxRequest.newBuilder()
                .setMode(mode)
                .setTxBytes(tx.toByteString())
                .build();
    }

}
