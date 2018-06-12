package ex04;

import java.util.Scanner;

public class Ch04Ex01_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str[] = scanner.nextLine().split(" ");
		/*
		 * char  str1 =scanner.nextLine().charAt(0);
		 */
		String grade = str[0];
		if(grade.equals("A"))
		{System.out.println("Excellecnt");
		}else if(grade.equals("B")) {
			System.out.println("Good");
		}else if (grade.equals("c")) {
			System.out.println("Usually");
		}else if (grade.equals("D")) {
			System.out.println("Effort");
		}else if (grade.equals("F"))
			{System.out.println("Failure");
		}else {
			System.out.println("error");
		}
	}
}	
		/*
		 * switch 를 사용 [방법2]
		 * 
		 * 1. 문자열 하나를 입력받는다
		 * Scanner scanner = new Scanner(System.in);
		 * String grade = scanner.nextLine();
		 * 
		 * 2. switch문을 이용하여 등급에 맞는 문자열 출력
		 * switch(grade){
		 * case "A":
		 * System.out.ptintln("Excellecnt");
		 * break;
		 * case "B":
		 * System.out.println("good");
		 * break;
		 * case "C":
		 * System.out.println("Usually");
		 * 
		 */
