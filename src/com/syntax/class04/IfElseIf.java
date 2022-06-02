package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {

		/*
		 * declare 2 numbers and verify which one is the largest
		 */

		int num1 = 68;
		int num2 = 200;

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		
		} else if (num1 < num2) {
			System.out.println(num2 + " is larger than " + num1);

		} else {
			System.out.println(num2 + " is equal to " + num1);

		}
	}

}
