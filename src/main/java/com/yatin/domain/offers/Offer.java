package com.yatin.domain.offers;

import java.math.BigDecimal;

/**
 * This represents an offer, which is used to calcuate the price of a group of <code>Buyable</code>
 * on which this <code>Offer</code> is placed
 */
public interface Offer {

    BigDecimal totalCost(BigDecimal price, double numberOfitems);
}
