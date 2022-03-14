package com.qa.oop.challenge;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public static void main(String[] args) {
		
		Car bmw = new Car(4, "BMW", "White", true);
		Motorbike oldBike = new Motorbike(2, "Renault", "Black", false);
		Bus bigBus = new Bus(8, "Merc", "Red", true);

		List<Vehicle> allVehicles = new ArrayList<>();

		allVehicles.add(bigBus);
		allVehicles.add(bmw);
		allVehicles.add(oldBike);
		
		for (Vehicle i : allVehicles) {
			System.out.println(i);
		}

	}
}