package com.yatin.domain.offers;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DefaultOfferTest {


    private final Offer offer = new DefaultOffer();

    @Test
    public void oneItemsShouldBePriceOfOneItem() {

        assertThat(offer.totalCost(new BigDecimal("0.15"), 1), is(new BigDecimal("0.150")));

    }

    @Test
    public void twoItemsShouldBePriceOfTwoItem() {

        assertThat(offer.totalCost(new BigDecimal("0.15"), 2), is(new BigDecimal("0.300")));

    }

    @Test
    public void threeItemsShouldBePriceOfThreeItem() {

        assertThat(offer.totalCost(new BigDecimal("0.15"), 3), is(new BigDecimal("0.450")));

    }

    @Test
    public void fourItemsShouldBePriceOfFourItem() {

        assertThat(offer.totalCost(new BigDecimal("0.15"), 4), is(new BigDecimal("0.600")));

    }
}