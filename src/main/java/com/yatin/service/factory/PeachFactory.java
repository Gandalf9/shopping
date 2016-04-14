package com.yatin.service.factory;

import com.yatin.domain.items.Peach;
import com.yatin.domain.offers.DefaultOffer;

import java.math.BigDecimal;

public class PeachFactory {

    public static Peach getPeach() {
        return new Peach(new BigDecimal("0.15"), new DefaultOffer());
    }
}
