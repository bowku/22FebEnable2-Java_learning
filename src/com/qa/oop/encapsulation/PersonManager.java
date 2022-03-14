package com.qa.oop.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

	
	List<PersonTask> myPeople = new ArrayList<>();  //List<methodname> nameoflist = new ArrayList<>();
	
	
	//I can put objects in the argument
	public void addList(PersonTask name){
		myPeople.add(name);
	}
	
	public void searchPerson(String firstName) {
		for (PersonTask element : myPeople) {
			if(element.getFirstName() == firstName)
				System.out.println(element);
			return;
		} 
		System.out.println("no match");
	}
	
	
}
