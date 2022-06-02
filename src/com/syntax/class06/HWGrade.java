package com.syntax.class06;

import java.util.Scanner;

public class HWGrade {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade");
		char grade = input.next().charAt(0);
		String expl;

		switch (grade) {
		case 'A':
			expl = "Excellent";
			break;
		case 'B':
			expl = "Good";
			break;
		case 'C':
			expl = "Average";
			break;
		case 'D':
			expl = "Bad";
			break;
		default:
			expl = "Not Acceptable";
		}
		System.out.println("The grade is " + expl);

	}

}
