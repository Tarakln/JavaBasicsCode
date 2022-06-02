package com.syntax.class10;

public class AnotherWayOf2DArray {
	public static void main(String[] args) {
		
		//create 2D array of states
		//1st array -->NY --> all cities of NY state
		//2nd array -->CA --> all cities of CA state
		//3rd array -->FL --> all cities of FL state
		//4th array -->VA -->all cities of VA state
		
		String [][] usa= {
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Francisco", "San Diego", "Redding" },
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"}
				
		};
		System.out.println(usa.length); //total of 1D arrays in array usa
		
		//I want to see how many elements inside my first array
		int elem1array=usa[0].length;
		System.out.println(elem1array);
		
		//I want to see how many elements inside my second array
		int elem2array=usa[1].length;
		System.out.println(elem2array);

		
		
	}

}
