package org.medibloc.panacea.local;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.medibloc.panacea.*;
import org.medibloc.panacea.domain.*;
import org.medibloc.panacea.domain.aol.AolWriter;
import org.medibloc.panacea.domain.aol.Record;
import org.medibloc.panacea.domain.aol.Topic;
import org.medibloc.panacea.domain.message.*;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class AolTest {
    private PanaceaApiRestClient restClient = null;

    private StdTx stdTx = null;

    @Before
    public void setup() {
        restClient = PanaceaApiClientFactory.newInstance()
                .newRestClient(
                        PanaceaEnvironment.LOCAL.getBaseUrl()
                );
    }

    @Test
    public void testGetTopics() throws PanaceaApiException {
        Res<List<Topic>> topics = restClient.getTopics("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        System.out.println(topics);
    }

    @Test
    public void testGetTopic() throws PanaceaApiException {
        Res<Topic> topic = restClient.getTopic("1234");
        System.out.println(topic);
    }

    @Test
    public void testGetWriters() throws PanaceaApiException {
        Res<List<String>> writers = restClient.getAolWriters("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g", "1234");
        System.out.println(writers);
    }

    @Test
    public void testGetWriter() throws PanaceaApiException {
        Res<AolWriter> writer = restClient.getAolWriter("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        System.out.println(writer);
    }

    @Test
    public void testGetRecord() throws PanaceaApiException {
        Res<Record> record = restClient.getRecord("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm", "abc", 0L);
        System.out.println(record);
        Assert.assertNotNull(record);
    }

    @Test
    public void testCreateTopic() throws PanaceaApiException {
        MsgCreateTopic.Value value = new MsgCreateTopic.Value();
        value.setDescription("description");
        value.setOwnerAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setTopicName("ccc");

        MsgCreateTopic msg = new MsgCreateTopic();
        msg.setValue(value);
        broadcastMsgSync(msg);
    }

    @Test
    public void testAddWriter() throws PanaceaApiException {
        MsgAddWriter.Value value = new MsgAddWriter.Value();
        value.setOwnerAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setWriterAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setTopicName("ccc");
        value.setMoniker("moniker");
        value.setDescription("des");

        MsgAddWriter msg = new MsgAddWriter();
        msg.setValue(value);

        broadcastMsgSync(msg);
    }

    @Test
    public void testDeleteWriter() throws PanaceaApiException {
        MsgDeleteWriter.Value value = new MsgDeleteWriter.Value();
        value.setOwnerAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setTopicName("ccc");
        value.setWriterAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        MsgDeleteWriter msg = new MsgDeleteWriter();

        msg.setValue(value);

        broadcastMsgSync(msg);
    }

    @Test
    public void testAddRecord() throws PanaceaApiException {
        MsgAddRecord.Value value = new MsgAddRecord.Value();
        value.setOwnerAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setFeePayerAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setWriterAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");
        value.setTopicName("ccc");
        value.setKey("key1".getBytes());
        value.setValue("value1".getBytes());
        value.setFeePayerAddress("panacea1spdn9tmssd2zcllrn5ycduwqdhenca6vhtk3fm");

        MsgAddRecord msg = new MsgAddRecord();

        msg.setValue(value);

        broadcastMsgSync(msg);
    }


    private void broadcastMsgSync(PanaceaTransactionMessage msg) throws PanaceaApiException {
        StdFee fee = new StdFee("umed", "10000", "70000");

        String mnemonic = "giraffe wreck kit enemy anger nephew silk sphere tuna tube lady evil market lizard humor usage sand cattle wedding access wall basket define fresh";

        Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, "panacea");
        wallet.ensureWalletIsReady(restClient);

        StdTx tx = new StdTx(msg, fee, "");

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
}
