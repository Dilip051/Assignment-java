package com.javaAssignment;

import java.util.Scanner;

//W.A.J.P to check given number is Armstrong or not?


public class qution5 {
public static void main(String[] args) {
	  int c=0,a,temp;
      int n;
      System.out.println("Enter the number:"
      		+ "");
      Scanner scanner=new Scanner(System.in);
      n=scanner.nextInt();
      temp=n;
      while(n>0)
      {
          a=n%10;
          n=n/10;
          c=c+(a*a*a);
      }
      if(temp==c)
          System.out.println("this number is armstrong number");
      else
          System.out.println("this number is not armstrong number");
  }

}


