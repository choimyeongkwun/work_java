package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//두 정수를 가로로 입력받기
		String[] numbers = scanner.nextLine().split(" ");
		int x = Integer.parseInt(numbers[0]);
		int y = Integer.parseInt(numbers[1]);
		
	    /*
		String input = scanner.nextLine();
		int x = Integer.parseInt(input);
		
		String input2 = scanner.nextLine();
		int y = Integer.parseInt(input2);
	    */
		x += 5;
		
		y *= 2;
		
		System.out.printf("weidth = %d%nlength =%d%narea = %d%n",x,y, x*y);
	}

}
