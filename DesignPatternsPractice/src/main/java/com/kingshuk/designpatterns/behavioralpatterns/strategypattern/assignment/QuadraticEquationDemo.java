package com.kingshuk.designpatterns.behavioralpatterns.strategypattern.assignment;

public class QuadraticEquationDemo {

	public static void main(String[] args) {
		QuadraticEquationSolver equationSolver = 
				new QuadraticEquationSolver(new OrdinaryDiscriminantStrategy());
		
		
		Pair<Complex, Complex> result = equationSolver.solve(4, 5, 5);
		
		System.out.println(result.getFirst().toString());
		
		System.out.println(result.getSecond().toString());
	}

}
