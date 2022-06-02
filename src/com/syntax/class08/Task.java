package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		// write a program to find sum off all even and all 
		//odd numbers from 1 to 70
		
		int sumEven=0;
		for(int i=2; i<=70; i+=2) {
			sumEven=+i;
		}
		System.out.println("Sum of all even numbers are "+sumEven);
		
		int sumOdd=0;
		for(int i=1; i<=70; i+=2) {
			sumOdd=+i;
		}
		System.out.println("Sum of all odd numbers are "+sumOdd);

	}

}
