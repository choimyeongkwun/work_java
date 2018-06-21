package ch05;

import java.util.Scanner;

public class Ch05Ex02_01 {
	public static void main(String [] args) {
		
		//1. 정수값 입력
		Scanner scanner = new Scanner(System.in);
		String input [] = scanner.nextLine().split(" ");
		
		//2. 인덱스 9부터 출력하는 조건문 
		for(int i = 0;i<9;i++) {
			 char num = input[9-i].charAt(0);
			 System.out.print(num+" ");
			//i= 0; [9]
			 //i=1; [8]
			 //i=2; [7]
			 //i=3; [6]
			 //i=4; [5]
		}
	}
}
