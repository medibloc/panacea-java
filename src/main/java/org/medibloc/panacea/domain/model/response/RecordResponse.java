package org.medibloc.panacea.domain.model.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@JsonIgnoreProperties
public class RecordResponse {
    private byte[] key;
    private byte[] value;
    @JsonProperty("nano_timestamp")
    private Long nanoTimestamp;
    @JsonProperty("writer_address")
    private String writerAddress;
}
