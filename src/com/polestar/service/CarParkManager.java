package com.polestar.service;

import java.util.Scanner;

import com.polestar.model.Car;

/**
 * This is the main class to provide information and perform car park and un park operations.
 * 
 * @author reddemma
 *
 */
public class CarParkManager {
	enum CarParkActions {
		P, U, C;

	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to Car Parking Application");

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter car park input shoul be (“pABC,pXYZ,pEFG,u5000,c” ) : ");

		String input = scanner.nextLine();

		String[] cars = input.split(",");
		
		CarPark parkDetails = new CarPark();
		for (String car : cars) {
			String symbol = String.valueOf(car.charAt(0));
			CarParkActions action = CarParkActions.valueOf(symbol.toUpperCase());
			switch (action) {
			case P:
				parkDetails.parkNewCar(new Car(car.substring(1)));
				break;
			case U:
				String id = car.substring(1);
				parkDetails.unParkCar(Integer.parseInt(id));
				break;
			default:	
				break;

			}
		}
		System.out.println("The Car park management output:");
		System.out.println(parkDetails);
		scanner.close();
		System.out.println(" ==== End ====");
	}
	
	
	

}
