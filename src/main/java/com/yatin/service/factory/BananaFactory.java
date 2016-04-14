package com.yatin.service.factory;

import com.yatin.domain.items.Banana;
import com.yatin.domain.offers.DefaultOffer;

import java.math.BigDecimal;

public class BananaFactory {

    public static Banana getBanana() {
        return new Banana(new BigDecimal("0.20"), new DefaultOffer());
    }
}
