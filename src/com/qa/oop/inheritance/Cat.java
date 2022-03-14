package com.qa.oop.inheritance;

public class Cat extends Animal {

	private boolean hungry;

	public Cat(int age, int numOfLegs, String colour, boolean hungry) {
		this.setAge(age);
		this.setNumOfLegs(numOfLegs);
		this.setColour(colour);
		this.hungry = hungry;
	}

	public boolean isHungry() {
		return hungry;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	@Override
	public void makeNoise() {
		System.out.println("Meowww!");
	}

	@Override
	public String toString() {
		return "Cat [age = " + this.getAge() + ", numOfLegs = " + this.getNumOfLegs() + ", colour = " + this.getColour() + ", Hungry = " + hungry + "]";

	}
}
