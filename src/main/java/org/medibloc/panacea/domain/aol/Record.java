package org.medibloc.panacea.domain.aol;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Record {
    private byte[] key;
    private byte[] value;
    @JsonProperty("nano_timestamp")
    private Long nanoTimestamp;
    @JsonProperty("writer_address")
    private String writerAddress;

    public Date getTime() {
        return new Date(nanoTimestamp/1000000);
    }
}
