package com.qa.conditionals;

public class Runner {

	public static void main(String[] args) {
		
		boolean flag = false;
		
		if (flag) { System.out.println("The flag is true!");
		}
		else {
			System.out.println("the flag is false");
		}

		//switch/case is a replacement of many elif's statements like a go-to function.
		
		int num = 1;
		int num2 = 5;
		
		switch(num2) {
		case 1:
			System.out.println("number is 1");
			break;
		case 2:
			System.out.println("number is 2");
			break;
		case 3:
			System.out.println("number is 3"); //needs a break so it doesn't proceed onto another statement, because it only checks the switch statement and nothing else after
			break;
		default:
			System.out.println("number is something else");//this is the else statement
		}
		
		
	}

}
