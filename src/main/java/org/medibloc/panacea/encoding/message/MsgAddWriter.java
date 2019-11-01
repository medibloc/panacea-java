package org.medibloc.panacea.encoding.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgAddWriter implements PanaceaTransactionMessage {
    private String type = "aol/MsgAddWriter";
    private Value value;

    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonPropertyOrder(alphabetic = true)
    public static class Value {
        @JsonProperty("topic_name")
        private String topicName;
        private String moniker;
        private String description;
        @JsonProperty("writer_address")
        private String writerAddress;
        @JsonProperty("owner_address")
        private String ownerAddress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("topicName", value.topicName)
                .append("moniker", value.moniker)
                .append("description", value.description)
                .append("writerAddress", value.writerAddress)
                .append("ownerAddress", value.ownerAddress)
                .toString();
    }
}
