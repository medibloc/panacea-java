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
import sun.jvm.hotspot.runtime.Bytes;

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
        Res<Record> record = restClient.getRecord("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g", "abc", 0L);
        System.out.println(record);
        Assert.assertNotNull(record);
    }

    @Test
    public void testCreateTopic() throws PanaceaApiException {
        MsgCreateTopic.Value value = new MsgCreateTopic.Value();
        value.setDescription("description");
        value.setOwnerAddress("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        value.setTopicName("ccc");

        MsgCreateTopic msg = new MsgCreateTopic();
        msg.setValue(value);
        broadcastMsgSync(msg);
    }

    @Test
    public void testAddWriter() throws PanaceaApiException {
        MsgAddWriter.Value value = new MsgAddWriter.Value();
        value.setOwnerAddress("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        value.setWriterAddress("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        value.setTopicName("123ab");
        value.setMoniker("moniker");
        value.setDescription("des");

        MsgAddWriter msg = new MsgAddWriter();
        msg.setValue(value);

        broadcastMsgSync(msg);
    }

    @Test
    public void testDeleteWriter() throws PanaceaApiException {
        MsgDeleteWriter.Value value = new MsgDeleteWriter.Value();
        value.setOwnerAddress("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        value.setTopicName("123ab");
        value.setWriterAddress("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        MsgDeleteWriter msg = new MsgDeleteWriter();

        broadcastMsgSync(msg);
    }

    @Test
    public void testAddRecord() throws PanaceaApiException {
        MsgAddRecord.Value value = new MsgAddRecord.Value();
        value.setOwnerAddress("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        value.setFeePayerAddress("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        value.setWriterAddress("panacea17uvx489y05m3tfnlsrkwrnr6p03zh8k22www0g");
        value.setTopicName("123ab");
        value.setKey("key1".getBytes());
        value.setValue("value1".getBytes());


        MsgAddRecord msg = new MsgAddRecord();


        broadcastMsgSync(msg);
    }


    private void broadcastMsgSync(PanaceaTransactionMessage msg) throws PanaceaApiException {
        StdFee fee = new StdFee("umed", "10000", "30000");

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

        BroadcastReq req = new BroadcastReq(tx, "sync");

        TxResponse res = restClient.broadcast(req);
        System.out.println(res);
    }
}
