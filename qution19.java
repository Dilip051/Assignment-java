package com.javaAssignment;

import java.util.ArrayList;
import java.util.Iterator;

//WAP to iterate through all elements in an array list.


public class qution19 {
public static void main(String[] args) {
	
	ArrayList a1= new ArrayList();
	
	a1.add(10);
	a1.add("dilip");
	a1.add('d');
	System.out.println("value of list:"+a1);
	System.out.println("size is:"+a1.size());
	
	Iterator i1=a1.iterator(); 
	while(i1.hasNext()){
		System.out.println(i1.next());
	}
	
}


