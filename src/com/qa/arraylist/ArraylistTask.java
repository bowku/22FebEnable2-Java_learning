package com.qa.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArraylistTask {
	
	public static void main(String[] args) {
	
	List<String> sandwiches = new ArrayList<>();
	
	sandwiches.add("bread sandwich");
	sandwiches.add("pop tart");
	sandwiches.add("hot dog");
//	
//	System.out.println(sandwiches);
//	
//	System.out.println(sandwiches.get(1));
//	
//	sandwiches.set(0, "ice cream taco");
//	System.out.println(sandwiches);
//	
//	System.out.println(sandwiches.size());
//	
//	
//	for (int i=0; i<sandwiches.size();i++) {
//		System.out.println(sandwiches.get(i));
//	}
//	
//	
//	
//	for (String i : sandwiches) {
//		System.out.println(i);
//	}
//	
//	sandwiches.remove(0);
	
	List<Integer> faveNums = new ArrayList<>();

    faveNums.add(10);
    faveNums.add(1355417);
    faveNums.add(63);

    Collections.sort(faveNums); //collections is static

    for (int i : faveNums) {
        System.out.println(i);
    }
    
    
    Collections.reverse(faveNums); //for sort and reverse we need to use collections, reverse can be used for both int and strings
    System.out.println(faveNums);
    
    
    System.out.println(sandwiches);
    
    Collections.swap(sandwiches, 0, 2);
    System.out.println(sandwiches);
	
    sandwiches.clear();
    System.out.println(sandwiches);
    
    Collections.sort(sandwiches,Collections.reverseOrder()); //this sort has 2 parameters, the reverseorder reverses the sort
	}
}