package ex04;

import java.util.Scanner;

public class Ch04Ex01_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			float i = scanner.nextFloat();

			float j = scanner.nextFloat();

			if(i==0 || j==0)
				break;
			if (i >= 4.0 && j >= 4.0) {
				System.out.println("A");

			} else if (i >= 3.0 && j >= 3.0) {
				System.out.println("B");
			} else {
				System.out.println("c");
			}
			
		}

	}

}
