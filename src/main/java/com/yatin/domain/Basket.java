package com.yatin.domain;

import com.yatin.domain.items.Buyable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Represents a collection of <code>Buyable</code>. Methods to add and remove from the collection
 * Includes the summing up of prices
 */
public class Basket {

    private final Map<String, List<Buyable>> items = new HashMap<>();

    /**
     * Add item to the basket
     * @param item
     */
    public void addItem(Buyable item) {

        if (item != null) {
            List<Buyable> buyables = items.get(item.getId());
            if (buyables == null) {

                ArrayList<Buyable> itemList = new ArrayList<Buyable>() {{
                    add(item);
                }};
                items.put(item.getId(), itemList);
            } else {
                buyables.add(item);
            }
        }
    }

    /**
     * Add a array of items to the basket
     * @param item
     */
    public void addItems(Buyable ...item) {
        for (Buyable b : item) {
            addItem(b);
        }
    }

    /**
     * Get a list of items that are currently in the basket
     *
     * @return
     */
    public List<Buyable> getItems() {

        List<Buyable> flattenedItems = new ArrayList<>();

        for (String id : items.keySet()) {
            flattenedItems.addAll(items.get(id));
        }

        return flattenedItems;
    }

    /**
     * Get the total cost of items in the basket, this will apply any <code>Offer</code>s that are applicable
     *
     * @return
     */
    public BigDecimal getTotalCost() {

        BigDecimal totalCost = BigDecimal.ZERO;

        for (String id : items.keySet()) {

            Buyable buyable = items.get(id).get(0);
            totalCost = totalCost.add(buyable.getOffer().totalCost(buyable.getPrice(), items.get(id).size()));
        }

        return totalCost;
    }

}
