package com.syntax.class14;

public class HW1 {

	void max(int x, int y) {
		if (x > y) {
			System.out.println(x + " is larger");
		} else if (y > x) {
			System.out.println(y + " is larger");
		}
	}

	public static void main(String[] args) {

		HW1 numbers = new HW1();
		numbers.max(1, 3);

	}
}
