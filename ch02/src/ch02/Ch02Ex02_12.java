package ch02;

import java.util.Scanner;

public class Ch02Ex02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		float a =Float.parseFloat(input);
		
		String input2 = scanner.nextLine();
		float b =Float.parseFloat(input2);
		
		float c = b * a;
		
		System.out.printf("%.2f * %.0f = %.0f",b,a,c);		
	}

}
