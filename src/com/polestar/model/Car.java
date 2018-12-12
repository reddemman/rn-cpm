package com.polestar.model;
/**
 * Model class to store ticket information
 * @author reddemma
 *
 */
public class Car {
	//Stores car model name 
	private String model;

	public Car(final String model) {
		this.model = model;

	}
	
	@Override
	public String toString() {
		return model;
	}
}
