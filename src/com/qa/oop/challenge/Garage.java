package com.qa.oop.challenge;

import java.util.ArrayList;
import java.util.List;

public class Garage {
		
		List<Vehicle> allVehicles = new ArrayList<>();
		
		public void addToGarage (Vehicle input) {
			this.allVehicles.add(input);
		}
		
		public void removeVehicle(Vehicle input) {
			this.allVehicles.remove(input);
		}
		
		
		
		
		
	}
