package mycoding.creationalpatterns.builderpattern.shoppingexample.shoppingexampleupgraded;

import mycoding.creationalpatterns.builderpattern.shoppingexample.common.ShoppingListItem;

import java.util.ArrayList;
import java.util.List;

public abstract class ShoppingListBuilder<T extends ShoppingListBuilder<T>> {

    //private static List<ShoppingListItem> finalShoppingList=new ArrayList<>();

    protected List<ShoppingListItem> shoppingListItems=new ArrayList<>();

    public abstract T addShoppingItem(String itemName, Double itemPrice);

    public List<ShoppingListItem> getListItem(){
        return shoppingListItems;
    }

    /*public static void updateFinalList(List<ShoppingListItem> shoppingListItems){
        finalShoppingList.addAll(shoppingListItems);
    }

    public static List<ShoppingListItem> getFinalShoppingList() {
        return finalShoppingList;
    }*/
}
