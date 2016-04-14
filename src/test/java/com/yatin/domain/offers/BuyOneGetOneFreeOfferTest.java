package com.yatin.domain.offers;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BuyOneGetOneFreeOfferTest {

    private final Offer offer = new BuyOneGetOneFreeOffer();

    @Test
    public void oneItemsShouldBePriceOfOneItem() {

        assertThat(offer.totalCost(new BigDecimal("0.5"), 1), is(new BigDecimal("0.50")));

    }

    @Test
    public void twoItemsShouldBePriceOfOneItem() {

        assertThat(offer.totalCost(new BigDecimal("0.5"), 2), is(new BigDecimal("0.50")));

    }

    @Test
    public void threeItemsShouldBePriceOfTwoItem() {

        assertThat(offer.totalCost(new BigDecimal("0.5"), 3), is(new BigDecimal("1.00")));

    }
}