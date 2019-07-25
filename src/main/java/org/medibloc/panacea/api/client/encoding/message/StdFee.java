package org.medibloc.panacea.api.client.encoding.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Collections;
import java.util.List;

@Getter @Setter
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("amount", amount)
                .append("gas", gas)
                .toString();
    }
}
