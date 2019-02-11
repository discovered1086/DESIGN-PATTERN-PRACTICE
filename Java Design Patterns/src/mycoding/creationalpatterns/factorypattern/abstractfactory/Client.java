package mycoding.creationalpatterns.factorypattern.abstractfactory;


public class Client {

    public static void main(String [] args){

    	Transport vehicle = new Bike();
    	System.out.println(vehicle.drive());

    }
	
}
