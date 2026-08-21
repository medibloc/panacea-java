package example;

import cosmos.base.v1beta1.Coin;
import cosmos.nft.v1beta1.MsgSend;
import io.grpc.Channel;
import org.bitcoinj.core.ECKey;
import org.medibloc.panacea.PanaceaGrpcClient;
import org.medibloc.panacea.Wallet;

final class ConsumerSmoke {
    private ConsumerSmoke() {
    }

    static PanaceaGrpcClient client(Channel channel) {
        return new PanaceaGrpcClient(channel);
    }

    static Coin coin() {
        return Coin.newBuilder()
                .setDenom("umed")
                .setAmount("1")
                .build();
    }

    static Wallet wallet(String mnemonic) {
        return Wallet.createWalletFromMnemonicCode(mnemonic, "panacea");
    }

    static ECKey key(Wallet wallet) {
        return wallet.getEcKey();
    }

    static MsgSend nftSend() {
        return MsgSend.newBuilder()
                .setClassId("class-id")
                .setId("nft-id")
                .setSender("panacea1sender")
                .setReceiver("panacea1receiver")
                .build();
    }
}
