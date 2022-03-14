package com.qa.oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class RunnerDemo {

	public static void main(String[] args) {

//		Animal animal = new Animal(10, 4, "Brown"); // you don't need to define animals, but define the subsets of this.
		Dog bob = new Dog(15, 4, "black", "staff", false);
		Cat cat = new Cat(10,4,"Yellow", true);
		System.out.println(bob.getAge());

		System.out.println(bob); // uses the animal class toString, dog inherits this.

		bob.makeNoise();
		cat.makeNoise();

		List<Animal> listOfAnimals = new ArrayList<>();
		listOfAnimals.add(bob);
		listOfAnimals.add(cat);

		for (Animal i : listOfAnimals) {
			System.out.println(i);
		}

	}

}
