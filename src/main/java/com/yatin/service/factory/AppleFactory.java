package com.yatin.service.factory;

import com.yatin.domain.items.Apple;
import com.yatin.domain.offers.DefaultOffer;

import java.math.BigDecimal;

public class AppleFactory {

    public static Apple getApple() {
        return new Apple(new BigDecimal("0.35"), new DefaultOffer());
    }
}
