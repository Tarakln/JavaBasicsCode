package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		/*declare a variable rate.
		 * If rate is more than 5 --> not buying a house
		 * 
		 */
		
		double mortgageRate=4.5;
		
		if (mortgageRate>5) {
		System.out.println("I am not buying a house");
		}
		
		//check if num1 is > than num2
		int num1=99;
		int num2=100;
		if (num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		}
		
		//check if temp is > 75 --> walk
		//if not, study Java
		int temp=65;
		if (temp>75) {
			System.out.println("I will go for a walk");
		}
		else {
			System.out.println("I am going to study Java");
		}
		
		char gender='m';
		
		if (gender=='f') {
			System.out.println("You like shopping");
			
		
			
		}else {
			System.out.println("you like watching sports");
		}
	}

}
