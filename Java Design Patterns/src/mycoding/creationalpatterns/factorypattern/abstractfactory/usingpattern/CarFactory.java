package mycoding.creationalpatterns.factorypattern.abstractfactory.usingpattern;

public class CarFactory extends TransportFactory {
	Transport create() {
		return new Car();
	}
}
