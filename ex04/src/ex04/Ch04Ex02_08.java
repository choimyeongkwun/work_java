package ex04;

import java.util.Scanner;

public class Ch04Ex02_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int odd=0;
		int even=0;
		while (true) {
			int num= scanner.nextInt();

			if (num == 0) {
				break;
			} else if (num % 2 == 0) {
				even ++;
			} else {
				odd ++;
			}
				
		}
		System.out.println("odd:"+odd);
		System.out.println("even:"+even);
	}

}
