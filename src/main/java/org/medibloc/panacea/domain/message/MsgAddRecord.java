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

    @Getter @Setter @ToString
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
}
