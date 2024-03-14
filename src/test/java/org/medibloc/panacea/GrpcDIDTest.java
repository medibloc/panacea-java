package org.medibloc.panacea;

import com.google.protobuf.ByteString;
import cosmos.base.abci.v1beta1.TxResponse;
import cosmos.tx.v1beta1.BroadcastMode;
import cosmos.tx.v1beta1.BroadcastTxRequest;
import cosmos.tx.v1beta1.Fee;
import cosmos.tx.v1beta1.Tx;
import org.junit.Assert;
import org.junit.Test;
import org.medibloc.panacea.domain.Coins;
import org.medibloc.panacea.domain.DIDs;
import org.medibloc.panacea.domain.Transactions;
import org.medibloc.panacea.utils.TxUtils;
import panacea.did.v2.*;

public class GrpcDIDTest extends AbstractGrpcTest {

    @Test
    public void testDid() throws Exception {
        DIDWallet didWallet = DIDWallet.createRandomWallet();
        String did = DIDs.createDID(didWallet.getPubKeyBytes());

        DIDDocument createDoc = DIDs.createDIDDocument(did, didWallet);

        testCreateDID(didWallet, createDoc);

        testCheckedDID(createDoc, 0);

        DIDWallet updateDIDWallet = DIDWallet.createRandomWallet();
        VerificationMethod key2Method = DIDs.createVerificationMethod(did, updateDIDWallet, "key2");
        VerificationRelationship key2Relationship = DIDs.createVerificationRelationship(DIDs.createVerificationMethod(did, updateDIDWallet, "key2"));
        DIDDocument updateDoc = DIDDocument.newBuilder(createDoc)
                .addVerificationMethods(key2Method)
                .addAuthentications(key2Relationship)
                .build();

        testUpdateDID(didWallet, updateDoc, 0);

        testCheckedDID(updateDoc, 1);
    }


    private void testCreateDID(DIDWallet createDIDWallet, DIDDocument createDoc) throws Exception {
        Wallet ownerWallet = getWallet(TestConst.ownerMnemonic);
        String ownerAddress = ownerWallet.getAddress();

        DataWithSeq dataWithSeq = DataWithSeq.newBuilder()
                .setData(createDoc.toByteString())
                .setSequence(0)
                .build();
        byte[] signature = createDIDWallet.sign(dataWithSeq.toByteArray());
        MsgCreateDIDRequest msg = MsgCreateDIDRequest.newBuilder()
                .setDocument(createDoc)
                .setVerificationMethodId(createDoc.getVerificationMethods(0).getId())
                .setDid(createDoc.getId())
                .setSignature(ByteString.copyFrom(signature))
                .setFromAddress(ownerAddress)
                .build();
        String memo = "create did";
        Fee fee = Transactions.createFee(Coins.createCoin(TestConst.denom, "1000000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                ownerWallet,
                msg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_SYNC);

        TxResponse response = client.broadcast(request);
        Assert.assertNotNull(response.getTxhash());
        Assert.assertEquals(0, response.getCode());
        response = TxUtils.pollTxResponse(client, response.getTxhash(), 10, 1000);
        Tx tx = response.getTx().unpack(Tx.class);
        Assert.assertEquals(memo, tx.getBody().getMemo());
        Assert.assertEquals(1, tx.getBody().getMessagesCount());
        Assert.assertEquals(fee, tx.getAuthInfo().getFee());
    }

    private void testUpdateDID(DIDWallet didWallet, DIDDocument doc, long seq) throws Exception {
        Wallet ownerWallet = getWallet(TestConst.ownerMnemonic);
        String ownerAddress = ownerWallet.getAddress();

        DataWithSeq dataWithSeq = DataWithSeq.newBuilder()
                .setData(doc.toByteString())
                .setSequence(seq)
                .build();

        byte[] updateSignature = didWallet.sign(dataWithSeq.toByteArray());

        MsgUpdateDIDRequest msg = MsgUpdateDIDRequest.newBuilder()
                .setDid(doc.getId())
                .setDocument(doc)
                .setVerificationMethodId(doc.getVerificationMethods(0).getId())
                .setSignature(ByteString.copyFrom(updateSignature))
                .setFromAddress(ownerAddress)
                .build();
        String memo = "update did";
        Fee fee = Transactions.createFee(Coins.createCoin(TestConst.denom, "1000000"), 200000);

        BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
                ownerWallet,
                msg,
                memo,
                fee,
                BroadcastMode.BROADCAST_MODE_SYNC);
        TxResponse response = client.broadcast(request);
        Assert.assertNotNull(response.getTxhash());
        Assert.assertEquals(0, response.getCode());
        response = TxUtils.pollTxResponse(client, response.getTxhash(), 10, 1000);
        Tx tx = response.getTx().unpack(Tx.class);
        Assert.assertEquals(memo, tx.getBody().getMemo());
        Assert.assertEquals(1, tx.getBody().getMessagesCount());
        Assert.assertEquals(fee, tx.getAuthInfo().getFee());
    }

    private void testCheckedDID(DIDDocument createDoc, long seq) {
        DIDDocumentWithSeq createdDocWithSeq = client.getDIDDocumentWithSeq(createDoc.getId());
        Assert.assertEquals(seq, createdDocWithSeq.getSequence());
        Assert.assertEquals(createDoc.toString(), createdDocWithSeq.getDocument().toString());
    }
}
