package com.kingshuk.designpatterns.creationalpatterns.factorymethod;


public class Client {

    public static void main(String [] args){

    	Transport vehicle = new Car();
    	System.out.println(vehicle.drive());
    	

    	
    }
	
}
