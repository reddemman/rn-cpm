package com.polestar.model;

import java.util.ArrayList;
/**
 * Class to stores the car parking slot information
 * @author reddemma 
 *
 */
public class Slot {
	private static final int MAXCAPACITY = 10;
	private ArrayList<Car> carParkArray; // Every member of carParkArray will be of type Car
	
	public Slot() {
		carParkArray = new ArrayList<>(MAXCAPACITY);
	}

	// Method to find maximum capacity of the car park
	public static int getMaxCapacity() {
		return MAXCAPACITY;
	}

	// Method to find available spots in the car park
	public int numOfAvailableSpaces() {
		return MAXCAPACITY - this.carParkArray.size();
	}

	// Method to find number of occupied spaces in the car park
	public int numOfOccupiedSpaces() {
		return this.carParkArray.size();
	}
	
	// Method to remove car from the car parking
	public void remove(Car car) {
		carParkArray.remove(car);

	}
	
	// Method to add car to the car parking
	public void addCar(Car car) {
		carParkArray.add(car);

	}	
	@Override
	public String toString() {
		StringBuilder carDetails = new StringBuilder();
		for (Car car : carParkArray) {
			carDetails.append(car + ",");
		}

		return carDetails.toString();
	}
	
}
