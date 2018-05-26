package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		String input = scanner.nextLine() ;
		int kor = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		//int num2 =Integer.parseInt(input-10);
		
		
		String input2 = scanner.nextLine();
		int mat = Integer.parseInt(input2);
		
		String input3 = scanner.nextLine() ;
		int eng = Integer.parseInt(input3);
		
		int kor2=kor-10;
		int sum = kor + mat + eng;
		int avg = (sum)/3;
		
		System.out.println("kor " + kor);
		System.out.println("mat " + kor2);
		System.out.println("eng " + eng);
		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
	
		/*
		 * 1.입력받기 위해 스캐너 객체 생성, System.in은 키보드
		 * 2.scanner를 이용하서 성적 문자열로 입력받기
		 * 3.문자열로 입력받은 성적을 정수(int)형으로 변경
		 * 4. 합계와 평균 구하기
		 * 5. printf()를 이요하여 출력
		 */

	}

}
