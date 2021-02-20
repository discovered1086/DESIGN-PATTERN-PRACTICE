package com.kingshuk.designpatterns.creationalpatterns.factorymethod.improved;

public class BikeFactory extends TransportFactory{
	Transport create() {
		return new Bike();
	}
}
