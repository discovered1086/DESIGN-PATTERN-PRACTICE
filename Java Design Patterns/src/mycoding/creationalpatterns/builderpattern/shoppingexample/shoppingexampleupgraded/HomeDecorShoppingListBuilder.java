package mycoding.creationalpatterns.builderpattern.shoppingexample.shoppingexampleupgraded;

import mycoding.creationalpatterns.builderpattern.shoppingexample.common.HomeDecorShoppingItem;
import mycoding.creationalpatterns.builderpattern.shoppingexample.common.ShoppingListItem;

import java.util.List;

/**
 * Created by kingshuk on 11/7/17.
 */
public class HomeDecorShoppingListBuilder extends ShoppingListBuilder<HomeDecorShoppingListBuilder> {

    @Override
    public HomeDecorShoppingListBuilder addShoppingItem(String itemName, Double itemPrice) {
        shoppingListItems.add(new HomeDecorShoppingItem(itemName,itemPrice));
        return this;
    }

    @Override
    public List<ShoppingListItem> getListItem() {
        return shoppingListItems;
    }
}
