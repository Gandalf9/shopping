package com.yatin.domain.items;

import com.yatin.domain.offers.Offer;

import java.math.BigDecimal;

/**
 * This represents an item that will have a price and an offer on it.
 */
public interface Buyable {

    String getId();
    BigDecimal getPrice();
    Offer getOffer();
}
