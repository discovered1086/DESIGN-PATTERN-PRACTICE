package mycoding.creationalpatterns.builderpattern.shoppingexample.common;

/**
 * Created by kingshuk on 11/7/17.
 */
public class HomeDecorShoppingItem extends ShoppingListItem {

    public HomeDecorShoppingItem() {
    }

    public HomeDecorShoppingItem(String itemName, Double itemPrice) {
        super(itemName, itemPrice);
    }
}
