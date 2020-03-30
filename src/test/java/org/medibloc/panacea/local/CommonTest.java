package org.medibloc.panacea.local;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.medibloc.panacea.*;
import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.domain.message.MsgSend;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.List;

public class CommonTest {
    private PanaceaApiRestClient restClient = null;

    String hrp = "panacea";

    @Before
    public void setup() {
        restClient = PanaceaApiClientFactory.newInstance()
                .newRestClient(
                        PanaceaEnvironment.LOCAL.getBaseUrl()
                );
    }

    @Test
    public void testGetAccount() throws PanaceaApiException {
        Res<TV<Account>> acc = restClient.getAccount("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        System.out.println(acc);
        Assert.assertNotNull(acc);
    }

    @Test
    public void testGetNodeInfo() throws PanaceaApiException {
        NodeInfoResponse nodeInfo = restClient.getNodeInfo();
        System.out.println(nodeInfo);
        Assert.assertNotNull(nodeInfo);
    }

    @Test
    public void testBlockInfo() throws PanaceaApiException {
        BlockInfo latestBlock = restClient.getLatestBlock();
        System.out.println(latestBlock);
        Assert.assertNotNull(latestBlock);
    }

    @Test
    public void testGetTxResponse() throws PanaceaApiException {
        String txHash = "192C1AF789D035FCA7C9374EEACBAC23817BB2ED18938027BB2ACF04B492A89F";

        TxResponse res = restClient.getTxResponse(txHash);
        System.out.println(res);
        Assert.assertNotNull(res);
    }

    @Test
    public void testGetBlockByHeight() throws PanaceaApiException {
        BlockInfo blockInfo = restClient.getBlockByHeight(123L);
        System.out.println(blockInfo);
        Assert.assertNotNull(blockInfo);
    }

    @Test
    public void testGetLatestBlock() throws PanaceaApiException {
        BlockInfo latestBlock = restClient.getLatestBlock();
        System.out.println(latestBlock);
        Assert.assertNotNull(latestBlock);
    }

    @Test
    public void testGetTxsByHeight() throws PanaceaApiException {
        SearchTxsResult responses = restClient.getTxsByHeight(4911L);
        System.out.println(responses);
        Assert.assertNotNull(responses);
    }

    @Test
    public void testSendTransactionBlock() throws PanaceaApiException {

        Transfer transfer = new Transfer();
        transfer.setAmount("10000");
        transfer.setDenom("umed");
        transfer.setFromAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        transfer.setToAddress("panacea145tgu5y60qsxvwjykfgd7277kzeqd7y3qqwn4j");

        MsgSend msgSend = createMsgSend(transfer);

        StdFee fee = new StdFee("umed", "10000", "60000");

        String mnemonic = "giraffe wreck kit enemy anger nephew silk sphere tuna tube lady evil market lizard humor usage sand cattle wedding access wall basket define fresh";

        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, hrp);
        wallet.ensureWalletIsReady(restClient);

        System.out.println(wallet.getAddress());

        StdTx tx = new StdTx(msgSend, fee, "");

        try {
            tx.sign(wallet);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        wallet.increaseAccountSequence();

        BroadcastReq req = new BroadcastReq(tx, "block");

        TxResponse res = restClient.broadcast(req);
        System.out.println(res);
    }

    @Test
    public void testSendTransactionAsync() throws PanaceaApiException {

        Transfer transfer = new Transfer();
        transfer.setAmount("10000");
        transfer.setDenom("umed");
        transfer.setFromAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        transfer.setToAddress("panacea145tgu5y60qsxvwjykfgd7277kzeqd7y3qqwn4j");

        MsgSend msgSend = createMsgSend(transfer);

        StdFee fee = new StdFee("umed", "10000", "40000");

        String mnemonic = "giraffe wreck kit enemy anger nephew silk sphere tuna tube lady evil market lizard humor usage sand cattle wedding access wall basket define fresh";

        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, hrp);
        wallet.ensureWalletIsReady(restClient);

        StdTx tx = new StdTx(msgSend, fee, "");

        try {
            tx.sign(wallet);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        wallet.increaseAccountSequence();

        BroadcastReq req = new BroadcastReq(tx, "async");

        TxResponse res = restClient.broadcast(req);
        System.out.println(res);
    }

    @Test
    public void testSendTransactionSync() throws PanaceaApiException {

        Transfer transfer = new Transfer();
        transfer.setAmount("10000");
        transfer.setDenom("umed");
        transfer.setFromAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        transfer.setToAddress("panacea145tgu5y60qsxvwjykfgd7277kzeqd7y3qqwn4j");

        MsgSend msgSend = createMsgSend(transfer);

        StdFee fee = new StdFee("umed", "10000", "30000");

        String mnemonic = "giraffe wreck kit enemy anger nephew silk sphere tuna tube lady evil market lizard humor usage sand cattle wedding access wall basket define fresh";

        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, hrp);
        wallet.ensureWalletIsReady(restClient);

        Res<TV<Account>> account = restClient.getAccount(wallet.getAddress());
        print(account.getResult().getValue().getCoins().get(0).getAmount());

        StdTx tx = new StdTx(msgSend, fee, "");

        try {
            tx.sign(wallet);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        wallet.increaseAccountSequence();

        BroadcastReq req = new BroadcastReq(tx, "sync");

        TxResponse res = restClient.broadcast(req);
        System.out.println(res);
    }

    @Test
    public void walletTest() {
        Wallet wallet = new Wallet("27d146f20decb2f7dd364c8c11dfdb53d393260a20e6de92ff36df739743478f963b79a76fcb0a4c44aa2f8bdbe77b06f0f6ce0504510a1f1d831230974131dffa966d38449e07dee750cb4e182aa564", "panacea");
        System.out.println(wallet.getAddress());
    }

    private MsgSend createMsgSend(Transfer transfer) {
        Coin coin = new Coin();
        coin.setDenom(transfer.getDenom());
        coin.setAmount(transfer.getAmount());
        List<Coin> amount = Collections.singletonList(coin);

        MsgSend.Value msgSendValue = new MsgSend.Value();
        msgSendValue.setAmount(amount);
        msgSendValue.setFromAddress(transfer.getFromAddress());
        msgSendValue.setToAddress(transfer.getToAddress());

        MsgSend msgSend = new MsgSend();
        msgSend.setValue(msgSendValue);
        return msgSend;
    }

    private void print(String str) {
        System.out.println(str);
    }
}
