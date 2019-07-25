package org.medibloc.panacea.api.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Record {
    private byte[] key;
    private byte[] value;
    private String timestamp;
    @JsonProperty("writer_address")
    private String writerAddress;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("key", key)
                .append("value", value)
                .append("timestamp", timestamp)
                .append("writer", writerAddress)
                .toString();
    }
}
