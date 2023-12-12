package com.javaAssignment;

import java.util.Scanner;

//WAP to reverse an array of integer values.

public class qution23 {
public static void main(String[] args) {
	
	int a[] = new int[5];
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the elements:");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		
	}
	System.out.println("arry elements:");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
	
	System.out.println(" reverse arry elements:");
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]+" ");
	}
}
}
