package ch03;

import java.util.Scanner;

public class Ch03Ex01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int x = Integer.parseInt(input);
		String input2 = scanner.nextLine();
		int y = Integer.parseInt(input2);
		
		System.out.printf("%d %d", ++x, --y);
		
		--x;
		
		System.out.printf(" %d",x*y);
		
		
		}

}
