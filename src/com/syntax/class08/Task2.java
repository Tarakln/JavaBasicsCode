package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		int secretNum = 10;
		int guessNum = 0;

		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Guess my secret number");
			guessNum = input.nextInt();

		} while (guessNum != secretNum);

		System.out.println("You got it");

	}

}
