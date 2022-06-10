package com.syntax.class14;

public class HW6 {

	boolean isPrime(int x) {
		boolean isItPrime = true;
		if (x <= 1) {
			isItPrime = false;
			return isItPrime;
			
		} else {
			for (int i = 2; i <= x / 2; i++) {
				if ((x % i) == 0) {
					isItPrime = false;
					break;
				}
			}
			return isItPrime;
		}
	}

	public static void main(String[] args) {
		HW6 num = new HW6();
		System.out.println(num.isPrime(2));
	}
}
