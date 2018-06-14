package ex04;

import java.util.Scanner;

public class Ch04Ex02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		float triangleArea = 0;

		while (true) {

			int base = Integer.parseInt(scanner.nextLine());
			int height = Integer.parseInt(scanner.nextLine());

			triangleArea = (float) (base * height) / 2f;
			System.out.println("Base=" + base);
			System.out.println("Height=" + height);
			System.out.printf("Triangle area=%.1f%n", triangleArea);

			System.out.print("Continue? ");
			char num = scanner.nextLine().charAt(0);

			/*
			 * if(num =='y' || num == 'Y') {
			 * 
			 * }else { break; }
			 */
			/*if (num != 'y' || num != 'Y') {
				System.out.println("y입력 ");
				break;
			} else {
				System.out.println("다른 문자 입력");
			}*/
			
			char ch = 'y';
			if (ch != 'y') {
				System.out.println("같지 않다.");
			}
			else {
				System.out.println("같다.");
			}
			
			String a = "y";
			if ((num != 'y') || (num != 'Y')) {
				System.out.println("같지 않다.");
			}
			else {
				System.out.println("같다.");
			}
		// eaulsIgnoreCase():괄호안의 문자열의 대소문자 구분없이
			// 변수와 값이 같다면 true,아니면false리턴

		}
	}

}
