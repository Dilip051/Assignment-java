package com.javaAssignment;

import java.util.Scanner;

import com.java.interfaceclass;

//W.A.J.P for create Fibonacci Series

public class qution6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int count=sc.nextInt();
	 int a=0,b=1,c=0;
	 while (c<=count) {
		a=b;
		b=c;
		c=a+b;
	}
	 System.out.println("fibonaci series is:"+c);
}
}
