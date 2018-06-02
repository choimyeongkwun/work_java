package ch03;

import java.util.Scanner;

public class Ch03Ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 두 정수를 가로로 입력받기(배열 필요)
		// 문자열 두개를 한번에 담을 수 있다.
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int x = Integer.parseInt(numbers[0]);
		int y = Integer.parseInt(numbers[1]);
		
		
		
		/*
		String input = scanner.nextLine();
		int x = Integer.parseInt(input);
		
		String input2 = scanner.nextLine();
		int y = Integer.parseInt(input2);
		
		*/
		System.out.printf("%d/%d = %d...%d%n",x,y,x/y,x%y );
		
		
		
		
		
	}

}
