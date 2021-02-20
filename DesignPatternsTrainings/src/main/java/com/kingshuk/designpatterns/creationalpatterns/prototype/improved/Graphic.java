package com.kingshuk.designpatterns.creationalpatterns.prototype.improved;

public abstract class Graphic {

	
	/**
	 * Create a clone of this graphic object.
	 */
	public abstract Graphic clone();


    public abstract String getUrl();
	
}
