package ex04;

import java.util.Scanner;

public class Ch04Ex01_04 {
	public static void main(String [] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	String input = scanner.nextLine();
	float a = Float.parseFloat(input);
			
		if(a<=50.80){//50.80kg이하일떄 "Flyweight"표시
		System.out.println("Flyweight");
		}
		if(a>50.80&&a<=61.23)
			System.out.println("Lightweight");
		if(a>61.23&&a<=72.57)
			System.out.println("Middleweight");
		if(a>72.57&&a<=88.45)
			System.out.println("Cruiserweight");
		if(a>88.45)
			System.out.println("Heavyweight");
	}

}
