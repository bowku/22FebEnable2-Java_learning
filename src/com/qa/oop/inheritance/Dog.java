package com.qa.oop.inheritance;

//dog is a child class and takes all its public expressions.

public class Dog extends Animal {

//	private int age;                       we just need to inherit the properties from the other class. no need to repeat these. it also inherits all the gets and sets
//	private int numOfLegs;
//	private String colour;
	private String breed;
	private boolean isPanting;

	public Dog(int age, int numOfLegs, String colour, String breed, boolean isPanting) {
		// super(age, numOfLegs, colour); //superclass is the parent, basic properties
		// of dog, then add dog stuff thats exclusive
		this.setAge(age);
		this.setNumOfLegs(numOfLegs); // can also do it this way if you don't use super
		this.setColour(colour);
		this.breed = breed;
		this.isPanting = isPanting;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isPanting() {
		return isPanting;
	}

	public void setPanting(boolean isPanting) {
		this.isPanting = isPanting;
	}

	@Override
	public void makeNoise() {
		System.out.println("Bark!");
	}

	// can use getters and setters to get specifically dogs toString
	@Override
	public String toString() {
		return "Dog [age = " + this.getAge() + ", numOfLegs = " + this.getNumOfLegs() + ", colour = " + this.getColour()
				+ ", breed = " + breed + ", isPanting = " + isPanting + "]";
	}

}
