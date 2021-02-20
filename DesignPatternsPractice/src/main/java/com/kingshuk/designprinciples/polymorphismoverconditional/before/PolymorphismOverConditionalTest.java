package com.kingshuk.designprinciples.polymorphismoverconditional.before;

public class PolymorphismOverConditionalTest {

	public static void main(String[] args) {
		PolymorphismOverConditionalTest test = new PolymorphismOverConditionalTest();
		
		test.printMethod("tiger");
	}

	public void printMethod(String animalType) {
		switch (animalType) {
		case "tiger":
			System.out.println("This is a tiger");
			break;
		case "cat":
			System.out.println("This is a cat");
			break;
		case "leopard":
			System.out.println("This is a leopard");
			break;
		default:
			break;
		}
	}

}
