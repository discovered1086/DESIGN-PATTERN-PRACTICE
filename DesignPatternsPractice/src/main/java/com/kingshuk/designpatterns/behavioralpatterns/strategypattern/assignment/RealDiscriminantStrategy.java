package com.kingshuk.designpatterns.behavioralpatterns.strategypattern.assignment;

public class RealDiscriminantStrategy implements DiscriminantStrategy {

	@Override
	public double calculateDiscriminant(double a, double b, double c) {
		double result = Math.pow(b, 2) - (4 * a * c);
		return result < 0 ? Double.NaN : result;
	}

}
