package ex04;

import java.util.Scanner;

public class Ch04Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1;
		
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
