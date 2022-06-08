package com.syntax.class13;

public class Recap2 {
	
	public static void main(String[] args) {
		
		String str="Where is sameer?";
		System.out.println(str.charAt(3)); //r
		System.out.println(str.charAt(5)); //space
		System.out.println(str.indexOf("i")); //6
		System.out.println(str.indexOf("e")); //2(only the first one)
		
		System.out.println(str.indexOf("r", 5)); //starts searching from index number 5
	
		//to get all the indexes of a specific letter
		//and get specific one out of there (4th one)
		int counter = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='e') {
				counter ++;
				if(counter ==4) {
					System.out.println(i);
				}
			}
		}
	
	}

}
