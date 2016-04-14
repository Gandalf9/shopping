package com.yatin.domain.items;

import com.yatin.domain.offers.Offer;

import java.math.BigDecimal;

public class Orange implements Buyable {

    private final String id = "Orange";
    private final BigDecimal price;
    private final Offer offer;

    public Orange(BigDecimal price, Offer offer) {
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
