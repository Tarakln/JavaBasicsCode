package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {

		/*
		 * checking to see if repl was completed if repl was completed we want to see:
		 * if you did 15 and more --> great job if you did more than 10 --> did good if
		 * less than 10 --> try to complete all assignments
		 */

		boolean didRepel = true;
		int hw = 25;

		if (didRepel) {
			System.out.println("How many did you do");
			if (hw > 15) {
				System.out.println("Great Job");
			} else if (hw > 10) {
				System.out.println("Good job");
			} else {
				System.out.println("try and complete");
			}
		} else {

			System.out.println("You should do HW");
		}

	}
}
