package mycoding.creationalpatterns.factorypattern.shoppingexample.shoppingexampleupgraded;

import mycoding.creationalpatterns.factorypattern.shoppingexample.common.ShoppingListItem;

public class BuilderPattenShoppingListHarness {
    public static void main(String[] args) {
        //Implementation of the factory method pattern
        ShoppingListItem groceryList=ShoppingListItem.getNewGroceryShoppingList("Banana", 45.22);

        ShoppingListItem homeDecorList=ShoppingListItem.getNewHomeDecorShoppingList("Fridge",872.33);

        System.out.println("The grocery item is"+System.lineSeparator()+groceryList);

        System.out.println("The home decor item is"+System.lineSeparator()+homeDecorList);
    }
}
