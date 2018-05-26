package ch02;

import java.util.Scanner;

public class Ch02Ex02_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("yard? ");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		float yard = Float.parseFloat(input);
		
		double a = 91.44*yard;
		
		System.out.printf("10.1yard= %.1fcm",a );
	
		
	}
}
