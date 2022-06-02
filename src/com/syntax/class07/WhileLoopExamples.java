package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {

		// print numbers from 1 to 10;
		int num = 1;
		while (num <= 10) {
			System.out.print(num + " ");
			num++;
		}

		System.out.println();

		// print numbers from 10 to 100;
		int x = 10;
		while (x <= 100) {
			System.out.print(x + " ");
			x++;
		}

		System.out.println();

		// print numbers from 10 to 1;
		int y = 10;
		while (y >= 1) {
			System.out.print(y + " ");
			y--;
		}

		System.out.println();

		// print numbers from 100 to 50;
		int a = 100;
		while (a >= 50) {
			System.out.print(a + " ");
			a--;
		}

		System.out.println();

		// print numbers from -1 to -10
		int b = -1;
		while (b >= -10) {
			System.out.print(b + " ");
			b--;
		}

		System.out.println();

		// print numbers from 1 to 20 but only even numbers
		int c = 2;
		while (c <= 20) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}c++;
		}
	}

}
