package org.medibloc.panacea.domain.bucket;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class BucketOwner {

    @JsonProperty("owner_address")
    private String ownerAddress;
    @JsonProperty("total_buckets")
    private long totalBuckets;
}
