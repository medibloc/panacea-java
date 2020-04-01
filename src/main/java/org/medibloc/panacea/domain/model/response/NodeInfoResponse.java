package org.medibloc.panacea.domain.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.medibloc.panacea.domain.ApplicationVersion;
import org.medibloc.panacea.domain.NodeInfo;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeInfoResponse {

    @JsonProperty("node_info")
    private NodeInfo nodeInfo;
    @JsonProperty("application_version")
    private ApplicationVersion applicationVersion;

}
