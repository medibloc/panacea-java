package org.medibloc.panacea.domain.message;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
import static com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;

@JsonTypeInfo(use = NAME, include = EXISTING_PROPERTY, property = "type")
@JsonSubTypes({
        @Type(value = MsgAddBucketWriter.class, name = "bucket/MsgAddBucketWriter"),
        @Type(value = MsgAddRecord.class, name = "aol/MsgAddRecord"),
        @Type(value = MsgAddWriter.class, name = "aol/MsgAddWriter"),
        @Type(value = MsgCreateBucket.class, name = "bucket/MsgCreateBucket"),
        @Type(value = MsgCreateObject.class, name = "bucket/MsgCreateObject"),
        @Type(value = MsgCreateTopic.class, name = "aol/MsgCreateTopic"),
        @Type(value = MsgDeleteBucket.class, name = "bucket/MsgDeleteBucket"),
        @Type(value = MsgDeleteObject.class, name = "bucket/MsgDeleteObject"),
        @Type(value = MsgDeleteWriter.class, name = "aol/MsgDeleteWriter"),
        @Type(value = MsgRemoveWriter.class, name = "bucket/MsgRemoveWriter"),
        @Type(value = MsgSend.class, name = "cosmos-sdk/MsgSend"),
        @Type(value = MsgDeleteWriter.class, name = "aol/MsgDeleteWriter")
})
public interface PanaceaTransactionMessage {
    String getType();
}
