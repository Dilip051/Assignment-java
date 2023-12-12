package com.javaAssignment;

//WAP to create one thread by extending Thread class in another Class

class first extends Thread{
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("this is rajputana");
		}
	}
}

public class qution18 {
public static void main(String[] args) {
	first fc= new first();
	fc.start();
	for(int i=0;i<=4;i++) {
		System.out.println("my name is dilip");
	}
}
}
