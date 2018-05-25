package ch02;

import java.util.Scanner;

public class Ch02Ex02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("height=");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int height = Integer.parseInt(input);
		
		System.out.printf("Your height is %dcm",height);
		
	}

}
