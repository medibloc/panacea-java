package org.medibloc.panacea.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Res <T> {
    private long height;
    private T result;
}
