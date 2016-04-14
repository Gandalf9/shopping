package com.yatin.domain.offers;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ThreeForTwoOfferTest {

    private final Offer offer = new ThreeForTwoOffer();

    @Test
    public void oneItemsShouldBePriceOfOneItem() {

        assertThat(offer.totalCost(new BigDecimal("0.15"), 1), is(new BigDecimal("0.150")));

    }

    @Test
    public void twoItemsShouldBePriceOfTwoItem() {

        assertThat(offer.totalCost(new BigDecimal("0.15"), 2), is(new BigDecimal("0.300")));

    }

    @Test
     public void threeItemsShouldBePriceOfTwoItem() {

        assertThat(offer.totalCost(new BigDecimal("0.15"), 3), is(new BigDecimal("0.300")));

    }

    @Test
    public void fourItemsShouldBePriceOfThreeItem() {

        assertThat(offer.totalCost(new BigDecimal("0.15"), 4), is(new BigDecimal("0.450")));

    }

    @Test
    public void fiveItemsShouldBePriceOfFourItem() {

        assertThat(offer.totalCost(new BigDecimal("0.15"), 5), is(new BigDecimal("0.600")));

    }

    @Test
    public void sixItemsShouldBePriceOfFourItem() {

        assertThat(offer.totalCost(new BigDecimal("0.15"), 6), is(new BigDecimal("0.600")));

    }

    @Test
    public void sandbox() {

        System.out.println(Math.floor(1/3));
        System.out.println(Math.floor(2/3));
        System.out.println(Math.floor(3/3));
        System.out.println(Math.floor(4/3));
        System.out.println(Math.floor(5/3));
        System.out.println(Math.floor(6/3));

        System.out.println(Math.floor((1/3)*2) == third(1));
        System.out.println(Math.floor((2/3)*2) == third(2));
        System.out.println(Math.floor((3/3)*2) == third(3));
        System.out.println(Math.floor((4/3)*2) == third(4));
        System.out.println(Math.floor((5/3)*2) == third(5));
        System.out.println(Math.floor((6/3)*2) == third(6));

    }

    private double third(double x) {
        return (x/3)*2;
    }

}