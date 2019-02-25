package com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.shoppinglistexampleold;

import com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.common.GroceryListItem;
import com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.common.ShoppingListItem;

/**
 * Created by kingshuk on 11/7/17.
 */
public class GroceryShoppingListBuilder implements ShoppingListBuilder {

    private ShoppingListItem listItem=new GroceryListItem();

    @Override
    public void addShoppingItem(String itemName, Double itemPrice) {
        listItem.setItemName(itemName);
        listItem.setItemPrice(itemPrice);
    }

    public ShoppingListItem getListItem() {
        return listItem;
    }
}
