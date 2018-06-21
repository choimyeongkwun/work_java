package ch05;

import java.util.Scanner;

public class Ch05Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input [] = scanner.nextLine().split(" ");
		int odd = 0;
		int even = 0;
		for(int i = 0;i<input.length;i++) {
			int num = Integer.parseInt(input[i]);
			if(i%2==0) {
				odd += num;
			}else {
				even += num;
			}
		}
		System.out.println("odd:"+odd);
		System.out.println("even:"+even);
	}

}
