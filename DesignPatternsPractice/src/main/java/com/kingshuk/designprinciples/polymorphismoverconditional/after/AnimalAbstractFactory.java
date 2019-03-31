package com.kingshuk.designprinciples.polymorphismoverconditional.after;

public class AnimalAbstractFactory {

	public Animal getAnimalInstance(AnimalType animalType) {
		Animal animal = null;

		switch (animalType) {
		case TIGER:
			animal = new Tiger();
			break;
		case CAT:
			animal = new Cat();
			break;
		case LEOPARD:
			animal = new Leopard();
			break;
		default:
			break;
		}

		return animal;
	}

}
