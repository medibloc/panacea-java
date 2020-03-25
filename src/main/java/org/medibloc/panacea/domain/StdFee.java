package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

@NoArgsConstructor
@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class StdFee {
    private List<Coin> amount;
    private String gas;

    public StdFee(String denom, String amount, String gas) {
        Coin coin = new Coin();
        coin.setDenom(denom);
        coin.setAmount(amount);
        this.amount = Collections.singletonList(coin);
        this.gas = gas;
    }

}
