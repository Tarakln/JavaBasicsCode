package com.syntax.class05;

import java.util.Scanner;

public class HWScore {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your quiz grade");
		double quiz = input.nextDouble();
		System.out.println("Please enter your midterm grade");
		double midterm = input.nextDouble();
		System.out.println("Please enter your final scores");
		double finalscore = input.nextDouble();

		double average = ((quiz + midterm + finalscore) / 3);

		if (average >= 90) {
			System.out.println("Grade=A");
		} else if (average >= 70 && average < 90) {
			System.out.println("Grade=B");
		} else if (average >= 50 && average < 70) {
			System.out.println("Grade=C");
		} else if (average < 50) {
			System.out.println("Grade=F");
		}
	}

}
