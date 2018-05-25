package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);
		
		//float input2 = Float.parseFloat(scanner.nextLine());
		
		String input2 = scanner.nextLine();
		float b = Float.parseFloat(input2);
		
		float c = a * b;
		System.out.printf("추의무게%d * 중력의비율%f = %f", a,b,c);
	}

}
