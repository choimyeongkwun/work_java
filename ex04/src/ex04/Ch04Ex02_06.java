package ex04;

import java.util.Scanner;

public class Ch04Ex02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.Korea");
		System.out.println("2.USA");
		System.out.println("3.Japan");
		System.out.println("4.China");
		System.out.println("number?");
		
		    for(int i =0; true; i++) {
			String input = scanner.nextLine();
			int x = Integer.parseInt(input);
			if(x==1) {
				System.out.println("seoul");
				
			}else if(x==2) {
				System.out.println("Washington");
				
			}else if(x==3) {
				System.out.println("Tokyo");
			
			}else if(x==4) {
				System.out.println("Beijing");
				
			}else {
				System.out.println("none");
				break;
			}
			
		} 
	}

}
