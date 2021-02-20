package com.kingshuk.designpatterns.creationalpatterns.builderpattern.othertraining.improved;

public interface QueryBuilder {

	void from(String from);
	
	void where(String where);
	
	Query getQuery();
	
}
