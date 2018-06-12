package ex04;

import java.util.Scanner;

public class Ch04Ex02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		int count = 0;
		
		while(true) {
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			
			if(num<=100) {
				sum += num;
				count ++;
			} else {
				break;
			}
		}	
			System.out.println("sum:"+sum);
			System.out.println("avg:"+(float)sum/count);
	}

}
