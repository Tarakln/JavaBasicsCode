package com.syntax.class08;

public class ForLoopsExamples {

	public static void main(String[] args) {

		// I need to print numbers from 1 to 90
		for (int i = 1; i <= 90; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		// I need numbers from 60 to 10
		for (int a = 60; a >= 10; a--) {
			System.out.print(a + " ");
		}

		System.out.println();

		//
		for (int b = 5; b <= 40; b += 5) {
			System.out.print(b + " ");
		}

		System.out.println();

		// print even numbers from 20 to 1(2 ways)
		for (int x = 20; x >= 1; x -= 2) {
			System.out.print(x + " ");
		}

		System.out.println();

		// another way
		for (int x = 20; x >= 1; x--) {
			if (x % 2 == 0) {
				System.out.print(x + " ");
			}
		}
	}

}
