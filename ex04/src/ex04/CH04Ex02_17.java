package ex04;

import java.util.Scanner;

public class CH04Ex02_17 {
public static void main(String []args) {
	Scanner scanner = new Scanner(System.in);
	int num = Integer.parseInt(scanner.nextLine());
	
	
	//숫자를 출력할 변수 선언 및 초기화
	int count = 1;
	// 틀 작성
	for(int i = 0;i<num; i++) {
		// 대각선 왼쪽: 공백 출력 0 1 2 3개
		for(int j =0; j<num; j++) {
			if(j>=i) {
			System.out.print((count % 10)+" ");
			count++;
			}else {
				System.out.print("  ");
			}
		}
		
		 System.out.println();
	
	}
}
}



