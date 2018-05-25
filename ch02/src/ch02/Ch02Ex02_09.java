package ch02;

import java.util.Scanner;

public class Ch02Ex02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		float a = Float.parseFloat(input);
		
		String input2 = scanner.nextLine();
		float b = Float.parseFloat(input2);
		
		String input3 = scanner.nextLine();
		double c = Double.parseDouble(input3);
		
		System.out.printf("%.3f%n%.3f%n%.3f%n",a,b,c);
	}

}
