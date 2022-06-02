package com.syntax.class08;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("What do you want to buy?");
		String item = input.next();
		System.out.println("How much is it?");
		double price = input.nextDouble();
		double money = 0;
		double amountLeft = 0;
		double amountExtra = 0;
		do {
			System.out.println("How much money are you paying?");
			money = input.nextDouble();
			if (money < price) {
				amountLeft = price - money;
				price = amountLeft;
				System.out.println("The amount left is " + amountLeft);
			} else {
				amountExtra = money - price;
				System.out.println("Your change returned is " + amountExtra);
			}
		} while (money - price != 0);
		System.out.println("Thank you for shopping!");
	}

}
