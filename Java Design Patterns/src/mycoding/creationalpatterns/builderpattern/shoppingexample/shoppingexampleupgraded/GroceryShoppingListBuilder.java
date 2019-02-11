package mycoding.creationalpatterns.builderpattern.shoppingexample.shoppingexampleupgraded;

import mycoding.creationalpatterns.builderpattern.shoppingexample.common.GroceryListItem;
import mycoding.creationalpatterns.builderpattern.shoppingexample.common.ShoppingListItem;

import java.util.List;

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
