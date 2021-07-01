package org.medibloc.panacea;

import io.grpc.Channel;
import lombok.Getter;

@Getter
public class GrpcStub {
    private final cosmos.auth.v1beta1.QueryGrpc.QueryBlockingStub authQueryStub;
    private final panacea.aol.v2.QueryGrpc.QueryBlockingStub aolQueryStub;
    private final cosmos.bank.v1beta1.QueryGrpc.QueryBlockingStub bankQueryStub;
    private final panacea.did.v2.QueryGrpc.QueryBlockingStub didQueryStub;
    private final cosmos.base.tendermint.v1beta1.ServiceGrpc.ServiceBlockingStub tendermintQueryStub;
    private final cosmos.tx.v1beta1.ServiceGrpc.ServiceBlockingStub txServiceStub;

    public GrpcStub(Channel channel) {
        this.authQueryStub = cosmos.auth.v1beta1.QueryGrpc.newBlockingStub(channel);
        this.aolQueryStub = panacea.aol.v2.QueryGrpc.newBlockingStub(channel);
        this.bankQueryStub = cosmos.bank.v1beta1.QueryGrpc.newBlockingStub(channel);
        this.didQueryStub = panacea.did.v2.QueryGrpc.newBlockingStub(channel);
        this.tendermintQueryStub = cosmos.base.tendermint.v1beta1.ServiceGrpc.newBlockingStub(channel);
        this.txServiceStub = cosmos.tx.v1beta1.ServiceGrpc.newBlockingStub(channel);
    }
}
