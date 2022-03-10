package com.qa.scope;

public class Scope {
	
	// This is a class level scope (instance scope)
	public String message = "hello";
	
	public void methodOne(){
		// This is a local scope (method scope)
		String anotherMessage = "Goodbye";
		System.out.println(anotherMessage);
	}
	
	public void methodTwo() {
		System.out.println(message);
		}
	
	public void methodTwo(String message) {
		System.out.println(message);
		}
	
}
