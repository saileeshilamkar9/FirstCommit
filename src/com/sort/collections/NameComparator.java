package com.sort.collections;

public class NameComparator {
	public int compare(Object o1,Object o2){  
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  
		  
		return s1.Name.compareTo(s2.Name);  
		}  
}
