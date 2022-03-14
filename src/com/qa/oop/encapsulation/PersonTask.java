package com.qa.oop.encapsulation;

public class PersonTask {
	public static int count;  //need our class to be counted and static to access through class itself

	private String firstName;
	private String jobTitle;
	private int age;

	
	//method needs to have same name as class
	public PersonTask(String firstName, int age, String jobTitle) {
		this.firstName = firstName;
		this.age = age;
		this.jobTitle = jobTitle;
		count++;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getjobTitle(String jobTitle) {
		return jobTitle;
	}

	public void setjobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [FirstName = " + firstName + ", jobTitle = " + jobTitle + ", Age = " + age + "]";
	}

}

