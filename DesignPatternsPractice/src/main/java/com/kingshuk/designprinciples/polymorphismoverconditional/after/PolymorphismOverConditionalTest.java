package com.kingshuk.designprinciples.polymorphismoverconditional.after;

/**
 * Imagine this is the class which has business logic
 * @author kingshuksmacbookpro
 *
 */
public class PolymorphismOverConditionalTest {

	public static void main(String[] args) {
		PolymorphismOverConditionalTest test = new PolymorphismOverConditionalTest();
		
		test.printMethod(AnimalType.LEOPARD);
	}

	public void printMethod(AnimalType animalType) {
		Animal animal = new AnimalAbstractFactory().getAnimalInstance(animalType);
		
		animal.printAnimal();
	}

}
