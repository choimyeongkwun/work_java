package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {
        public static void main(String[] args) {
		// TODO Auto-generated method stub
        	
        Scanner scanner = new Scanner(System.in);
		String input =scanner.nextLine();
		int a = Integer.parseInt(input);
		
		String input2 =scanner.nextLine();
		int b = Integer.parseInt(input2);

		String input3 = scanner.nextLine();
		int c = Integer.parseInt(input3);
		
		 c=a-b;
		System.out.printf("%d-%d=%d%n",a,b,c);
		
		
		String input4 = scanner.nextLine();
		int a1 = Integer.parseInt(input4);
		
		String input5 = scanner.nextLine();
		int b1 = Integer.parseInt(input5);
		
		String input6 = scanner.nextLine();
		int c1 = Integer.parseInt(input6);
		
		System.out.printf("%d - %d = %d",a1,b1,c1);
	}

}
