package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		String name="Tara";
		String lastName="Kalani";
		char grade='a';
		String city="Tysons";
		String state="Virginia";
		long phoneNumber=123456789l;
		
		System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in city "+city+" and state "+state);
		System.out.println("And my phone number is "+phoneNumber);
		
		city="New York";
		state="New York";
		phoneNumber=123456780l;
		grade='b';
		 System.out.println("My name is "+name+" and I moved to a new city "+city+" and a new state "+state);
		 System.out.println("My new phone number is "+phoneNumber);
		
	}

}
