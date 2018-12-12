package com.polestar.service;

import java.util.HashMap;
import java.util.Map;

import com.polestar.model.Car;
import com.polestar.model.Slot;
import com.polestar.model.Ticket;
/**
 * Model class to perform car park operations
 * @author reddemma
 *
 */
public class CarPark {
	//Stores ticket, car information as map
	private final Map<Ticket,Car> parkingCars = new HashMap<>();
	// stores slot information
	private final Slot targetSlot;

	// constructor
	public CarPark() {
		targetSlot = new Slot();
	}
	
	//Method to park the new car
	public void parkNewCar(Car car) {
		if (targetSlot.numOfAvailableSpaces() > 0) {
			parkingCars.put(new Ticket(), car);
			targetSlot.addCar(car);
		} else {
			System.out.println("No available spaces to park a " + car);
		}
	}
	
	//Method to un park the new car
	public void unParkCar(int ticketId) {
		Ticket ticket = null;
		for (Ticket t : parkingCars.keySet()) {
			if (t.getTicketId() == ticketId) {
				ticket = t;
				break;
			}
		}
		if (ticket != null) {
			final Car car = parkingCars.get(ticket);
			parkingCars.remove(ticket);
			targetSlot.remove(car);
		} else {
			System.out.println("Ticket is not available " + ticketId);
		}

	}
	
	@Override
	public String toString() {
		StringBuilder text = new StringBuilder();
		text.append(targetSlot);
		for (int i = targetSlot.numOfOccupiedSpaces(); i < Slot.getMaxCapacity() - 1; i++) {
			text.append(" ,");
		}
		return text.toString();
	}
	
}
