package ch03;

import java.util.Scanner;

public class Ch03Ex01_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int x = Integer.parseInt(input);
		String input2 = scanner.nextLine();
		int y = Integer.parseInt(input2);
		
		System.out.printf("4>5\t%b%n", x>y);
		System.out.printf("4<5\t%b%n", x<y);
		System.out.printf("4>=5\t%b%n", x>=y);
		System.out.printf("4<=5\t%b%n", x<=y);
		
				
	}

}
