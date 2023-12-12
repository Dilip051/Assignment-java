package com.javaAssignment;

import java.util.Scanner;



//WAP to find the index of an array element.

public class qution11 {
public static void main(String[] args) {
	 
	Scanner s= new Scanner(System.in);
	int size=s.nextInt();
	int numbers[] = new int[size];
	
	
	for(int i=0;i<size;i++) {
		numbers[i]=s.nextInt();
	}
	int x=s.nextInt();
	
	for(int i=0;i<numbers.length;i++) {
		if(numbers[i]==x) {
			System.out.println("x found at index:"+i);
		}
	}
}
}
