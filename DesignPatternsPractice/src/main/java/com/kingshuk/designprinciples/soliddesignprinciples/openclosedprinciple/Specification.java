package com.kingshuk.designprinciples.soliddesignprinciples.openclosedprinciple;

//This interface is open for extension
@FunctionalInterface
public interface Specification<T> {
	boolean isSatisfied(T item);
}
