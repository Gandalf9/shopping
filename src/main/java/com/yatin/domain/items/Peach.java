package com.yatin.domain.items;

import com.yatin.domain.offers.Offer;

import java.math.BigDecimal;

public class Peach implements Buyable{

    private final String id = "Orange";
    private final BigDecimal price;
    private final Offer offer;

    public Peach(BigDecimal price, Offer offer) {
        this.price = price;
        this.offer = offer;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Offer getOffer() {
        return offer;
    }
}
