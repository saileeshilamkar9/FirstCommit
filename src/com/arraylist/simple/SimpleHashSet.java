package com.arraylist.simple;

import java.util.HashSet;

public class SimpleHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a empty hash set
	     HashSet<String> h_set = new HashSet<String>();
	   // use add() method to add values in the hash set
	          h_set.add("Red");
	          h_set.add("Green");
	          h_set.add("Black");
	          h_set.add("White");
	          h_set.add("Pink");
	          h_set.add("Yellow");

	   // print the hash set
	          for(String i:h_set){
	        	  System.out.println(i);
	          }
	  

	}

}
