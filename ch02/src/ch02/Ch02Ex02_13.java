package ch02;

import java.util.Scanner;

public class Ch02Ex02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);
		
		String input2 = scanner.nextLine();
		int b = Integer.parseInt(input2);
		
		String input3 = scanner.nextLine();
		int c = Integer.parseInt(input3);
		
		int sum = a + b + c;
		int avg = (sum)/3;
		
		System.out.printf("sum = %d%navg = %d",sum,avg);
	}

}
