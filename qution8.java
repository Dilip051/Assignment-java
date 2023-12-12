package com.javaAssignment;

import java.util.Scanner;

//WAP to sum values of an array.

public class qution8 {
public static void main(String[] args) {
	int size;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array:");
	size=sc.nextInt();
	
	int[] number= new int[size];
	System.out.println("enter the elements of array:");
	for(int i=0;i<size;i++) {
		number[i]=sc.nextInt();
	}
	
	int sum=0;
	for(int i=0;i<number.length;i++) {
		sum=sum+number[i];
	
		}
	System.out.println("sum="+sum);

}
}
