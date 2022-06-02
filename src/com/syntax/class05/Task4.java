package com.syntax.class05;

public class Task4 {

	public static void main(String[] args) {
		
		int day=1;
		
		if(day>=1 && day <=5) {
			System.out.println("It is a weekday");
		}else if(day==6 || day==7) {
			System.out.println("It is the weekend");
		}else
			System.out.println("Invalid day");

	}

}
