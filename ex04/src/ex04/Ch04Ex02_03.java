package ex04;

import java.util.Scanner;

public class Ch04Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		

		while (true) {
			
			
			int num = scanner.nextInt();

			if (num > 0) {
				System.out.println("정수를 입력하세요.(0:종료);>" + num);
			
			} else if (num < 0) {
				System.out.println("정수를 입력하세요.(0:종료);>" + num);
			} 	else  {
				System.out.println("정수를 입력하세요.(0:종료);>" + num);
				break;
			} 
		}	
	}

}
