package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class DidAuthenticationDeserializer extends JsonDeserializer<DidAuthentication> {
    @Override
    public DidAuthentication deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonToken jsonToken = p.getCurrentToken();
        if (jsonToken == JsonToken.VALUE_STRING) {
            return new DidVeriMethodIdAuthentication(
                    new DidVerificationMethod.Id(p.getValueAsString())
            );
        }

        ObjectMapper objectMapper = (ObjectMapper) p.getCodec();
        DidVerificationMethod veriMethod =  objectMapper.readValue(p, DidVerificationMethod.class);
        return new DidVeriMethodAuthentication(veriMethod);
    }
}
