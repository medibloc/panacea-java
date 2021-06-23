package org.medibloc.panacea.domain;

import cosmos.base.v1beta1.Coin;

public class Coins {

    public static Coin createCoin(String denom, String amount) {
        return Coin.newBuilder()
                .setDenom(denom)
                .setAmount(amount)
                .build();
    }

    public static Coin createCoin(String denom, Integer amount) {
        return Coin.newBuilder()
                .setDenom(denom)
                .setAmount(String.valueOf(amount))
                .build();
    }
}
