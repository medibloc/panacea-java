package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * A wrapper class of {@link Record} for the HTTP response of '/api/v1/aol/{ownerAddress}/topics/{topicName}/records/{offset}'.
 * <p></p>
 * Since cosmos-sdk@v0.36.0, the REST API has returned a <code>height</code> in the response, and the record is nested as the <code>result</code> field.
 * See https://github.com/cosmos/cosmos-sdk/blob/master/CHANGELOG.md#breaking-changes.
 */
@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecordResponse {
    private Long height;
    @JsonProperty("result")
    private Record record;
}
