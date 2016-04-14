package com.yatin.service.factory;

import com.yatin.domain.items.Orange;
import com.yatin.domain.offers.ThreeForTwoOffer;

import java.math.BigDecimal;

public class OrangeFactory {

    public static Orange getOrange() {
        return new Orange(new BigDecimal("0.15"), new ThreeForTwoOffer());
    }
}
