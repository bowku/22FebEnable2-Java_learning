package com.qa.strings;

public class StringsExercise {

	public void methodOne(String input) {
		String word = input.strip();
		
		
		int count = 1;
		
		for ( int i=0; i<word.length(); i++) {
			if (word.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);


		
	}
	
	
//	System.out.println(str1.length());
//	
//	System.out.println();
//	
//	System.out.println(str1.substring(0,5));
//	System.out.println(str1.substring(6,11));



}

