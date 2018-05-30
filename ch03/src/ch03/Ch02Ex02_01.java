package ch03;

import java.util.Scanner;

public class Ch02Ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System. in);
		String input = scanner.nextLine() ;
		int a = Integer.parseInt(input);
		
		int b = a - 10;
		int c = a + 10;
		int d = a+b+c;
		int e = d/3;
	     
		
		System.out.printf("kor %d%n mat %d%n eng %d%n sum %d%n avg %d%n", a,b,c,d,e);
		
		
		
		
	}

}
