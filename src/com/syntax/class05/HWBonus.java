package com.syntax.class05;

import java.util.Scanner;

public class HWBonus {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter numbers of worked years");
		int years = input.nextInt();

		if (years >= 5) {
			System.out.println("Please enter annual salary");
			double salary = input.nextDouble();

			if (salary > 50000) {
				System.out.println("Bonus = 5000");
			} else {
				System.out.println("Bonus = 3000");
			}
		} else {
			System.out.println("You are not eligible for bonus");
		}

	}

}
