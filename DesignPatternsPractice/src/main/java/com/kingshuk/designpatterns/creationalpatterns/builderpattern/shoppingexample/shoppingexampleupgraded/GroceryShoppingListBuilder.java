package com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.shoppingexampleupgraded;

import java.util.List;

import com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.common.GroceryListItem;
import com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.common.ShoppingListItem;

public class GroceryShoppingListBuilder extends ShoppingListBuilder<GroceryShoppingListBuilder> {

    @Override
    public GroceryShoppingListBuilder addShoppingItem(String itemName, Double itemPrice) {
        shoppingListItems.add(new GroceryListItem(itemName, itemPrice));
        return this;
    }

    @Override
    public List<ShoppingListItem> getListItem() {
        return shoppingListItems;
    }
}
