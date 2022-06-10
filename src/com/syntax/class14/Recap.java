package com.syntax.class14;

public class Recap {
	
	public static void main(String[] args) {
		
		//replace 2 words at the same time, method chaining
		String str="I never forget about recording";
		System.out.println(str.replace("never", "always").replace("I", "Asghar"));
	
		//remove
		str="dskjhaks1235HDFBH@#%^";
		System.out.println(str.replaceAll("[0-9]", ""));
	
		
		//to split a String into an array
		String str2="Batch 13 is Great. Batch 13 is Best. Batch 13 is excellent.";
		String[] arr=str2.split("[.]");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		str="We #Love# Java";
		String[] arr2=str.split("[#]");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
	}

}
