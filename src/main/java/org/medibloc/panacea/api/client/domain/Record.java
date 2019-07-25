package org.medibloc.panacea.api.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

@Getter @Setter
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("key", key)
                .append("value", value)
                .append("nanoTimestamp", nanoTimestamp)
                .append("writer", writerAddress)
                .append("date", getTime())
                .toString();
    }
}
