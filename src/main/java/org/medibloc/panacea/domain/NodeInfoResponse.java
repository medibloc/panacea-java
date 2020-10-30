package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * A wrapper class of {@link NodeInfo} for the HTTP response of '/node_info'.
 * <p></p>
 * Since cosmos-sdk@v0.36.0, the node info is nested as the <code>node_info</code> field in the response.
 * See https://github.com/cosmos/cosmos-sdk/pull/4837.
 */
@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeInfoResponse {
    @JsonProperty("node_info")
    private NodeInfo nodeInfo;
}
