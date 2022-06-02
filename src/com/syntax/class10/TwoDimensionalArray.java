package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		// to create 2 D array we specify # of rows and columns = size
		int[][] numbers = new int[3][4];

		// 1st row
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[0][3] = 40;

		// 2nd row
		numbers[1][0] = 1;
		numbers[1][1] = 2;
		numbers[1][2] = 3;
		numbers[1][3] = 4;

		// 3rd row
		numbers[2][0] = 9;
		numbers[2][1] = 8;
		numbers[2][2] = 7;
		numbers[2][3] = 6;

		System.out.println(numbers[1][3]); // 4
		System.out.println(numbers[0][1]); // 20
		
		int rows=numbers.length; //only shows # of rows OR # of 1D arrays
		System.out.println("Number of rows= "+rows);
		
		int columnsOf1row=numbers[0].length;
		System.out.println(columnsOf1row); //4 rows in 1 column
		

		
		//SHORTER WAY
		int[][] num= {
				{10,20,30,40},
				{1,2,3,4},
				{9,8,7,6}
		};
		
		}
	}


