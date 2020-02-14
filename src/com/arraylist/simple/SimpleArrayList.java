package com.arraylist.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> list_strings = new ArrayList<String>();
       System.out.println(list_strings.size());
       list_strings.add("Red");
       list_strings.add("Green");
       list_strings.add("Blue");
       list_strings.add("Yellow");
       //System.out.println(list_strings);
       
       
       //for(String i:list_strings){
    	   list_strings.add(0,"Pink");
    	   list_strings.remove(3);
    	   System.out.println(list_strings);
    		
    	   
      // }
       
	}

}
