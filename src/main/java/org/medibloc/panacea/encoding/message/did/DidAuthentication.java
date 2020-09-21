package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = DidAuthenticationDeserializer.class)
public interface DidAuthentication {
}
