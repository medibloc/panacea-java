package org.medibloc.panacea;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import panacea.pnft.v2.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GrpcPnftTest extends AbstractGrpcTest {

    @Test
    public void testDenom() throws Exception {
        Wallet ownerWallet = getWallet(TestConst.ownerMnemonic);
        Wallet toWallet = getWallet(TestConst.toMnemonic);

        String id = UUID.randomUUID().toString();

        testCreateDenom(ownerWallet, id);

        testUpdateDenom(ownerWallet, id);

        testTransferDenom(ownerWallet, toWallet, id);
    }

    private void testCreateDenom(Wallet ownerWallet, String id) throws Exception {
        String name = RandomStringUtils.randomAlphabetic(10);

        MsgCreateDenomRequest createDenomMsg = MsgCreateDenomRequest.newBuilder()
                .setId(id)
                .setName(name)
                .setSymbol("medibloc")
                .setDescription("this is medibloc test denom")
                .setData("test data")
                .setCreator(ownerWallet.getAddress())
                .build();
        // broadcast
        broadcast(ownerWallet, "create denom", createDenomMsg);
        // test correct create denom
        Denom denom = client.getDenom(createDenomMsg.getId());
        Assert.assertEquals(createDenomMsg.getId(), denom.getId());
        Assert.assertEquals(createDenomMsg.getName(), denom.getName());
        Assert.assertEquals(createDenomMsg.getSymbol(), denom.getSymbol());
        Assert.assertEquals(createDenomMsg.getDescription(), denom.getDescription());
        Assert.assertEquals(createDenomMsg.getData(), denom.getData());
        Assert.assertEquals(createDenomMsg.getCreator(), denom.getOwner());
    }

    private void testUpdateDenom(Wallet ownerWallet, String id) throws Exception {
        Denom orgDenom = client.getDenom(id);

        MsgUpdateDenomRequest updateDenomMsg = MsgUpdateDenomRequest.newBuilder()
                .setId(orgDenom.getId())
                .setName(orgDenom.getName())
                .setSymbol(orgDenom.getSymbol())
                .setDescription("This is medibloc test denom. And update description")
                .setUpdater(orgDenom.getData())
                .setUri("medibloc resource")
                .setUriHash("medibloc uri hash")
                .setData(orgDenom.getData())
                .setUpdater(ownerWallet.getAddress())
                .build();
        // broadcast
        broadcast(ownerWallet, "update denom", updateDenomMsg);
        // check correct updating
        Denom updatedDenom = client.getDenom(updateDenomMsg.getId());
        Assert.assertEquals(updateDenomMsg.getId(), updatedDenom.getId());
        Assert.assertEquals(updateDenomMsg.getName(), updatedDenom.getName());
        Assert.assertEquals(updateDenomMsg.getSymbol(), updatedDenom.getSymbol());
        Assert.assertEquals(updateDenomMsg.getDescription(), updatedDenom.getDescription());
        Assert.assertEquals(updateDenomMsg.getData(), updatedDenom.getData());
        Assert.assertEquals(updateDenomMsg.getUri(), updatedDenom.getUri());
        Assert.assertEquals(updateDenomMsg.getUriHash(), updatedDenom.getUriHash());
        Assert.assertEquals(updateDenomMsg.getUpdater(), updatedDenom.getOwner());
    }

    private void testTransferDenom(Wallet ownerWallet, Wallet toWallet, String id) throws Exception {
        Denom orgDenom = client.getDenom(id);

        MsgTransferDenomRequest transferDenomRequest = MsgTransferDenomRequest.newBuilder()
                .setId(id)
                .setSender(ownerWallet.getAddress())
                .setReceiver(toWallet.getAddress())
                .build();
        // broadcast
        broadcast(ownerWallet, "transfer denom", transferDenomRequest);
        // check correct transfer denom
        Denom denom = client.getDenom(id);
        Assert.assertEquals(id, denom.getId());
        Assert.assertEquals(orgDenom.getName(), denom.getName());
        Assert.assertEquals(orgDenom.getSymbol(), denom.getSymbol());
        Assert.assertEquals(orgDenom.getDescription(), denom.getDescription());
        Assert.assertEquals(orgDenom.getData(), denom.getData());
        Assert.assertEquals(orgDenom.getUri(), denom.getUri());
        Assert.assertEquals(orgDenom.getUriHash(), denom.getUriHash());
        Assert.assertEquals(toWallet.getAddress(), denom.getOwner());
    }

    @Test
    public void testPnft() throws Exception {
        Wallet ownerWallet = getWallet(TestConst.ownerMnemonic);
        Wallet toWallet = getWallet(TestConst.toMnemonic);

        String denomId = UUID.randomUUID().toString();
        testCreateDenom(ownerWallet, denomId);

        String id = RandomStringUtils.randomAlphabetic(10);
        testCreatePnft(ownerWallet, denomId, id);
        testTransferPnft(ownerWallet, toWallet, denomId, id);

        MsgBurnPNFTRequest request = MsgBurnPNFTRequest.newBuilder()
                .setDenomId(denomId)
                .setId(id)
                .setBurner(toWallet.getAddress())
                .build();
        broadcast(toWallet, "transfer pnft", request);
        try {
            client.getPnft(denomId, id);
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().contains("cannot found pnft"));
        }
    }

    @Test
    public void testPnftsAndQueryList() throws Exception {
        Wallet ownerWallet = getWallet(TestConst.ownerMnemonic);

        String denomId = UUID.randomUUID().toString();
        testCreateDenom(ownerWallet, denomId);

        List<MsgMintPNFTRequest> requests = IntStream.range(0, 10)
                .mapToObj(i -> RandomStringUtils.randomAlphanumeric(10))
                .map(id -> MsgMintPNFTRequest.newBuilder()
                        .setDenomId(denomId)
                        .setId(id)
                        .setName("medibloc test nft")
                        .setCreator(ownerWallet.getAddress())
                        .build())
                .collect(Collectors.toList());
        broadcast(ownerWallet, "create pnft list", requests);

        List<Pnft> pnfts = client.getPnfts(denomId);
        Assert.assertEquals(10, pnfts.size());
    }

    private void testCreatePnft(Wallet ownerWallet, String denomId, String id) throws Exception {
        MsgMintPNFTRequest request = MsgMintPNFTRequest.newBuilder()
                .setDenomId(denomId)
                .setId(id)
                .setName("medibloc-nft")
                .setDescription("This is medibloc nft test token")
                .setData("This is pnft data")
                .setCreator(ownerWallet.getAddress())
                .build();
        broadcast(ownerWallet, "mint pnft", request);
        Pnft pnft = client.getPnft(denomId, id);
        Assert.assertEquals(request.getDenomId(), pnft.getDenomId());
        Assert.assertEquals(request.getId(), pnft.getId());
        Assert.assertEquals(request.getName(), pnft.getName());
        Assert.assertEquals(request.getDescription(), pnft.getDescription());
        Assert.assertEquals(request.getData(), pnft.getData());
        Assert.assertEquals(request.getCreator(), pnft.getOwner());
    }

    private void testTransferPnft(Wallet ownerWallet, Wallet toWallet, String denomId, String id) throws Exception {
        Pnft orgPnft = client.getPnft(denomId, id);
        MsgTransferPNFTRequest request = MsgTransferPNFTRequest.newBuilder()
                .setDenomId(denomId)
                .setId(id)
                .setSender(ownerWallet.getAddress())
                .setReceiver(toWallet.getAddress())
                .build();
        broadcast(ownerWallet, "transfer pnft", request);
        Pnft pnft = client.getPnft(denomId, id);
        Assert.assertEquals(orgPnft.getDenomId(), pnft.getDenomId());
        Assert.assertEquals(orgPnft.getId(), pnft.getId());
        Assert.assertEquals(orgPnft.getName(), pnft.getName());
        Assert.assertEquals(orgPnft.getDescription(), pnft.getDescription());
        Assert.assertEquals(orgPnft.getData(), pnft.getData());
        Assert.assertEquals(request.getReceiver(), pnft.getOwner());
    }
}
