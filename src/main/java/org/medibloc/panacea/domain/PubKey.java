package org.medibloc.panacea.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
class PubKey {
    private String type;
    private String value;
}