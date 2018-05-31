package ch03;

import java.util.Scanner;

public class Ch03Ex01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int x = Integer.parseInt(input);
		String input2 = scanner.nextLine();
		int y = Integer.parseInt(input2);
		
		System.out.printf("값이 같으면 true 아니면 false \t%b%n", x==y );
		System.out.printf("값이 같지않으면 true 같으면 false \t%b%n", x!=y );
	}

}
