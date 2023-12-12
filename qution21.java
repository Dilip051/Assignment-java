package com.javaAssignment;

import java.util.ArrayList;

//WAP to remove the third element from a array list.

public class qution21 {
public static void main(String[] args) {
	ArrayList a1= new ArrayList();
	a1.add(0, "dilip");
	a1.add(1, 25);
	a1.add(2, 'a');
	a1.add(3, 25.6f);
	
	System.out.println(" value is:"+a1);
	System.out.println("size is:"+a1.size());
	
	a1.remove(3);
	System.out.println(" value is:"+a1);
	System.out.println("size is:"+a1.size());
	
}
}
