package ex04;

import java.util.Scanner;

public class Ch04Ex01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		int j = scanner.nextInt();
		
		/*String input = scanner.nextLine();
		int i = Integer.parseInt(input);
		
		String input2 = scanner.nextLine();
		int j = Integer.parseInt(input2);
		*/
		
		int num = (j+100)-i;
		System.out.println(num);
		if((j+100)-i>0) {
			System.out.println("Obesity");
		}
		
	}

}
