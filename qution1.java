package com.javaAssignment;

import java.util.Scanner;

//Take three numbers from the user and print the greatest
//number

public class qution1 {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	 System.out.print("Input the 1st number: ");
	  int num1 = input.nextInt();
	   
	  System.out.print("Input the 2nd number: ");
	  int num2 = input.nextInt();
	   
	  System.out.print("Input the 3rd number: ");
	  int num3 = input.nextInt();
	  
	  if (num1>num2&&num1>num3) {
		System.out.println("the greatest number"+num1);
	}
	  else if (num2>num1&&num2>num3) {
		System.out.println("the greatest number:"+num2);
	}
	  else {
			System.out.println("the gratest number"+num3);
	}
	   
}
}
