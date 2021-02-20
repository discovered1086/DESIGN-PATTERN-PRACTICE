package com.kingshuk.designpatterns.structuralpattern.decoratorpattern.headfirstexample;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description="House Blend Coffee";
    }

    @Override
    public Double cost() {
        return 2.09;
    }
}
