package ch03;

import java.util.Scanner;

public class Ch03Ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int x = Integer.parseInt(input);
		
		String input2 = scanner.nextLine();
		int y = Integer.parseInt(input2);
		
		System.out.printf("35/10 %d...%d%n",x/y,x%y );
		
		
	}

}
