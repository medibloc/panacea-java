package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.medibloc.panacea.domain.model.response.NodeInfoResponse;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeInfo {
    @JsonProperty("protocol_version")
    private ProtocolVersion protocolVersion;
    private String id;
    @JsonProperty("listen_addr")
    private String listenAddr;
    private String network;
    private String version;
    private String channels;
    private String moniker;
    private NodeInfoResponse.Other other;
}
