package com.javaAssignment;

import java.util.Scanner;

//WAP to calculate the average value of array elements.

public class qution10 {
public static void main(String[] args) {
	int size;
	System.out.println("enter the size of arry:");
	Scanner sc=new Scanner(System.in);
	size=sc.nextInt();
	
	int[] num=new int[size];
	System.out.println("enter the elements of array:");
	
	for(int i=0;i<size;i++) {
		num[i]=sc.nextInt();
		
	}
	
	int sum=0;
	for(int i=0;i<size;i++) {
		sum=sum+num[i];
	}
	System.out.println("find the sum of array:"+sum);
	  
	int ave=0;
	for(int i=0;i<size;i++);{
	   ave=sum/size;
    }
	 
	System.out.println("print average:"+ave);
	
}
}
