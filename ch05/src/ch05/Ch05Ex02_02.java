package ch05;

import java.util.Scanner;

public class Ch05Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input []= scanner.nextLine().split(" ");
		int sum = 0;
		for(int i=0;i<5;i++) {
			int num = Integer.parseInt(input[i]);
			if(i%2==0) {
				sum += num;
			}
			
		}System.out.print(sum);
	}

}
