package com.qa.strings;

public class RunnerDemo {

	public static void main(String[] args) {
		String myString = new String("message");
		String anotherString = new String("message");
		
		if ( myString == anotherString) {
			System.out.println("success");
		}
		
		if (myString.equals(anotherString)) {
			System.out.println("success");
		}
		
		System.out.println(myString.length());
		
		String thirdString = myString + " " + anotherString;
		System.out.println(thirdString);
		
		String fourthString = myString.concat(" ").concat(anotherString);    //same as above
		System.out.println(fourthString);
		
		Integer num = 10;
		String fifthString = fourthString + " " + num;
		System.out.println(fifthString);
		
		System.out.println(thirdString.toUpperCase());
		System.out.println(thirdString.toLowerCase());
		
		System.out.println(thirdString.charAt(0));
		System.out.println(thirdString.indexOf("e",2));   //4 different index, search by char, search by string, 
		
		System.out.println(thirdString.startsWith("mes"));
		
		
		System.out.println(thirdString.substring(0,3));   //partitions the string
		
		System.out.println(thirdString.replace("mes", "MES"));
		
	}

}
