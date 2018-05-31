package ch03;

import java.util.Scanner;

public class Ch03Ex01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int x = Integer.parseInt(input);
		
		String input2 = scanner.nextLine();
		int y = Integer.parseInt(input2);
		
		boolean x1 = x !=0;
		boolean y1 = y !=0;
		
		System.out.printf("x=%d, 0 != 참 0== 거짓 :%b%n",x, x != 0 && y !=0);
		System.out.printf("y=%d, 0 != 참 0== 거짓 :%b%n", y,x!=0 || y !=0);
		
			}

}
