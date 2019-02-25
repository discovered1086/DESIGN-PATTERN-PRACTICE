package com.kingshuk.designpatterns.structuralpattern.decoratorpattern.headfirstexample;

public class WhipDecorator extends CondimentDecorator {

    Beverage beverage;

    public WhipDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", whip";
    }

    @Override
    public Double cost() {
        return 0.80+beverage.cost();
    }
}
