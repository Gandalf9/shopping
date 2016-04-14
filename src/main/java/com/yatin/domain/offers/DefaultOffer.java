package com.yatin.domain.offers;

import java.math.BigDecimal;

/**
 * This is the default offer and will multiply the number of items by the price
 */
public class DefaultOffer implements Offer {

    public BigDecimal totalCost(BigDecimal price, double numberOfitems) {
        return price.multiply(BigDecimal.valueOf(numberOfitems));
    }
}
