package com.syntax.class14;

public class MethodDemo3 {

	//create a method that takes an int value if that value is even
	//method returns true, otherwise false
	boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//write a method that takes a String and returns true if number of characters in that String
	//are even, otherwise odd is false
	boolean checkString(String name) {
		if(name.length()%2==0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		MethodDemo3 md = new MethodDemo3();
		System.out.println(md.isEven(2));
		
	}
}
