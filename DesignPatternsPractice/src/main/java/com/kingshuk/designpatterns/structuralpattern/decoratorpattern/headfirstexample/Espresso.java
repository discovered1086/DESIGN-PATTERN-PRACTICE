package com.kingshuk.designpatterns.structuralpattern.decoratorpattern.headfirstexample;

public class Espresso extends Beverage {

    public Espresso() {
        description="Espresso";
    }

    @Override
    public Double cost() {
        return 1.99;
    }
}
