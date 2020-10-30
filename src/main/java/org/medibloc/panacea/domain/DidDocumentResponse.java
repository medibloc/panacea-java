package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.medibloc.panacea.encoding.message.did.DidDocumentWithMeta;

/**
 * A wrapper class of {@link org.medibloc.panacea.encoding.message.did.DidDocumentWithMeta} for the HTTP response of '/api/v1/did/{did}'.
 * <p></p>
 * Since cosmos-sdk@v0.36.0, the REST API has returned a <code>height</code> in the response, and the data is nested as the <code>result</code> field.
 * See https://github.com/cosmos/cosmos-sdk/blob/master/CHANGELOG.md#breaking-changes.
 */
@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class DidDocumentResponse {
    private Long height;
    private DidDocumentWithMeta result;
}
