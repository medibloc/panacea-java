package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationVersion {
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