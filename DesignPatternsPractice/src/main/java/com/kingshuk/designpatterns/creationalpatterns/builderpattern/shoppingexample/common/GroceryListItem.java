package com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.common;

/**
 * Created by kingshuk on 11/7/17.
 */
public class GroceryListItem extends ShoppingListItem {

    public GroceryListItem() {
    }

    public GroceryListItem(String itemName, Double itemPrice) {
        super(itemName, itemPrice);
    }
}
