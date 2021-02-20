package com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.shoppingexampleupgraded;

import java.util.List;

import com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.common.ShoppingListItem;

/**
 * Created by kingshuk on 11/7/17.
 */
public interface ShoppingListBuilderInterface<T extends ShoppingListBuilderInterface<T>> {

    T addShoppingItem(String itemName, Double itemPrice);

    List<ShoppingListItem> getListItem();

}
