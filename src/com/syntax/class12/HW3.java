package com.syntax.class12;
import java.util.Scanner;
public class HW3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Mom's first name?");
		String mom = input.next();
		System.out.println("Dad's first name?");
		String dad = input.next();
		System.out.println("Boy or Girl?");
		String gender = input.next();
		String suggestedName1 = null;
		String suggestedName2 = null;

		if (gender.equalsIgnoreCase("boy")) {
			suggestedName1 = dad.substring(0, dad.length()/2);
			suggestedName2 = mom.substring(mom.length()/2);
		} else if (gender.equalsIgnoreCase("girl")) {
			suggestedName1 = mom.substring(0, mom.length());
			suggestedName2 = dad.substring(dad.length()/2);
		}
		System.out.println(suggestedName1.trim() + suggestedName2.trim());
		input.close();
	}
}
