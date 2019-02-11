package mycoding.creationalpatterns.factorypattern.headfirstexample;

/**
 * Created by CO21321 on 12/19/2017.
 */
public class PizzaStore {
    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza=pizzaFactory.createPizza(type);

        pizza.prepare();

        pizza.bake();

        pizza.cut();

        pizza.box();

        return pizza;
    }
}
