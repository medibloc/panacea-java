package org.medibloc.panacea.domain.bucket;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class BucketObject {
    @JsonProperty("owner_address")
    private String ownerAddress;
    @JsonProperty("bucket_name")
    private String bucketName;
    private String key;
    private String value;
    private String writer;

}
