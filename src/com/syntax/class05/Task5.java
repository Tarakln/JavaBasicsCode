package com.syntax.class05;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = inp.nextInt();

		if (num >= 1 && num <= 10) {
			System.out.println("Small number");
		} else if (num >= 11 && num <= 100) {
			System.out.println("Medium number");
		} else if (num >= 101 && num <= 1000) {
			System.out.println("Large number");
		}
	}

}
