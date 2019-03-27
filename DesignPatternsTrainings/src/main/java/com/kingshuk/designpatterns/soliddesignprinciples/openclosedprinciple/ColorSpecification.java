package com.kingshuk.designpatterns.soliddesignprinciples.openclosedprinciple;

public class ColorSpecification implements Specification<Product> {
	private Color color;

	public ColorSpecification(Color color) {
		this.color = color;
	}

	@Override
	public boolean isSatisfied(Product p) {
		return p.color == color;
	}
}
