package ch02;

import java.util.Scanner;

public class Ch02Ex02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		float yd = Float.parseFloat(input);
		
		double a = 91.44*yd;
		
		String input2 = scanner.nextLine();
		float in = Float.parseFloat(input2);
		
		double b= 2.54*in;
		System.out.printf("%4.1fyd = %5.1fcm\n" , yd ,a);
		System.out.printf("%4.1fin = %5.1fcm\n" , in ,b);
}
}