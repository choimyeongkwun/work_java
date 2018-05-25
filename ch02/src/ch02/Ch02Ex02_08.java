package ch02;

import java.util.Scanner;

public class Ch02Ex02_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		float a =Float.parseFloat(input);
		
		String input2 = scanner.nextLine();
		float b =Float.parseFloat(input2);
		
		String input3 = scanner.nextLine();
		
		System.out.printf("%.2f%n%.2f%n%s",a,b,input3);
	}

}
