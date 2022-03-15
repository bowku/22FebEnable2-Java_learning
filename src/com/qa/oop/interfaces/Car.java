package com.qa.oop.interfaces;

public class Car extends Vehicle implements Radio {
	
	private boolean big;


	public Car(int wheels, String make, String colour, boolean big ) {
		this.setWheels(wheels);
		this.setMake(make);
		this.setColour(colour);
		this.big = big;
	}


	public boolean isBig() {
		return big;
	}


	public void setBig(boolean big) {
		this.big = big;
	}
	
	@Override
	public void calculateBill() {
		
	}
	
	@Override
	public String toString() {
		return "Car [wheels = " + this.getWheels() + ", make = " + this.getMake() + ", colour = " + this.getColour() + ", big = " + big + "]";
	}


	@Override
	public void radioOn() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void radioOff() {
		// TODO Auto-generated method stub
		
	}
	

}
