package com.syntax.class08;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers, start and end");
		int i = input.nextInt();
		int j = input.nextInt();

		int sumEven = 0;
		int sumOdd = 0;
		for (int a = i; a <= j; a++) {
			if (a % 2 == 0) {
				sumEven = sumEven + a;
			} else {
				sumOdd = sumOdd + a;
			}
		}
		System.out.println("Sum of Even numbers are " + sumEven);
		System.out.println("Sum of Odd numbers are " + sumOdd);

	}

}
