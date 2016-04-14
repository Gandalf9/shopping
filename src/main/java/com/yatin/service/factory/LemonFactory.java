package com.yatin.service.factory;

import com.yatin.domain.items.Lemon;
import com.yatin.domain.offers.BuyOneGetOneFreeOffer;

import java.math.BigDecimal;

public class LemonFactory {

    public static Lemon getLemon() {
        return new Lemon(new BigDecimal("0.5"), new BuyOneGetOneFreeOffer());
    }
}
