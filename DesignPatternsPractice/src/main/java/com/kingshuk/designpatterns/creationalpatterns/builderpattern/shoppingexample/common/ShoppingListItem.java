package com.kingshuk.designpatterns.creationalpatterns.builderpattern.shoppingexample.common;

/**
 * Created by kingshuk on 11/7/17.
 */
public abstract class ShoppingListItem {

    private String itemName;

    private Double itemPrice;

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

    public ShoppingListItem() {
    }

    public ShoppingListItem(String itemName, Double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
}
