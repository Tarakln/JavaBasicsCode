package com.syntax.class14;

public class HW4 {
	
	void language(String x) {
		if (x.equalsIgnoreCase("USA")) {
			System.out.println("Hello");
		}else if(x.equalsIgnoreCase("Spain")) {
			System.out.println("Hola");
		}else if(x.equalsIgnoreCase("France")) {
			System.out.println("Bonjour");
		}else if(x.equalsIgnoreCase("Italy")) {
			System.out.println("Salve");
		}else {
			System.out.println("Unknown country");
		}
	}
	
	public static void main(String[] args) {
		
		HW4 country=new HW4();
		country.language("France");
	}

}
