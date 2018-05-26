package ch02;

import java.util.Scanner;

public class Ch02Ex02_11 {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		float a = Float.parseFloat(input);
		
		String input2 = scanner.nextLine();
		float b = Float.parseFloat(input2);
		
		float c = a + b;
		
		System.out.printf("%10.2f%10.2f%10.2f", a,b,c);
	}
}
