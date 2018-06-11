package ex04;

import java.util.Scanner;

public class Ch04Ex01_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str[] = scanner.nextLine().split(" ");
		
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
