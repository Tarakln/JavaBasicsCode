package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {

		/*
		 * we are going to ask you if you got a job we will continuously ask you if you
		 * get a job until you say yes! once you say yes --> congratulations!
		 */

		Scanner input = new Scanner(System.in);
		String job;

		do {
			System.out.println("Did you get a job?");
			job = input.next();
		} while (job.equalsIgnoreCase("no"));

		System.out.println("congratulations");

	}

}
