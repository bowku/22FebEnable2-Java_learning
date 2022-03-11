package com.qa.arrays;

public class ArrayExercise {
	
	
	public static void main(String[] args) {
	int[] numbers = {0,1,2,3,4,5,6,7,8,9};
	int[] finalArray = new int[10];
	
//	for (int i=0 ; i < numbers.length; i++) {
//		System.out.println(i);
//		
		
		// assign within the loop, in same loop print each
		for (int j = 0; j < finalArray.length; j++) {
			finalArray[j] = j;
			System.out.println(finalArray[j]);
			
		}
		
		System.out.println();
		
		for (int k=0; k < finalArray.length; k++) {
			finalArray[k]=finalArray[k]*10;
			System.out.println(finalArray[k]);
		}
		
	}
}



