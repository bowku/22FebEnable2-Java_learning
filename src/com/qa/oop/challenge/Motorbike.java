package com.qa.oop.challenge;

public class Motorbike extends Vehicle {
	
	private boolean fancy;
	
	public Motorbike(int wheels, String make, String colour, boolean fancy) {
		this.setWheels(wheels);
		this.setMake(make);
		this.setColour(colour);
		this.fancy=fancy;
	}

	public boolean isFancy() {
		return fancy;
	}

	public void setFancy(boolean fancy) {
		this.fancy = fancy;
	}
	
	@Override
	public void methodOne() {
		
	}
	
	@Override
	public String toString() {
		return "Motorbike [wheels = " + this.getWheels() + ", make = " + this.getMake() + ", colour = " + this.getColour() + ", fancy = " + fancy + "]";
	}


}
