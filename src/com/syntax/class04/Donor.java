package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {

		int age=15;
		double weight=160;
		
		if(age>=18) {
			if(weight>=110) {
				System.out.println("You are eligible to donate blood");
			}
		}else {
			System.out.println("You are not eligible to donate blood");
		}
	}

}
