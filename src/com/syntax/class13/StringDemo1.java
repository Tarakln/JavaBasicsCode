package com.syntax.class13;

public class StringDemo1 {
	
	public static void main(String[] args) {
		
		String str="Batch 13 is good actually very good";
		System.out.println(str.replace("good", "great")); //you can do words
		System.out.println(str.replace("g", "G")); //you can do only characters
		
		System.out.println(str); //won't change, just a method for printing
	
	
		System.out.println(str.replaceFirst("g", "G")); //only the first word with g
		
		
	
	
	
	
	}

}
