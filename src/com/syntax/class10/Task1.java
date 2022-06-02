package com.syntax.class10;

public class Task1 {
	public static void main(String[] args) {

		int[] numbers = { 25, 1001, 85, 10 };
		int max = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > max) {
				max = numbers[i];
			} else {
				continue;
			}
		}
		System.out.println(max);
	}
}
