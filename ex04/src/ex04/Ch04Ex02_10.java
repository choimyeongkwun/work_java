package ex04;

import java.util.Scanner;

public class Ch04Ex02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			
			if(num == 0) {
				break;
			}else if(num%3==0){
				count ++;
			}else if(num%5==0) {
				count ++;
			}
		} System.out.println(count); 
	} 

}
