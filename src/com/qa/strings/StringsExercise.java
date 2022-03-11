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
	
	public void methodTwo(String vertical) {
		int j = 0;
		for(int i = 0 ; i<vertical.length();i++) {
		if (vertical.charAt(i)==' '){j=vertical.indexOf(" ");}
		}
			System.out.println(vertical.substring(0,j));
	}




}

