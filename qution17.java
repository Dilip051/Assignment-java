package com.javaAssignment;

import java.util.Iterator;

import com.java.interfaceclass;
import com.java.threadtest;

//WAP to create one thread by implementing Runnable interface in Class.



class run implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("My name is dilip"+i);
		}
		
	}
	
}
public class qution17 {
	public static void main(String[] args) {
		
		run rn=new run();
		Thread th = new Thread(rn);
		th.start();
		
		for(int i=0;i<=4;i++) {
			System.out.println("this is thread 2"+i);
		}
	}

}
