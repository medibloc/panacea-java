package org.medibloc.panacea;

import cosmos.base.query.v1beta1.PageRequest;
import cosmos.nft.v1beta1.QueryClassesResponse;
import cosmos.tx.v1beta1.GetTxsEventResponse;
import org.junit.Assert;
import org.junit.Test;
import panacea.nft.v1.ClassRecord;
import panacea.nft.v1.QueryNFTRecordsResponse;

public class GrpcV230Test extends AbstractGrpcTest {

    @Test
    public void testNftQueries() {
        PageRequest pagination = PageRequest.newBuilder()
                .setLimit(10)
                .build();

        QueryClassesResponse classes = client.getNftClasses(pagination);
        Assert.assertNotNull(classes);

        if (classes.getClassesCount() == 0) {
            System.out.println("No NFT classes found on testnet");
            return;
        }

        String classId = classes.getClasses(0).getId();
        ClassRecord classRecord = client.getNftClassRecord(classId);
        Assert.assertEquals(classId, classRecord.getClass_().getId());

        QueryNFTRecordsResponse records = client.getNftRecords(classId, "", pagination);
        Assert.assertNotNull(records);
        System.out.println("NFT class=" + classId + ", records=" + records.getNftRecordsCount());
    }

    @Test
    public void testTxSearchOnLatestBlock() {
        long height = client.getLatestBlock().getHeader().getHeight();
        PageRequest pagination = PageRequest.newBuilder()
                .setLimit(10)
                .build();

        GetTxsEventResponse response = client.getTxsByHeight(height, pagination);

        Assert.assertTrue(response.hasPagination());
        Assert.assertEquals(response.getTotal(), response.getPagination().getTotal());
        System.out.println("Tx search height=" + height + ", total=" + response.getTotal());
    }
}
