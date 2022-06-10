package com.syntax.class14;

import java.util.Scanner;

public class MethodsDemo {
	
	//Method is a block of code a group of java statements that are grouped together
	//we can execute those statements by just creating an object of the class that contains
	//that method and by writing the --> object name .method name()
	
	void printHelllo() {
		System.out.println("How are you guys");
		//VOID methods don't return any values when executed
	}
	
	boolean returnTrue() {
		return true; //any method other than VOid has to have this	
	}
	
	int returnInt() {
		return 10; //if called, it will put 10 in that variable
	}
	
	//2 Types of Methods:
	//Methods that return something and Methods that don't turn something
	public static void main(String[] args) {
		MethodsDemo md=new MethodsDemo(); //creating the object
		md.printHelllo(); //calling the method
		
		//Another type of method is Scanner
		Scanner scanner=new Scanner(System.in); //creating the object
		int i=scanner.nextInt(); //this method RETURNS a value of type int
		scanner.close();
		System.out.println(i);
		
		int num=md.returnInt();
		System.out.println(num);
		System.out.println(md.returnInt()); //same as line 36
	}

}
