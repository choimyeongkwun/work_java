package ex04;

import java.util.Scanner;

public class Ch04Ex02_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 정수 입력받기
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		
		// 2. 입력조건을 검사
		if(num>6) {
			System.out.println("INPUT ERROR");
			return; // 특정 값을 리턴할 경우 사용하는 키워드
			// 지금은 리턴타입이 void 이므로 특정 값을 없는 경우
			// main 메소드를 리턴하면 프로그램 종료와 같다.
		}
		// 3. 별을 역삼각형으로 찍기
		
		char alphabat ='A';
		int  count = 0;
		for(int i =0 ; i<num; i++) {
			for(int j = 0; j<num; j++) {
				int limit = num-i;
				if(j < limit) {
				System.out.print(alphabat + " ");
				alphabat++;
				}
				else {
					System.out.print(count + " ");
					count++;
				}
			}System.out.println();
		}
	}

}
