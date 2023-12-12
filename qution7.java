package com.javaAssignment;

import com.java.interfaceclass;

// W.A.J.P to Print pattern Given Below.
public class qution7 {
public static void main(String[] args) {
		
//	1
//	12
//	123
//	1234
//	12345
//	
	
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(" "+j);
//		}
//		System.out.println();
//	}
	
	
//	1
//	01
//	101
//	01010
//	101010
	
//	for(int i=1;i<=5;i++) {
//		for(int j=0;j<=i;j++) {
//			if (j%2==0) {
//				System.out.print(0);
//			}
//			else {
//				System.out.println(1);
//			}
//		}
//		
//	}
	
//	   1
//	  2 2
//   3 3 3
//  4 4 4 4
	
//	for (int i = 1; i <= 4; i++) {
//        // Print spaces before the numbers
//        for (int j = i; j <= 3 ; j++) {
//            System.out.print(" ");
//        }
//
//        // Print the numbers
//        for (int k = 1; k <= i; k++) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println(); 
//    }
//	
	
	
//	
//	    *
//	  * * *
//  * * * * *
//	  * * *
//	    *
	
	for(int i=1;i<=3;i++) {
		for(int k=i;k<=3;k++) {
			System.out.print(" ");
		}
		for(int j=1; j<=i*2-1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	for(int i=2; i>=1;i--) {
		for(int k=i;k<=3;k++) {
			System.out.println("");
		}
		for(int j=i*2-1;j>=1;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}


