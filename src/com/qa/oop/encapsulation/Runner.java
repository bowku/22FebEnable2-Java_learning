package com.qa.oop.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
	
		
		PersonTask anoush = new PersonTask("Anoush",28,"Trainer");   //we are creating objects non-statically 
		PersonTask mohamed = new PersonTask("Mohamed",27,"Student");
		
		System.out.println("this many are printed: " + Person.count);
		
		
		System.out.println(anoush.getAge());     
		anoush.setAge(99);
		System.out.println(anoush.getAge());
		
		System.out.println(anoush);   
		System.out.println(mohamed);
		
		PersonManager pm = new PersonManager();
		pm.addList(anoush);
		pm.addList(mohamed);
		
//		searchPerson("Mohamed");
		
	}

}
