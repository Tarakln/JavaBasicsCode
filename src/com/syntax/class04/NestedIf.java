package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = false;
		int dose = 1;

		if (vaccine) {
			System.out.println("How many doses?");

			if (dose == 1) {
				System.out.println("you need 1 more shot");
			}
		}

	}

}
