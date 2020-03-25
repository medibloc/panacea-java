package org.medibloc.panacea.domain.message;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
import static com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;

@JsonTypeInfo(use = NAME, include = EXISTING_PROPERTY, property = "type")
@JsonSubTypes({
        @Type(value = MsgAddRecord.class, name = "aol/MsgAddRecord"),
        @Type(value = MsgSend.class, name = "cosmos-sdk/MsgSend"),
        @Type(value = MsgCreateTopic.class, name = "aol/MsgCreateTopic"),
        @Type(value = MsgAddWriter.class, name = "aol/MsgAddWriter"),
        @Type(value = MsgDeleteWriter.class, name = "aol/MsgDeleteWriter")
})
public interface PanaceaTransactionMessage {
    String getType();
}
