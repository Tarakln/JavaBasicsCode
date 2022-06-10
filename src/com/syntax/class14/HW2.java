package com.syntax.class14;

public class HW2 {

	void number(int x) {
		if (x % 2 == 0 || x == 0) {
			System.out.println(x + " is even");
		} else {
			System.out.println(x + " is odd");
		}
	}

	public static void main(String[] args) {

		HW2 num = new HW2();
		num.number(3);
	}

}
