package com.qa.helloworld;

public class Results{

	
	private static double Physics = 60;
	private static double Chemistry = 98;
	private static double Biology = 75;
	private static double Total=150;

	public static void method1(){
		System.out.print("you got: "); System.out.print(Biology); System.out.print(" marks! in Biology"); System.out.print(" out of total mark ");System.out.print(Total);
		System.out.println(" ");
		System.out.print("you got: "); System.out.print(Physics); System.out.print(" marks! in Physics");System.out.print(" out of total mark ");System.out.print(Total);
		System.out.println(" ");
		System.out.print("you got: "); System.out.print(Chemistry); System.out.print(" marks! in Chemistry");System.out.print(" out of total mark ");System.out.print(Total);
		}
	
	public static void method2() {
		System.out.println(" ");
		double Percentage = ((Physics + Biology + Chemistry)/450)*100;
		System.out.print("your overall percentage is: ");System.out.println(Percentage);
	}
	
	public static void main(String[] args) {
		method1();
		method2();
	}

}