package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {

		/*Ask a user where he is from
		 * based on the country we will define favorite food
		 */
		
		Scanner input=new Scanner(System.in);
		String country, food;
		System.out.println("Where are you from?");
		
		country=input.nextLine();
		
		switch (country.toLowerCase()) {
		
		case "mexico":
			food="Tacos";
			break;
		case "canada":
			food="Poutine";
			break;
		case "turkey":
			food="Lahmacun";
			break;
		case "pakistan":
			food="Pati chai";
			break;
		case "egypt":
			food="Koshary";
			break;
		case "usa":
			food="Burgers";
			break;
		default:
			food="unknown";
		}
		System.out.println("Your favorite foor is "+food);
		
	}

}
