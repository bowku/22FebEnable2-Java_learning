package com.qa.constructor;

public class Person {
	
	//constructors doesn't need static or void just leave it public, you can even remove public person() since it doesn't make a difference unless you want to define it
	//class level variable or instance level variables
	
	public String name; 
	public int age;
	public int shoeSize;
	
	public Person() {} //this is used to have a default constructors, you can have as many constructors as you want : method overloading.
	
	public Person(String name, int age, int ShoeSize) {
		
		//'this' means this class
		this.name = name; 
		this.age = age;
		this.shoeSize = ShoeSize;
	}
	
	public void eat() {
	
		System.out.println("I am eating! ");
		}
	
	public static void sleep() {
		
		System.out.println("I am sleeping");
	}
}
