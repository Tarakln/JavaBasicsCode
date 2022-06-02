package com.syntax.class06;

import java.util.Scanner;

public class HWCountry {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your country");
		String country = input.nextLine();
		String language;
		switch (country.toLowerCase()) {
		case "usa":
			language = "English";
			break;
		case "netherlands":
			language = "Dutch";
			break;
		case "germany":
			language = "German";
			break;
		case "turkey":
			language = "Turkish";
			break;
		default:
			language = "Unknown";
		}
		System.out.println("Your language is " + language);
	}

}
