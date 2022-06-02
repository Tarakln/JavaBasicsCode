package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {

		//create an array		
		int[] b= new int[4];
		
		//store values
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		
		//access values from my array
		System.out.println(b[2]); //70
		System.out.println(b[1]+b[3]); //185
		
		//we need to create an array of all my classmates
		String[] classMates=new String[5];
		classMates[0]="Tara0";
		classMates[1]="Tara1";
		classMates[2]="Tara2";
		classMates[3]="Tara3";
		classMates[4]="Tara4";
		System.out.println(classMates[2]);


		
	}

}
