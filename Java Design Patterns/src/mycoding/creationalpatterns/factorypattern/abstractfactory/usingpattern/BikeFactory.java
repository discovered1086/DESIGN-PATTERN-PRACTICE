package mycoding.creationalpatterns.factorypattern.abstractfactory.usingpattern;

public class BikeFactory extends TransportFactory {
	Transport create() {
		return new Bike();
	}
}
