package com.qa.calculator;

public class Calculator {

	
	public int add(int numOne,int numTwo) {
		return numOne+numTwo;
	}
	
	public int subtract(int numOne,int numTwo) {
		return numOne-numTwo;
	}
	
	public int multiply(int numOne,int numTwo) {
		return numOne*numTwo;
	}
	
	
	
	
	public Float divide(int numOne,int numTwo) {
		if (numOne<numTwo) {
			return  (float) numOne/numTwo;
		} else {
			return null;
		}
		
	}
	
}
