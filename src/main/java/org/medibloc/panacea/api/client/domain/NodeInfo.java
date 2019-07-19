package org.medibloc.panacea.api.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeInfo {
    private String id;
    @JsonProperty("listen_addr")
    private String listenAddr;
    private String network;
    private String version;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("id", id)
                .append("listenAddr", listenAddr)
                .append("version", version)
                .toString();
    }
}
