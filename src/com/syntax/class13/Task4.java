package com.syntax.class13;

public class Task4 {
	
	public static void main(String[] args) {
		
		String str="This is sentence i want to reverse";
		String[] arr=str.split(" ");
		
		for(String s:arr){
			System.out.print(new StringBuilder(s).reverse()+" ");
		}
	}
	
	}


