package mycoding.creationalpatterns.builderpattern.shoppingexample.shoppinglistexampleold;


import mycoding.creationalpatterns.builderpattern.shoppingexample.common.ShoppingListItem;

/**
 * Created by kingshuk on 11/7/17.
 */
public class ShoppingListBuilderDirector {

    public ShoppingListItem getShoppingList(String itemName, Double itemPrice, ShoppingListBuilder builder){
        builder.addShoppingItem(itemName, itemPrice);
        return builder.getListItem();
    }
}
