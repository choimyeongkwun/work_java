package ch05;

import java.util.Scanner;

public class Ch05Ex01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String []input = scanner.nextLine().split(" ");
		int [] num = new int[input.length];
		
		int count = 0;
		
		for(int i=3;i>=0&&i<input.length;i--) {
			
			num[i] = Integer.parseInt(input[i]);
		System.out.printf(" %d" ,num[i]);
			
		}
		}
	
}
 /*int[] numbers = new int[100];
 for(int i=0; i<numbers.length;i++) {
	 1. 한줄에 하나씩 입력받기
	 Scanner scanner = new Scanner(System.in);
	 String num= scanner.nextLine();
	 2. 정수 0을 입력받으면 반복 종료
	 if(Integer.parseInt(num)==0) {
		 break;
	 }
	 3.입력받은 정수를 배열에 저장
	 numbers[i] = Integer.parseInt(num);
	 2. 정수 0을 입력받으면 반복 종료
	 if(Integer.parseInt(num)==0) {
		 break;
	 5 나중에 입력된 정수부터 차례대로 출력
	 for(int i - numbers.length-1;i>=0;i--) {
		 System.out.print(numbers[i+" "]);
	 }
 }*/
