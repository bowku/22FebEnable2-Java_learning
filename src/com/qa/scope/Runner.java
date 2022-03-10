package com.qa.scope;

public class Runner {

	public static void main(String[] args) {
		
		Scope myObj = new Scope();
		myObj.methodOne();
		
		// method overloading: having multiple methods with the same name but have to be different i.e different parameters
		myObj.methodTwo();
		myObj.methodTwo("Another Message");
		
	}
	
	}
