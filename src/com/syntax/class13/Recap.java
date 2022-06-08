package com.syntax.class13;

public class Recap {

	public static void main(String[] args) {
		
		String str="Batch 13 is great but I say this to every batch.";
		System.out.println(str.length());
		//length counts the spaces as well. Anything inside the "" will be counted
		str.length(); //no outcome
		
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str);
		
		//to reassign:
		str=str.toUpperCase();
		System.out.println(str);
		
		//to see if it's empty or not
		str="";
		System.out.println(str.isEmpty());
	
		//to get rid of spaces at the beginning and end
		String str2=" Tara     ";
		System.out.println(str2.trim());
		
		str="Batch 13 is great but I say this to every batch.";
		System.out.println(str.contains("z"));
		System.out.println(str.startsWith("Batch"));
		System.out.println(str.endsWith("ing"));

	}
}
