package com.javaAssignment;

import java.util.Scanner;

public class qution15 {
	public static void main(String[] args) {
		
		int a,b,c;
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		 
		a=sc.nextInt();
		b=sc.nextInt();
		try {
			c=a/b;
			System.out.println("Division is a:"+c);
			System.out.println("division successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("you are out of programe....");
		}
		
		
	}

}
