package org.medibloc.panacea;

import com.google.protobuf.GeneratedMessageV3;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.tx.v1beta1.BroadcastMode;
import cosmos.tx.v1beta1.BroadcastTxRequest;
import cosmos.tx.v1beta1.Fee;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.medibloc.panacea.domain.Coins;
import org.medibloc.panacea.domain.Transactions;
import org.medibloc.panacea.utils.TxUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class AbstractGrpcTest {
    private static final Logger logger = LoggerFactory.getLogger(AbstractGrpcTest.class);

    protected PanaceaGrpcClient client;

    @Before
    public void setUp() {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("testnet-grpc.gopanacea.org")
                .useTransportSecurity()
                .build();
        this.client = new PanaceaGrpcClient(channel);
    }

    protected Wallet getWallet(String mnemonic) throws PanaceaApiException {
        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, "panacea", 0);
        wallet.ensureWalletIsReady(client);
        return wallet;
    }

    protected TxResponse broadcast(Wallet wallet, String memo, GeneratedMessageV3 msg) throws Exception {
        return broadcast(Collections.singletonList(wallet), memo, Collections.singletonList(msg));
    }

    protected TxResponse broadcast(Wallet wallet, String memo, List<? extends GeneratedMessageV3> msgs) throws Exception {
        return broadcast(Collections.singletonList(wallet), memo, msgs);
    }

    protected TxResponse broadcast(List<Wallet> wallets, String memo, GeneratedMessageV3 msg) throws Exception {
        return broadcast(wallets, memo, Collections.singletonList(msg));
    }

    protected TxResponse broadcast(List<Wallet> wallets, String memo, List<? extends GeneratedMessageV3> msgs) throws Exception {
        for (Wallet wallet : wallets) {
            wallet.reloadAccount(client);
        }

        Fee fee = Transactions.createFee(Coins.createCoin(TestConst.denom, "2000000"), 400000);

        BroadcastTxRequest txRequest = Transactions.createBroadcastTxRequest(
                wallets,
                msgs,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_SYNC
        );

        TxResponse txResponse = client.broadcast(txRequest);
        Assert.assertNotNull(txResponse.getTxhash());
        if (txResponse.getCode() != 0) {
            logger.error(txResponse.toString());
        }
        Assert.assertEquals(0, txResponse.getCode());
        txResponse = TxUtils.pollTxResponse(this.client, txResponse.getTxhash(), 10, 1000);
        if (txResponse.getCode() != 0) {
            logger.error(txResponse.toString());
        }
        Assert.assertNotNull(txResponse.getTxhash());
        Assert.assertEquals(0, txResponse.getCode());

        return txResponse;
    }
}
