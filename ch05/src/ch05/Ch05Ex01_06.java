package ch05;

import java.util.Scanner;

public class Ch05Ex01_06 {

	private static boolean changed;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input[] = scanner.nextLine().split(" ");
		int[] numArr = new int[input.length];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(input[i]);
			//System.out.print(numArr[i]);
		}

		/*for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크한다
			for (int j = 0; i < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true;
				}
			}
			if (!changed)
				break;
		}*/
		int min = numArr[0];	
		for(int i = 0;i<numArr.length;i++) {
			for(int j=0;j<numArr.length;j++) {
				if( numArr[i]>numArr[j]) { 
			 min = numArr[j];
			 
				}
		}
		
	}
	
		System.out.println(min);
	}
}
/*
 * 1.10개의 정수를 입력받기 Scanner scanner = new Scanner(System.in); String[] numbers =
 * scanner.nextLine().split
 * 
 * 1-1 전체 배열을 검사해서 1000이상의 정수가 발견되면 프로그램 종료 for(int i =0;i<numbser.length;i++){
 * int num = Integer.parseInt(numbers[i])
 * 
 * // 만약 1000이상의 정수가 발견되면 if(num >= 100){ /main 메소드를 return 시켜 프로그램 종료 return;
 * 
 * 1-2 배열의 개수가 10개가 아니면 프로그램 종료 if(numbers.length != 10){ return; } 2.가장 작은수를
 * 저장하는 변수 생성{초기값은 배열의 첫번째 값} int min = Integer.parseInt(numbers[0]); 2.
 * numbers배열에서 문자열 하나씩 끄집어내기 for(int i = 0;numbers.length-1;i++) { int
 * num01=Integer.parseInt(numbers[i]);
 * 
 * 
 * min = min<numn01? min:num02; } 4. 가장 작은 수는 min변수에 담기게 되므로
 * System.out.println(min); }
 */