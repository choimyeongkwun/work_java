package ex04;

import java.util.Scanner;

public class CH04Ex02_17 {
public static void main(String []args) {
	Scanner scanner = new Scanner(System.in);
	int num = Integer.parseInt(scanner.nextLine());
	
	int count = 1;
	for(int i = 1 ; i<=num; i++) {
		// 대각선 왼쪽: 공백 출력 0 1 2 3개
		for(int j =0; j<i-1; j++) {
			System.out.print("*");
			} 
		 for(int i =1; i<num; i++){
			 for(int j =1; j<num-1; j++) {
				 System.out.print(count);
			count++;
			}
		 }
		 System.out.println();
	
	}
}
}



