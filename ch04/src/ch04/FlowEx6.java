package ch04;

import java.util.Scanner;

public class FlowEx6 {
	public static void main(String [] args) {
		System.out.print("현재 월을 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10 : case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		
		case 12: case 1 : case 2:
			System.out.println("현재의 계절은 겨울입니다.");
			break;
		default: // 앞에 숫자가 해당이 되지 않았을 때 적용(앞에를 제외한 모든 숫자)
			System.out.println("유효한 값을 입력하지 않았습니다");
				
		}
	}
}
