package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class DIDAuthenticationDeserializer extends JsonDeserializer<DIDAuthentication> {
    @Override
    public DIDAuthentication deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonToken jsonToken = p.getCurrentToken();
        if (jsonToken == JsonToken.VALUE_STRING) {
            return new DIDVeriMethodIdAuthentication(
                    new DIDVerificationMethod.ID(p.getValueAsString())
            );
        }

        ObjectMapper objectMapper = (ObjectMapper) p.getCodec();
        DIDVerificationMethod veriMethod =  objectMapper.readValue(p, DIDVerificationMethod.class);
        return new DIDVeriMethodAuthentication(veriMethod);
    }
}
