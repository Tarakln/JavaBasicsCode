package com.syntax.class04;

public class TaskMortgage {

	public static void main(String[] args) {
		
		double rate=2.5;
		double price=1000;
		
		if (rate<4.5) {
			System.out.println("I will consider buying a house");
			if (price>5000) {
				System.out.println("I will take a loan");
		
			}else {
				System.out.println("I will pay cash");
			}
			
			
		}else {
			System.out.println("I will not buy a house");
		}
	}

}
