package com.javaAssignment;

import java.util.Scanner;

import com.java.interfaceclass;

//W.A.J.P to check given number is Prime or not?

public class qution4 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number:");
	int num=sc.nextInt();
	
	boolean isprime=true;
	for(int i=2;i<=num;i++) {
		if (num%i==0) {
			isprime=false;
		}
	}
	if (isprime) {
		System.out.println("this is prime number:"+num);
	}
	else {
		System.out.println("this is not prime number:"+num);
	}
}
}
