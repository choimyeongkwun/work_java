package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		String input = scanner.nextLine() ;
		int kor = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		//int num2 =Integer.parseInt(input-10);
		int kor2=kor-10;
		
		String input3 = scanner.nextLine();
		int mat = Integer.parseInt(input3);
		
		String input2 = scanner.nextLine() ;
		int eng = Integer.parseInt(input2);
		
		System.out.println("kor " + kor);
		System.out.println("mat " + kor2);
		System.out.println("eng " + eng);
		
		int sum = kor + mat + eng;
		System.out.println("sum " + sum);
		
		int avg = (sum)/3;
		System.out.println("avg " + avg);
	

	}

}
