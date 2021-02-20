package com.kingshuk.designpatterns.creationalpatterns.factorypattern.headfirstexample;

/**
 * Created by CO21321 on 12/19/2017.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza;

        if("cheese".equals(type)){
            pizza=new CheezePizza();
        }else if("pepperoni".equals(type)){
            pizza=new PepperoniPizza();
        }else if("clam".equals(type)){
            pizza=new ClamPizza();
        }else{
            pizza=new VeggiePizza();
        }

        return pizza;
    }
}
