package org.medibloc.panacea.domain.bucket;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class BucketWriter {

    @JsonProperty("writer_address")
    private String writerAddress;
    @JsonProperty("owner_address")
    private String ownerAddress;
    @JsonProperty("bucket_name")
    private String bucketName;
    private String moniker;
    private String description;
}
