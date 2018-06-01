package ch03;

import java.util.Scanner;

public class Ch03Ex03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int x = Integer.parseInt(input);
		
		String input2 = scanner.nextLine();
		int y = Integer.parseInt(input2);
		
		String input3 = scanner.nextLine();
		int z = Integer.parseInt(input3);
		
		System.out.printf("avg = %.1f",(float)(x+y+z)/3);
		// 3개의 정수를 float형으로 형변환하여 계산
	}

}
