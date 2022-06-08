package com.syntax.class12;

public class StringDemo3 {
	
	public static void main(String[] args) {
		
		String str=" Batch 13 is Great";
		System.out.println(str.startsWith("Frozen"));
		System.out.println(str.endsWith("t"));
		System.out.println(str.endsWith("Great"));
		System.out.println(str.toLowerCase().endsWith("great")); //METHOD CHAINING!
		
		String name="HAMID";
		System.out.println(name.toLowerCase());  //the values of string variables cannot change by calling a method
		System.out.println(name);
		
		String query="13";
		System.out.println(str.contains(query));
		System.out.println(str.contains("is"));
		System.out.println(str.toLowerCase().contains("batch"));
	}

}
