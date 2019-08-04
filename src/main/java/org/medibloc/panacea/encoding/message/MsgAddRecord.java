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
@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgAddRecord implements PanaceaTransactionMessage {
    private String type = "aol/MsgAddRecord";
    private Value value;

    public MsgAddRecord(String ownerAddress, String topicName, byte[] keyData, byte[] valueData, String writerAddress, String feePayerAddress) {
        MsgAddRecord.Value msgValue = new MsgAddRecord.Value();
        msgValue.setOwnerAddress(ownerAddress);
        msgValue.setTopicName(topicName);
        msgValue.setKey(keyData);
        msgValue.setValue(valueData);
        msgValue.setWriterAddress(writerAddress);
        msgValue.setFeePayerAddress(feePayerAddress);
        this.value = msgValue;
    }

    @Getter @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonPropertyOrder(alphabetic = true)
    public static class Value {
        @JsonProperty("topic_name")
        private String topicName;
        private byte[] key;
        private byte[] value;
        @JsonProperty("writer_address")
        private String writerAddress;
        @JsonProperty("owner_address")
        private String ownerAddress;
        @JsonProperty("fee_payer_address")
        private String feePayerAddress = "";
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("topicName", value.topicName)
                .append("key", value.key)
                .append("value", value.value)
                .append("writerAddress", value.writerAddress)
                .append("ownerAddress", value.ownerAddress)
                .append("feePayerAddress", value.feePayerAddress)
                .toString();
    }
}
