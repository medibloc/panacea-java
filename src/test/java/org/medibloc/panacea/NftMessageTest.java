package org.medibloc.panacea;

import com.google.protobuf.Any;
import cosmos.nft.v1beta1.MsgSend;
import cosmos.tx.v1beta1.TxBody;
import org.junit.Assert;
import org.junit.Test;
import org.medibloc.panacea.domain.Transactions;
import panacea.nft.v1.BasicNFTData;
import panacea.nft.v1.MsgMintRequest;

public class NftMessageTest {

    @Test
    public void packsPanaceaNftMessage() {
        Any data = Any.pack(BasicNFTData.newBuilder()
                .setName("certificate")
                .build(), "");
        MsgMintRequest message = MsgMintRequest.newBuilder()
                .setClassId("panacea1creator:certificate")
                .setNftId("nft-1")
                .setController("panacea1controller")
                .setRecipient("panacea1recipient")
                .setData(data)
                .build();

        TxBody txBody = Transactions.createTxBody(message, "mint nft");

        Assert.assertEquals("/panacea.nft.v1.MsgMintRequest", txBody.getMessages(0).getTypeUrl());
        Assert.assertEquals("/panacea.nft.v1.BasicNFTData", message.getData().getTypeUrl());
    }

    @Test
    public void packsStandardNftTransferMessage() {
        MsgSend message = MsgSend.newBuilder()
                .setClassId("panacea1creator:certificate")
                .setId("nft-1")
                .setSender("panacea1sender")
                .setReceiver("panacea1receiver")
                .build();

        TxBody txBody = Transactions.createTxBody(message, "send nft");

        Assert.assertEquals("/cosmos.nft.v1beta1.MsgSend", txBody.getMessages(0).getTypeUrl());
    }
}
