package com.qa.constructor;

public class Runner {

	public static void main(String[] args) {
		
		// Person.eat(); will only work if person is static
		Person.sleep();//sleep is static so it works.
		
		System.out.println();
		
		Person anoush = new Person("Anoush",28,12); //new person is calling your constructor
		System.out.println("Age: " + anoush.age);
		System.out.println("Name: " + anoush.name);
		anoush.eat();
		
		System.out.println();
		
		Person mateusz = new Person("Mateusz",24,10);
		System.out.println("ShoeSize: " + mateusz.shoeSize);
		System.out.println("Name: " + mateusz.name);
		
		System.out.println();
		
		Person p = new Person();
		System.out.println("ShoeSize: " + p.shoeSize); //every data type has a default value all 0 or null
		System.out.println("Name: " + p.name);
	}
	
}
