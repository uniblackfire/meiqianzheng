package com.meiqianzheng.java;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PosCalculatorTest {
    private PosCalculator pos;

    @Before
    public void setUp() throws Exception {
        pos = new PosCalculator();
    }

    @Test
    public void should_calculate_total_prices_when_given_one_item() throws Exception {
        // given
        Item apple = new Item("apple", 10);

        // when
        double totalPrice = pos.calculate(apple);

        // then
        assertThat(totalPrice, is(10.0));
    }

    @Test
    public void should_calculate_total_prices_when_given_two_items() throws Exception {
        // given
        Item pear = new Item("pear", 3);
        List<Item> itemList = Arrays.asList(pear, pear);

        // when
        double totalPrice = pos.calculate(itemList);

        // then
        assertThat(totalPrice, is(6.0));
    }

    @Test
    public void should_calculate_total_prices_when_given_two_different_items() throws Exception {
        // given
        Item pear = new Item("pear", 3);
        Item apple = new Item("apple", 10);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItemWithAmount(pear, 1);
        shoppingCart.addItemWithAmount(apple, 2);

        // when
        double totalPrice = pos.calculate(shoppingCart);

        // then
        assertThat(totalPrice, is(23.0));
    }

    @Test
    public void should_discount_10_when_total_price_exceed_100() throws Exception {
        // given
        Item pear = new Item("pear", 3);
        Item apple = new Item("apple", 10);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItemWithAmount(pear, 1);
        shoppingCart.addItemWithAmount(apple, 10);

        // when
        double totalPrice = pos.calculate(shoppingCart);

        // then
        assertThat(totalPrice, is(93.0));
    }

    @Test
    public void should_discount_20_when_total_price_exceed_200() throws Exception {
        // given
        Item pear = new Item("pear", 3);
        Item apple = new Item("apple", 20);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItemWithAmount(pear, 1);
        shoppingCart.addItemWithAmount(apple, 10);

        // when
        double totalPrice = pos.calculate(shoppingCart);

        // then
        assertThat(totalPrice, is(183.0));
    }
}
