package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * A wrapper class of {@link List<TxResponse>} for the HTTP response of '/txs?tx.height={height}'.
 * <p></p>
 * Since cosmos-sdk@v0.36.0, the record is nested as the <code>txs</code> field in the response.
 * See https://github.com/cosmos/cosmos-sdk/blob/master/CHANGELOG.md#breaking-changes.
 */
@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class TxResponses {
    @JsonProperty("txs")
    private List<TxResponse> responses;
}
