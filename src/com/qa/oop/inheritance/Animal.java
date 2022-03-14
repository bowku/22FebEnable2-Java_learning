package com.qa.oop.inheritance;

//extends object , its a class that all classes are init, need to add abstract to the class to allow abstract methods ( methods without {}  )
public abstract class Animal {

	private int age; // private doesn't get inherited
	private int numOfLegs;
	private String colour;

	public Animal() {
	} // need default constructor if you use extend

	public Animal(int age, int numOfLegs, String colour) {
//		super();
		this.age = age;
		this.numOfLegs = numOfLegs;
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public abstract void makeNoise();   //needs abstract to get rid of {} for the method and also its class

	@Override
	public String toString() {
		return "Animal [age=" + age + ", numOfLegs=" + numOfLegs + ", colour=" + colour + "]";
	}

}
