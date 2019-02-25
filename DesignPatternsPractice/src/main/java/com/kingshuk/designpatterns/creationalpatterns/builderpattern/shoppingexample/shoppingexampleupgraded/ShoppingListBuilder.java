package com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.shoppingexampleupgraded;

import java.util.ArrayList;
import java.util.List;

import com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.common.ShoppingListItem;

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
