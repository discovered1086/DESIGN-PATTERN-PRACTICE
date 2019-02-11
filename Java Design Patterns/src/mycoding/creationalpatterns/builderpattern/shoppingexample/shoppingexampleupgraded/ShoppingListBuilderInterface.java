package mycoding.creationalpatterns.builderpattern.shoppingexample.shoppingexampleupgraded;

import mycoding.creationalpatterns.builderpattern.shoppingexample.common.ShoppingListItem;

import java.util.List;

/**
 * Created by kingshuk on 11/7/17.
 */
public interface ShoppingListBuilderInterface<T extends ShoppingListBuilderInterface<T>> {

    T addShoppingItem(String itemName, Double itemPrice);

    List<ShoppingListItem> getListItem();

}
