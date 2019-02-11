package mycoding.creationalpatterns.builderpattern.shoppingexample.shoppinglistexampleold;

import mycoding.creationalpatterns.builderpattern.shoppingexample.common.ShoppingListItem;

/**
 * Created by kingshuk on 11/7/17.
 */
public interface ShoppingListBuilder {

    void addShoppingItem(String itemName, Double itemPrice);

    ShoppingListItem getListItem();

}
