package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeInfoResponse {

    @JsonProperty("node_info")
    private NodeInfo nodeInfo;
    @JsonProperty("application_version")
    private ApplicationVersion applicationVersion;


    @Getter @Setter @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Other {
        @JsonProperty("tx_index")
        private String txIndex;
        @JsonProperty("rpc_address")
        private String rpcAddress;
    }
}
