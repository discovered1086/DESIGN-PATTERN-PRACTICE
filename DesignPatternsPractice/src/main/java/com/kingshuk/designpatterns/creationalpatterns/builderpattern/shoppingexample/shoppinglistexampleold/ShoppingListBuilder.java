package com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.shoppinglistexampleold;

import com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.common.ShoppingListItem;

/**
 * Created by kingshuk on 11/7/17.
 */
public interface ShoppingListBuilder {

    void addShoppingItem(String itemName, Double itemPrice);

    ShoppingListItem getListItem();

}
