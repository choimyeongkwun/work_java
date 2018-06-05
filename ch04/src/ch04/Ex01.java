package ch04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*을 출력할 라인을 입력하시요.>");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);
		
		//행의 수만큼 반복
		for(int i = 0 ; i<a ; i++) {
			//열의 수만큼 반복
			for(int j = 0 ; j<=a ; j++) {
				//현재 찍을 곳이 빈칸이 아닌경울
				if(j >= a-i) {
				System.out.print("*");
				}
			//  그 외는 빈칸인 경우이므로 빈칸 찍기
			else{System.out.print(" ");
			}
			}
			 System.out.println();
   }
}
	}


