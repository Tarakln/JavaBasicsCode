package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*Monday and Friday --> No Class
		 * Tuesday and Wednesday -->Manual Testing
		 * Thursday --> Review
		 * Saturday and Sunday --> Java
		 */
		
		String day="Tuesday";
		
		if(day.equals("Monday") || day.equals("Friday")) {
			System.out.println("No Class");
		}else if(day.equals("Tuesday") || day.equals("Wednesday")){
			System.out.println("Manual Testing");
		}else if(day.equals("Thrsday")){
			System.out.println("Review");
		}else if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Java");
		}
		
		
		
		
		
	}


}
