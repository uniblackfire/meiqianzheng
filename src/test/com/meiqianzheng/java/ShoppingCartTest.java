package com.meiqianzheng.java;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShoppingCartTest {
    @Test
    public void should_calculate_total_price_accord_shopping_cart() throws Exception {
        //given
        Item pear = new Item("pear", 3);
        Item apple = new Item("apple", 10);

        //when
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItemWithAmount(pear, 1);
        shoppingCart.addItemWithAmount(apple, 2);

        Map<Item, Integer> map = shoppingCart.getItemsWithAmount();

        //then
        assertThat(map.size(), is(2));
        assertThat(map.get(apple), is(2));
        assertThat(map.get(pear), is(1));
    }

}