package com.javaAssignment;

import java.util.Scanner;

import com.java.interfaceclass;

//WAP to Copy one array into another

public class qution22 {
public static void main(String[] args) {
	
	int a[]=new int [5];
	int b[]=new int [5];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value in first array:");
	for(int i=0;i<5;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("first arry elements");
	for(int i=0;i<5;i++) {
		System.out.println(a[i]+" ");
		}
	System.out.println("\n second arry elements");
	for(int i=0;i<5;i++) {
		b[i]=a[i];
		System.out.println(b[i]+" ");
        }
}
}
