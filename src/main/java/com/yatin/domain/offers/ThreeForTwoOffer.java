package com.yatin.domain.offers;

import java.math.BigDecimal;

/**
 * This offer every three items to be priced for two,
 * and will calculate the cost accordingly
 */
public class ThreeForTwoOffer implements Offer {

    public BigDecimal totalCost(BigDecimal price, double numberOfitems) {

        double thirdTotalItems = numberOfitems / 3;
        double secondTotalItems = (numberOfitems + 1) / 3;
        double firstTotalItems = (numberOfitems + 2) / 3;

        //TODO: Split these calculations out into methods, as some repetition
        if (Math.floor(thirdTotalItems) == thirdTotalItems) {
            return price.multiply(BigDecimal.valueOf(thirdTotalItems * 2));
        } else if (Math.floor(secondTotalItems) == secondTotalItems) {
            return price.multiply(BigDecimal.valueOf(secondTotalItems * 2));
        } else {
            return price.multiply(BigDecimal.valueOf((firstTotalItems * 2) - 1));
        }
    }

}