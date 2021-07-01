package org.medibloc.panacea;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.Before;

public abstract class AbstractGrpcTest {
    protected PanaceaGrpcClient client;

    @Before
    public void setUp() {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9090")
                .usePlaintext()
                .build();
        this.client = new PanaceaGrpcClient(channel);
    }

    protected Wallet getWallet(String mnemonic) throws PanaceaApiException {
        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, "panacea", 0);
        wallet.ensureWalletIsReady(client);
        return wallet;
    }
}
