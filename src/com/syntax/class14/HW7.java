package com.syntax.class14;

public class HW7 {

	char getGrade(int score) {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 50) {
			return 'D';
		} else {
			return 'F';
		}
	}

	public static void main(String[] args) {
		HW7 grade = new HW7();
		System.out.println(grade.getGrade(95));
	}
}
