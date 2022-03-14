package com.qa.oop.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class RunnerDemo {

	public static void main(String[] args) {
	
		
		
		Person anoush = new Person("Anoush","Lowton",28);
		Person mohamed = new Person("Mohamed","Jaleil",27);
		
		System.out.println("this many are printed: " + Person.count);
		
		
		System.out.println(anoush.getAge());     
		anoush.setAge(99);
		System.out.println(anoush.getAge());
		
		System.out.println(anoush);   //this tostring will print all the properties of the object and uses .tostring by default
//		System.out.println(anoush.toString()) this is the same as above
		System.out.println(mohamed);
		
		
		List<Person> myPeople = new ArrayList<>();
		myPeople.add(anoush);
		myPeople.add(mohamed);
		
		
		
}
}
	
