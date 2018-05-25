package ch02;

import java.util.Scanner;

public class Ch02Ex02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a =Integer.parseInt(input);
		
		String input2 = scanner.nextLine();
		int b =Integer.parseInt(input2);
		
		int c = a + b;
				
				System.out.printf("%d + %d = %d",a,b,c);
	}

}
