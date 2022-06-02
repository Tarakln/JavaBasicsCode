package com.syntax.class10;

public class AllElementsFrom2DArray {
	
	public static void main(String[] args) {
		
		String [][] usa= {
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Francisco", "San Diego", "Redding" },
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"}
				
		};
		
		//outer loop iterates over rows
		//inner loops iterates over columns
		
		for(int row=0; row<usa.length; row++) {
			for(int col=0; col<usa[row].length; col++) {
				
				System.out.print( usa[row][col]+" ");
			}
			System.out.println();
		}
		
		for(String[] state: usa) {
			for(String city:state) {
				System.out.println(city);
			}
		}
	}
	
	

}
