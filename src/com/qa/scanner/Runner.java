package com.qa.scanner;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // system.in is input stream and make sure u import
		boolean flag = true;

		while (flag) {
			System.out.println("enter a number:");
			Integer numberOne = scanner.nextInt();

			System.out.println("enter another number: ");
			Integer numberTwo = scanner.nextInt();

			System.out.println(numberOne + numberTwo);

			System.out.println("Continue ? (y/n)");
			scanner.nextLine();
			String choice = scanner.nextLine();

			if (choice.equalsIgnoreCase("y")) {
				continue;
			} else if (choice.equalsIgnoreCase("n")) {
				System.out.println("application stopping...");
				flag = false;
				continue;
			} else {
				System.out.println("invalid input. restarting app.");
			}
		}

//		System.out.println("Enter a value (int): ");
//		Integer numberOne = scanner.nextInt();
//
//		scanner.nextLine(); // consume the leftover newline character10
//
//		System.out.println("Enter another value (string): ");
//		String text = scanner.nextLine();
//
//		System.out.println("value (int) = " + numberOne);
//		System.out.println("Value (string) = " + text);

//		System.out.println("Enter another number: ");
//		Integer numberTwo = scanner.nextInt();
//		
//		System.out.println(numberOne + numberTwo);
//		

		scanner.close(); // this closes the scanner when your finished

	}

}
