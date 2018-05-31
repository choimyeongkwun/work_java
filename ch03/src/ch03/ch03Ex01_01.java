package ch03;

import java.util.Scanner;

public class ch03Ex01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int a = Integer.parseInt(input);
        
        String input2 = scanner.nextLine();
        int b = Integer.parseInt(input2);
        
        int a2 = a +100;
        
        System.out.printf("a = %d%n", a2);
        System.out.printf("b = %d%n", b%10);
        
		
	}

}
