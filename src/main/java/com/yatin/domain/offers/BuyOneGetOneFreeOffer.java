package com.yatin.domain.offers;

import java.math.BigDecimal;

/**
 * This offer will allow one item to be free every second item
 */
public class BuyOneGetOneFreeOffer implements Offer {

    public BigDecimal totalCost(BigDecimal price, double numberOfItems) {

        double halfNumberOfItems = numberOfItems / 2;

        //If even number item
        if (Math.floor(halfNumberOfItems) == halfNumberOfItems) {
            return price.multiply(BigDecimal.valueOf(halfNumberOfItems));
        } else { //If odd number item
            return price.multiply(BigDecimal.valueOf(halfNumberOfItems+0.5));
        }
    }

}
