package org.medibloc.panacea;

import org.junit.Before;
import org.junit.Test;
import org.medibloc.panacea.domain.migrate.Tx_v1;
import org.medibloc.panacea.encoding.message.StdTx;

import java.util.ArrayList;
import java.util.List;

public class MainClient {

    private PanaceaApiRestClient restClient = null;

    private StdTx stdTx = null;

    @Before
    public void setup() {
        restClient = PanaceaApiClientFactory.newInstance()
                .newRestClient(
                        PanaceaEnvironment.MAIN_NET.getBaseUrl()
                );
    }

    /**
     *  actions
     *  bank : send
     *
     *  aol : create_topic, add_writer, delete_writer, add_record
     *
     */
    @Test
    public void queryMedicalTransaction() throws PanaceaApiException, InterruptedException {

        ArrayList<Tx_v1> list = new ArrayList<Tx_v1>();
        for(int i=1; i<100;i++) {
            List<Tx_v1> res = restClient.getTxsByAction("send", (long)i, 30L);

            list.addAll(res);
            Thread.sleep(500L);
        }

        System.out.println(list);

    }



}



















