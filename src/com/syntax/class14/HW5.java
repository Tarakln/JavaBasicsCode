package com.syntax.class14;

public class HW5 {
	
	void createEmail(String name, String lastName, String email) {
		System.out.print(name.toLowerCase()+lastName.toLowerCase()+"@"+email+".com");
	}
	public static void main(String[] args) {
		
		HW5 email=new HW5();
		email.createEmail("Tara", "Kalani", "gmail");
	}

}
