package com.qa.arraylist;


import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		
		List<String> listOfStrings = new ArrayList <>();
		
		listOfStrings.add("Hello");
		listOfStrings.add("There");
		
//		listOfStrings.get(0);
		
//		System.out.println(listOfStrings.get(0));
//		
//        listOfStrings.set(0,"Hi");
//        
//        System.out.println(listOfStrings.get(0));
        
//        listOfStrings.remove(1); //changing the size of the list
//        System.out.println(listOfStrings);
//        
//        System.out.println(listOfStrings.size());
        
//        listOfStrings.clear(); //clear is stronger than remove, removes everything and also size becomes 0 
//        System.out.println(listOfStrings.size());
        
        
		for ( int i = 0 ; i <listOfStrings.size(); i++) {
        	System.out.println(listOfStrings.get(i));}
        	
        	System.out.println();
        	
        	
        	//for each string in the list of strings print it out, this doesnt stop it goes from beggining to end.
        for (String str : listOfStrings) {
        	System.out.println(str);
        }
        
        System.out.println(listOfStrings.indexOf("hi"));
        }
	}


