package ex04;

import java.util.Scanner;

public class Ch04Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //총합을 저장할 변수
		int i = 1;	// while문을 반복할때마다 1씩 증가하는 변수
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		while(i<=num) {
			sum += i;
			i++;
		}
	System.out.println(sum);	
	}

}
