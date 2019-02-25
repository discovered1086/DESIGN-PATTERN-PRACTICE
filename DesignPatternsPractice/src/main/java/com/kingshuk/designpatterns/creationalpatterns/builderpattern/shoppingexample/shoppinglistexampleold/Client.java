package com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.shoppinglistexampleold;

import com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.common.ShoppingListItem;

/**
 * Created by kingshuk on 11/7/17.
 */
public class Client {

    public static void main(String[] args) {
        ShoppingListBuilderDirector listBuilderDirector = new ShoppingListBuilderDirector();

        ShoppingListBuilder builder = new GroceryShoppingListBuilder();
        ShoppingListItem shoppingListItem =
                listBuilderDirector.getShoppingList("garlic", 12.00, builder);

        System.out.println("The added item is " + shoppingListItem.getItemName()
                + " and it's price is $" + shoppingListItem.getItemPrice());

        builder = new HomeDecorShoppingListBuilder();
        shoppingListItem =
                listBuilderDirector.getShoppingList("light bulbs", 40.00, builder);

        System.out.println("The added item is " + shoppingListItem.getItemName()
                + " and it's price is $" + shoppingListItem.getItemPrice());

    }
}
