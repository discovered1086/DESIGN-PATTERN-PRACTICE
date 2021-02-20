package com.kingshuk.designpatterns.creationalpatterns.factorypattern.abstractfactory;


public class Car extends Transport {
    @Override
    public String drive() {
        return "I'm driving a car";
    }
}
