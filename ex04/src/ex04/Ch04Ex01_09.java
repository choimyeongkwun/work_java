package ex04;

import java.util.Scanner;

public class Ch04Ex01_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int i = 0;
		
		i = a>b?b:a;
		i = i>c?c:i;
		System.out.println(i);
		
	}

}

