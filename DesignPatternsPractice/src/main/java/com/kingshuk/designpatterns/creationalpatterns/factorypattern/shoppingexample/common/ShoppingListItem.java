package com.kingshuk.designpatterns.creationalpatterns.factorypattern.shoppingexample.common;

/**
 * Created by kingshuk on 11/7/17.
 */
public class ShoppingListItem {

    private String itemName;

    private Double itemPrice;

    protected ShoppingListItem() {
    }

    protected ShoppingListItem(String itemName, Double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }


    public static ShoppingListItem getNewGroceryShoppingList(String itemName, Double itemPrice){
        return new GroceryListItem(itemName, itemPrice);
    }

    public static ShoppingListItem getNewHomeDecorShoppingList(String itemName, Double itemPrice){
        return new HomeDecorShoppingItem(itemName, itemPrice);
    }

    @Override
    public String toString() {
        return "ShoppingListItem{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
