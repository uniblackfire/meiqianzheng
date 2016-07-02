package com.meiqianzheng.java;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Item, Integer> itemsWithAmount = new HashMap<>();

    public Map<Item, Integer> getItemsWithAmount() {
        return itemsWithAmount;
    }

    public void addItemWithAmount(Item item, int amount) {
        itemsWithAmount.put(item, amount);
    }
}
