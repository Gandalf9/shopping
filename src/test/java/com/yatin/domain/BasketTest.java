package com.yatin.domain;

import com.yatin.domain.items.*;
import org.junit.Test;

import java.math.BigDecimal;

import static com.yatin.service.factory.AppleFactory.getApple;
import static com.yatin.service.factory.BananaFactory.getBanana;
import static com.yatin.service.factory.OrangeFactory.getOrange;
import static com.yatin.service.factory.LemonFactory.getLemon;
import static com.yatin.service.factory.PeachFactory.getPeach;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BasketTest {

    @Test
    public void simpleOfferItemsShouldReturnCorrectAmount() {

        Apple a1 = getApple();
        Apple a2 = getApple();
        Banana b1 = getBanana();
        Banana b2 = getBanana();
        Peach p1 = getPeach();

        Basket basket = new Basket();
        basket.addItems(a1, a2, b1, b2, p1);

        assertThat(basket.getTotalCost(), is(new BigDecimal("1.250")));
    }

    @Test
    public void complexOfferItemsShouldReturnCorrectAmount() {

        Apple a1 = getApple();
        Apple a2 = getApple();
        Banana b1 = getBanana();
        Banana b2 = getBanana(); //1.10
        Lemon m1 = getLemon();
        Lemon m2 = getLemon();
        Lemon m3 = getLemon(); //1
        Orange l1 = getOrange();
        Orange l2 = getOrange();
        Orange l3 = getOrange();
        Orange l4 = getOrange();
        Orange l5 = getOrange();
        Orange l6 = getOrange(); //0.6


        Basket basket = new Basket();
        basket.addItems(a1, a2, b1, b2, m1, m2, m3, l1, l2, l3, l4, l5, l6);

        assertThat(basket.getTotalCost(), is(new BigDecimal("2.700")));
    }

    @Test
    public void nullItemsAddedToBasketShouldReturnZeroItems() {

        Basket basket = new Basket();
        basket.addItems(null, null);
        basket.getItems();

        assertThat(basket.getItems().size(), is(0));
    }

    @Test
    public void nullItemsAddedToBasketShouldReturnZeroCost() {

        Basket basket = new Basket();
        basket.addItems(null, null);

        assertThat(basket.getTotalCost(), is(BigDecimal.ZERO));
    }
}