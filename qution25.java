package com.javaAssignment;

//W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It
//has two subclasses each having a method with the same name
//'message' that prints "This is first subclass" and "This is second
//subclass" respectively


abstract class Parent {
    abstract void message();
}

class FirstSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}

public class qution25 {
public static void main(String[] args) {
	 FirstSubclass fSubclass = new FirstSubclass();
     SecondSubclass secSubclass = new SecondSubclass();
     
     fSubclass.message();
     secSubclass.message();

}
}
