package ch02;

import java.util.Scanner;

public class WorkEx {
	public static void main(String [] args) {
		// 1. Scanner를 이용해서 2자리 정수를 입력받으세요.
		// 2. 입력받은 정수를 printf 메소드를 이용해서 10진수,8진수,16진수로 출력하세요
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input= scanner.nextLine();
		int num = Integer.parseInt(input);
		
		//int num= scanner.nextInt(); 	입력받은 문자열을 정수(int)로 받아 전달
		

		
		System.out.printf("입력받은 정수는 :%d%n",num);
		System.out.printf("%d의 8진수는%o이다%n",num,num);
		System.out.printf("%d의 16진수는%x이다%n",num,num);
		
		
		}
}

