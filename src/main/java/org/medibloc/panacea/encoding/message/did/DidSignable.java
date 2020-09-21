package org.medibloc.panacea.encoding.message.did;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class DidSignable {
    private final Object data;
    @JsonSerialize(using = ToStringSerializer.class)  // NOTE: The String->Long deserialization is done automatically
    private final Long sequence;

    public static final Long INITIAL_SEQUENCE = 0L;
}
