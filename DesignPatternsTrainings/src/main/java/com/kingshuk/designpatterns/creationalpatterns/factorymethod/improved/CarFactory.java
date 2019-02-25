package com.kingshuk.designpatterns.creationalpatterns.factorymethod.improved;

public class CarFactory extends TransportFactory{
	Transport create() {
		return new Car();
	}
}
