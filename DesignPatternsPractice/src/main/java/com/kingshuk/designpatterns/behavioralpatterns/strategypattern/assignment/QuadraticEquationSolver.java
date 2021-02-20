package com.kingshuk.designpatterns.behavioralpatterns.strategypattern.assignment;

public class QuadraticEquationSolver {

	private DiscriminantStrategy strategy;

	public QuadraticEquationSolver(DiscriminantStrategy strategy) {
		this.strategy = strategy;
	}

	public Pair<Complex, Complex> solve(double a, double b, double c) {
		double discriminant = strategy.calculateDiscriminant(a, b, c);
		
		Complex rootOfDiscriminant =  Complex.sqrt(discriminant);
		
		return new Pair<>(
			      new Complex(-b,0).plus(rootOfDiscriminant)
			        .divides(new Complex(2,0))
			        .divides(new Complex(a, 0)),
			      new Complex(-b,0).minus(rootOfDiscriminant)
			        .divides(new Complex(2,0))
			        .divides(new Complex(a, 0))
			    );
	}
}
