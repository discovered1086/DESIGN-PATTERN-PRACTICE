package com.kingshuk.designpatterns.behavioralpatterns.strategypattern.assignment;

public class OrdinaryDiscriminantStrategy implements DiscriminantStrategy {

	@Override
	public double calculateDiscriminant(double a, double b, double c) {
		return Math.pow(b, 2)-(4*a*c);
	}

}
