package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		double x = Double.parseDouble(input);
		
		String input2 = scanner.nextLine();
		double y = Double.parseDouble(input2);
		
		
		
		System.out.printf("x * y = %d%n ",(int)(x * y));
		// 두 실수의 곱을 정수 int형으로 바꿔 계산
		int z= (int)x * (int)y;
		System.out.printf("x * y = %d%n", z );
		// 두 실수를 각각 정수로 형변환하여 계산
		
	}

}
