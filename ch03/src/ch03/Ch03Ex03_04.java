package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		float x = scanner.nextFloat();
			
		float y = scanner.nextFloat();
				
		float z = scanner.nextFloat();
		//String input = scanner.nextLine();
		//int x = Integer.parseInt(input):
		//String input2 = scanner.nextLine();
		//int y = Integer.parseInt(input2):
		//String input3 = scanner.nextLine();
		//int z = Integer.parseInt(input3):
		
		System.out.printf("sum =%d%n",(int)x + (int)y + (int)z);
		System.out.printf("avg =%d",(int)(x + y + z)/3);
	
	}

}
