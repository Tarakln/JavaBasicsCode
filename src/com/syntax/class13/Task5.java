package com.syntax.class13;

import java.util.Scanner;

public class Task5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = input.nextLine();
	    
	    boolean pal=false;

	    String newString=givenString.replaceAll(" ","");
	    newString=newString.toLowerCase();
	    String backWards="";
	    for(int i=newString.length()-1; i>=0; i--){
	      backWards+=newString.charAt(i);
	      
	    }
	    if(newString.equals(backWards)){
	      pal=true;
	    }else{
	      pal=false;
	    }
	   System.out.println(pal);
	   
	   input.close();
	}

}
