package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {

		boolean job = true;
		double salary = 7500;

		if (job && salary > 1000000) {
			System.out.println("Happy");
		}

		// You can do more than 2 conditions, you can still
		// use the logical AND operator

		boolean study = true;
		boolean homework = true;
		boolean practice = true;

		if (study && homework && practice) {
			System.out.println("You will succeed");
		}else {
			System.out.println("You will struggle");
		}

	}

}
