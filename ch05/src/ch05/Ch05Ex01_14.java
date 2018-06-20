package ch05;

import java.util.Scanner;

public class Ch05Ex01_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 입력받아 저장할 배열 2개 생성
		int[][] a1 = new int[2][4];
		int[][] a2 = new int[2][4];
		
		System.out.println("first array");
		for(int j=0;j<a1.length;j++) {
			//2. 정수 입력받기
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			//3. 입력받은 정수를  a? 배열에 저장하기
			for(int i =0; i<numbers.length;i++) {
				a1[j][i] = Integer.parseInt(numbers[i]);
			}
		}
		System.out.println("second array");
		for(int j=0;j<a2.length;j++) {
			//2. 정수 입력받기
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			//3. 입력받은 정수를  a? 배열에 저장하기
			for(int i =0; i<numbers.length;i++) {
				a2[j][i] = Integer.parseInt(numbers[i]);
			}
		}
		
		//4. 출력하기
		for(int i =0; i<a1.length;i++) {//a1의 길이는 행의 길이로 2임
			for(int j=0;j<a1[i].length;j++) {//i가 0일때 a1[0]의 열의 길이로 4가 된다/
				System.out.print(a1[i][j]*a2[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
