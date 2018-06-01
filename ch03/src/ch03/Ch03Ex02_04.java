package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int 민수의키 = Integer.parseInt(input);
		
		String input2 = scanner.nextLine();
		int 민수의몸무게 = Integer.parseInt(input2);
		
		String input3 = scanner.nextLine();
		int 기영이의키 = Integer.parseInt(input3);
		
		String input4 = scanner.nextLine();
		int 기영이의몸무게 = Integer.parseInt(input4);
		
		System.out.printf("%b%n", 민수의키 > 기영이의키 && 민수의몸무게 > 기영이의몸무게);
	}

}
