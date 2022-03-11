package com.qa.strings;

public class Runner {

	public static void main(String[] args) {
		String rain = new String("yesterday it was raining");
		String sunny = new String("today it is sunny");
		
		System.out.println(rain.toUpperCase() + ", " + sunny.toUpperCase());
		
		System.out.println();
		
		sunny.substring(0, 10);
//		System.out.println(rain.indexOf("rain"));
		rain.substring(17,23);
		System.out.println(sunny.toUpperCase().substring(0,11) + " " +rain.toUpperCase().substring(17,24));
		
		//length(), substring(), equals()
		
		StringsExercise s = new StringsExercise();
		s.methodOne("Hello world A");
	}

}


