package com.qa.calculator;

import java.util.Scanner;

public class Calculator {

	public int add(int numOne, int numTwo) {
		return numOne + numTwo;
	}

	public int subtract(int numOne, int numTwo) {
		return numOne - numTwo;
	}

	public int multiply(int numOne, int numTwo) {
		return numOne * numTwo;
	}

//	public Float divide(int numOne, int numTwo) {
//		if (numOne < numTwo) {
//			return (float) numOne / numTwo;
//		} else {
//			return null;
//		}
	
	public Float divide (int numOne, int numTwo) {
		return (float) (numOne/numTwo);
	}

	public void interaction() {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;

		while (flag) {

			System.out.println("Enter first number : ");
			Integer numOne = scanner.nextInt();

			scanner.nextLine();

			System.out.println("Enter second number : ");
			Integer numTwo = scanner.nextInt();

			scanner.nextLine();

			System.out.println("Select operation (+ / * - ): ");
			String operation = scanner.nextLine();

			
			//we could of used switch case instead of all this else ifs
			
			if (operation.equalsIgnoreCase("+")) {
				System.out.println(add(numOne, numTwo));
			} else if (operation.equalsIgnoreCase("-")) {
				System.out.println(subtract(numOne, numTwo));
			} else if (operation.equalsIgnoreCase("*")) {
				System.out.println(multiply(numOne, numTwo));
			} else if (operation.equalsIgnoreCase("/")) {
				System.out.println(divide(numOne, numTwo));
			} else {
				System.out.println("Invalid operation");
			}

			System.out.println("Continue ? (y/n)");


			String choice = scanner.nextLine();

			if (choice.equalsIgnoreCase("y")) {
				continue;
			} else if (choice.equalsIgnoreCase("n")) {
				System.out.println("Closing calculator");
				flag = false;
				continue;
			} else {
				System.out.println("invalid input. restarting app.");
			}

		}
		
		scanner.close();
	}

}
