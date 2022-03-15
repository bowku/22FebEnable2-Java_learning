package com.qa.oop.challenge;

public class Runner {

	public static void main(String[] args) {
		
		Car bmw = new Car(4, "BMW", "White", true);
		Motorbike oldBike = new Motorbike(2, "Renault", "Black", false);
		Bus bigBus = new Bus(8, "Merc", "Red", true);
		Bus smallBus = new Bus(8, "Merc", "blue", false);
		
		Garage g = new Garage();
		
		g.addToGarage(bigBus);
		g.addToGarage(bmw);
		g.addToGarage(oldBike);
		g.addToGarage(smallBus);
		
		
	}

}
