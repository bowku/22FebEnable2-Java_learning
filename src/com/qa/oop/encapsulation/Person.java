package com.qa.oop.encapsulation;

public class Person {
	
	public static int count;  //need our class to be counted and static to access through class itself

	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		count++;
	}

	public String getFirstName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName(String lastName) {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [FirstName = " + firstName + ", LastName = " + lastName + ", Age = " + age + "]";
	}

}
