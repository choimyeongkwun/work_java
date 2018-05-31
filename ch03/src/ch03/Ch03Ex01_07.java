package ch03;

import java.util.Scanner;

public class Ch03Ex01_07 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int x = Integer.parseInt(input);
		
		String input2 = scanner.nextLine();
		int y = Integer.parseInt(input2);
		
		String input3 = scanner.nextLine();
		int z = Integer.parseInt(input3);
		
		System.out.printf("x>y and z \t%b%n", x > y == x > z );
		System.out.printf("x=y \t%b%n", x == y && x == z && y == z );
	}
}
