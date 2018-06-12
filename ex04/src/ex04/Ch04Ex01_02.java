package ex04;

import java.util.Scanner;

public class Ch04Ex01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		int j = scanner.nextInt();
		
		int num = (j+100)-i;
		System.out.println(num);
		if((j+100)-i>0) {
			System.out.println("Obesity");
			*/
		
	// 1. 키와 몸무게를 가로로 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int weight = Integer.parseInt(numbers[1]);
		int height = Integer.parseInt(numbers[0]);
		
		//2. 비만수치 공식을 이용해서 계산
		int obesity = weight +100 -height;
		
		//3. 비만수치 출력
		System.out.println(obesity);
		
		//4, 비만이면(비만수치가 0보다 크면0)"obesity"문자열 출력
		if(obesity>0) {
			System.out.println("obesity");
		
		
	}
		
	}

}
