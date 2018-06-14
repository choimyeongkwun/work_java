package ex04;

import java.util.Scanner;

public class CH04Ex02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 행과 열을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		String number[] = scanner.nextLine().split(" ");
		int row = Integer.parseInt(number[0]);
		int col = Integer.parseInt(number[1]);
		
		
		//2. 입력받은 행과 열을 이용해 틀을 만든다.
		for(int i = 1;i<=row;i++) {
			for(int j = 1; j<=col; j++) {
				System.out.print(i * j + " ");
				
			}System.out.println();
		}
	}

}
