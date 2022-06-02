package com.syntax.class10;

public class EnhancedLoopFor2DArray {

	public static void main(String[] args) {

		int[][] nums = { { 1, 2, 3, 4, 5 }, { 199, 300, 588, 700 }, { 1900, 2000 }

		};

		// enhanced for loops uses variables to access elements from an array
		// outer for loop -->iterates over 1D array
		// inner loop --> iterates over elements of each 1D array

		for (int[] num : nums) {

			for (int n : num) {
				
				System.out.println(n);
			}
		}
	}

}
