package ex04;

import java.util.Scanner;

public class Ch04Ex01_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		int result = 0;
		
		result = Math.abs(i-j);
		//번외: 메소드 이용해서 구하는 방법
		//Math.abs(): 절대값 리턴하는 메소드
		System.out.println(result);
		
	}

}		/* 1.두 정수를 입력받기
		 Scanner scanner = new Scanner(System.in);
		 String input[] = scanner.nextLine().split(" ");
		 int num1 = Integer.parseInt(input[0]);
		 int num2 = Integer.parseIne(input[1]);
		 
		 2. 큰수에서 작은 수를 뺴기
		 if(num1>num2){
		 System.out.println(num1-num2);
		 }else
		 System.out.println(num2-num1);
		*/
