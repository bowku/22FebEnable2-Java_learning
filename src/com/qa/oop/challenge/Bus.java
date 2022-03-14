package com.qa.oop.challenge;

public class Bus extends Vehicle{
	
	private boolean doubleDecker;
	
	public Bus(int wheels, String make, String colour, boolean doubleDecker ) {
		this.setWheels(wheels);
		this.setMake(make);
		this.setColour(colour);
		this.doubleDecker = doubleDecker;
	}

	public boolean isDoubleDecker() {
		return doubleDecker;
	}

	public void setDoubleDecker(boolean doubleDecker) {
		this.doubleDecker = doubleDecker;
	}
	
	@Override
	public void methodOne() {
		
	}
	
	@Override
	public String toString() {
		return "Bus [wheels = " + this.getWheels() + ", make = " + this.getMake() + ", colour = " + this.getColour() + ", Doubledecker = " + doubleDecker + "]";
	}


}
