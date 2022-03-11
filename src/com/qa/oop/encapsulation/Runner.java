package com.qa.oop.encapsulation;

public class Runner {

	public static void main(String[] args) {
	
		
		
		Person anoush = new Person("Anoush","Lowton",28);
		Person mohamed = new Person("Mohamed","Jaleil",27);
		
		
		System.out.println(anoush.getAge());
		anoush.setAge(99);
		System.out.println(anoush.getAge());
		
		System.out.println(anoush);
		System.out.println(mohamed);
}
}
	
