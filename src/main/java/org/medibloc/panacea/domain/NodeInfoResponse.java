package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class NodeInfoResponse {

    @JsonProperty("node_info")
    private NodeInfo nodeInfo;
    @JsonProperty("application_version")
    private ApplicationVersion applicationVersion;

    @Getter @Setter @ToString
    public static class NodeInfo {
        @JsonProperty("protocol_version")
        private ProtocolVersion protocolVersion;
        private String id;
        @JsonProperty("listen_addr")
        private String listenAddr;
        private String network;
        private String version;
        private String channels;
        private String moniker;
        private Other  other;
    }

    @Getter @Setter @ToString
    public static class Other {
        @JsonProperty("tx_index")
        private String txIndex;
        @JsonProperty("rpc_address")
        private String rpcAddress;
    }
}

@Getter @Setter @ToString
class ProtocolVersion {
    private String p2p;
    private String block;
    private String app;
}

@Getter @Setter @ToString
class ApplicationVersion {
    private String name;
    @JsonProperty("server_name")
    private String serverName;
    @JsonProperty("client_name")
    private String clientName;
    private String version;
    private String commit;
    @JsonProperty("build_tags")
    private String buildTags;
    private String go;
}