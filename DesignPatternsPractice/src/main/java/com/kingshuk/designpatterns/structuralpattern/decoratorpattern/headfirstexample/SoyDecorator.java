package com.kingshuk.designpatterns.structuralpattern.decoratorpattern.headfirstexample;

public class SoyDecorator extends CondimentDecorator{

    Beverage beverage;

    public SoyDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", soy";
    }

    @Override
    public Double cost() {
        return 0.60+beverage.cost();
    }
}
