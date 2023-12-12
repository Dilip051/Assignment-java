package com.javaAssignment;

import java.util.Scanner;

import com.java.interfaceclass;

//find factorial for Given Number.

public class qution3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number:");
	    int num =sc.nextInt();
		
		int fact=1;
		while (num>1) {
			fact=fact*num;
			num=num-1;
		}
		System.out.println("factorial:"+fact);
	}
	}
	
