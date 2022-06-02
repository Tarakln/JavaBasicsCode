package com.syntax.class06;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1 = input.nextInt();
		System.out.println("Please enter the second number");
		int num2 = input.nextInt();
		System.out.println("Please enter the operator");
		String operator = input.next(); 
		int num3 = 0;
		switch (operator) {
		case "+":
			num3 = num1 + num2;
			break;
		case "-":
			num3 = num1 - num2;
			break;
		case "*":
			num3 = num1 * num2;
			break;
		case "/":
			num3 = num1 / num2;
			break;
		default:
			System.out.println("The operator is invalid");
		}
		System.out.println(num3);
	}

}
