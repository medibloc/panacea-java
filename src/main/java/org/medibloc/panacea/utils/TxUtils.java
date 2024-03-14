package org.medibloc.panacea.utils;

import cosmos.base.abci.v1beta1.TxResponse;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.medibloc.panacea.PanaceaGrpcClient;

public class TxUtils {
    public static TxResponse pollTxResponse(PanaceaGrpcClient client, String txHash, int maxTries, int sleepMs) throws Exception {
        for (int tries = 0; tries < maxTries; tries++) {
            try {
                return client.getTxResponse(txHash);
            } catch (StatusRuntimeException e) {
                // if tx was not found (if tx isn't included in the block yet)
                if (e.getStatus().getCode().equals(Status.Code.NOT_FOUND)) {
                    Thread.sleep(sleepMs);
                    continue;
                }
                throw e;
            }
        }

        throw new Exception("tx not found. maxTries: " + maxTries);
    }
}
