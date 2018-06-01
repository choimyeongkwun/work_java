package ch03;

import java.util.Scanner;

public class Ch03Ex03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int x = Integer.parseInt(input);
		
		String input2 = scanner.nextLine();
		int y = Integer.parseInt(input2);
		
		
		
		System.out.printf("%d%n", x/y);
		System.out.printf("x / y = %.2f", (float)x/y);
		// x/y 는 목 x%y는 나머지 
	}

}
