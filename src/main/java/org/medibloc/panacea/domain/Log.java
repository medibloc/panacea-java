package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Log {
    private long msg_index;
    private boolean success;
    private String log;
    private List<Event> events;
}
