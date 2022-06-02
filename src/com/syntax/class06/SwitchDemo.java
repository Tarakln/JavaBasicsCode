package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		char choice = 'Y';
		String meaning;
		
		//variable and matching cases MUST be of same type
		//switch doesn't allow to have duplicate cases

		switch (choice) {
		case 'Y':
			meaning = "Yes";
			break;
		case 'M':
			meaning = "Maybe";
			break;
		case 'N':
			meaning = "No";
			break;
		default:
			meaning="Invalid";
		}
		System.out.println(meaning);
	}

}
