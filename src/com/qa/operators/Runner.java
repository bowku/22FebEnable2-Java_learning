package com.qa.operators;

public class Runner {

	public static void main(String[] args) {
		int numOne = 9;
		int numTwo = 10;
		
		System.out.println(numOne+numTwo);
		System.out.println((float)numOne / (float)numTwo); // java always rounds down ints either 'cast' by adding float or use float in the initial definition
		
		
		//modulus
		System.out.println(10%3);
		
		
		System.out.println(numOne++);
		System.out.println(numOne++);
		numOne++;
		System.out.println(numOne);
		
		numOne += numOne; //this is basically numone=numone+numone
		numOne += 1;  // numone=numone+1
		
		//Not operator
		
		boolean flag = false;
		System.out.println(!flag);
		
	}

}
