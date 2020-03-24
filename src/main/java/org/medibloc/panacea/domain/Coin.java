package org.medibloc.panacea.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
class Coin {
    private String denom;
    private String amount;
}