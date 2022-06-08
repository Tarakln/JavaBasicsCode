package com.syntax.class12;

public class HW1 {
	
	public static void main(String[] args) {
		
		String str="I am a student!";
		if(!str.isEmpty()) {
			if(str.length()%2!=0 && str.length()>=3) {
				System.out.println(str.charAt((str.length()/2)));				
			}else {
				System.out.println("The number of characters are even");
			}
		}
	}

}
