package ex04;

import java.util.Scanner;

public class CJ04Ex02_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.정수 한개 입력받기
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		/* 방법1
		 * //2. 틀 만들기
		for(int i =1; i <=num; i++) {
			for(int j = 1; j <=i; j ++) {
				System.out.printf("*");
			
				
			}System.out.println();
			
		}
		//3. 틀만들기 ( 감소하는 부분)
		for(int i = 1; i<num; i++) {
			for(int j = 2; j>=i; j--) {
				System.out.print("*");
			}System.out.println( );
		}*/
		
		//[방법2]
		int i = 1;
		boolean isDesc = false;
		while(i!=0) {
			for(int j = 0; j< i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if( i == num) {
				isDesc = true;
			}
			
			if(!isDesc) {
				i++;
			}else {
				i--;
			}
		}
		
	
	}

}
