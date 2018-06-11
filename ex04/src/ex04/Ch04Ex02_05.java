package ex04;

import java.util.Scanner;

public class Ch04Ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int num = 0;

		for (int i = 0; true; i++) {

			String input = scanner.nextLine();
			int x = Integer.parseInt(input);

			if (x % 3 == 0) {
				System.out.println(x / 3);
			} else if (x % 3 != 0) {
				}
			if(x==-1)
				break;
		} 
	}

}
