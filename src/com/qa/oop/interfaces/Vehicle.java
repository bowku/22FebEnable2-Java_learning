package com.qa.oop.interfaces;

public abstract class Vehicle {
//add type to make question easier as a variable and add them into the other vehicles
	private int wheels;
	private String make;
	private String colour;
	
	public Vehicle() {}

	public int getWheels() {
		return wheels;
	}

	public Vehicle(int wheels, String make, String colour) {
//		super();
		this.wheels = wheels;
		this.make = make;
		this.colour = colour;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public abstract void calculateBill();
	
	public void RadioOn() {
		System.out.println("Radio on");
	}
	
	

	@Override
	public String toString() {
		return "Vehicle [wheels = " + wheels + ", make = " + make + ", colour = " + colour + "]";
	}

}
