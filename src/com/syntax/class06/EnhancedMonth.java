package com.syntax.class06;

import java.util.Scanner;

public class EnhancedMonth {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month = input.next();

		String season = null;

		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			season = "Spring";
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			season = "summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			season = "fall";
		} else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
				|| month.equalsIgnoreCase("February")) {
			season = "winter";
		}

		System.out.println("You were born in " + season);
	}

}
