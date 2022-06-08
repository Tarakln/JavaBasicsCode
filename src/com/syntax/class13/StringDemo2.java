package com.syntax.class13;

public class StringDemo2 {
	
	public static void main(String[] args) {
		
		String str="sdkjhdDJHBD134536jndc^&**^$";
				
		System.out.println(str.replaceAll("[0-9]", "#"));
		System.out.println(str.replaceAll("[a-z]", "#"));
		System.out.println(str.replaceAll("[A-Z]", "#"));

		System.out.println(str.replaceAll("[A-Za-z]", "#"));
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));


		System.out.println(str.replaceAll("[^a-z]", "#")); //everything else will be replaced so you only see lowercase
		System.out.println(str.replaceAll("[^A-Z]", "*"));
		System.out.println(str.replaceAll("[^A-Za-z0-9]","_"));
		
		
		System.out.println(str.replaceAll("[^A-Za-z0-9]","")); //remove if replace with ""
		
		System.out.println(str.replaceAll("[^A-z]", "+"));

	}

}
