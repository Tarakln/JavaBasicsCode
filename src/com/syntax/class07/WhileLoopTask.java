package com.syntax.class07;

public class WhileLoopTask {

	public static void main(String[] args) {

		// print odd numbers from 100 to 1;

		int x = 100;
		while (x >= 1) {
			if (x % 2 != 0) {
				System.out.print(x + " ");
			}
			x--;
			
			
		}
	}
}
