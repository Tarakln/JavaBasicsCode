package com.syntax.class09;

public class HW2 {
	
	public static void main(String[] args) {
		
		String[] animal= {"Dog", "Cat", "Horse", "Lion", "Tiger"};
		
		for (String x:animal) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		//another way
		
		for(int i=0; i<animal.length; i++) {
			System.out.print(animal[i]+" ");
		}
	
	
	
	
	}

}
