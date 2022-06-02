package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {

		// break: stops the block of code

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			if (i == 3) {
				break;
			}
		}

		boolean summer = true;
		while (summer) {
			System.out.println("It is hot");
			break;
		}

	}
}
