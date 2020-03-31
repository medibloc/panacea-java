package org.medibloc.panacea.domain.message;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgAddBucketWriter implements PanaceaTransactionMessage {
    private String type = "bucket/MsgAddBucketWriter";
    private Value value;

    @Getter @Setter @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonPropertyOrder(alphabetic = true)
    public static class Value {
        @JsonProperty("owner_address")
        private String ownerAddress;
        @JsonProperty("bucket_name")
        private String bucketName;
        @JsonProperty("writer_address")
        private String writerAddress;
        private String moniker;
        private String description;
    }
}