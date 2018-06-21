package ch05;

import java.util.Scanner;

public class Ch05Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 정수 입력
		Scanner scanner = new Scanner(System.in);
		String input[] = scanner.nextLine().split(" ");
		int count = 0;
		// 2. 100개를 입력받을 수 있는 배열 선언
		int num[] = new int[100];

		// 조건
		for (int i = 0; i < input.length; i++) {
			num[i] = Integer.parseInt(input[i]);
			// -1때의 i값을 정수 count값으로 저장
			if(num[i]==-1) {
				count=i;
				System.out.println("count "+count);
			}
		
		}
		
		if(count<3) {
			// 전체배열 출력
			for(int i=0;i<num.length;i++) {
				System.out.print(num[i]+" ");
			}
			System.out.println();
			
		}else {
			for(int i=count-3;i<count;i++) {
				System.out.print(num[i]+" ");
			}
			System.out.println();
		}
	}
}
