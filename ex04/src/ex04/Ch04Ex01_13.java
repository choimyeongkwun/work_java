package ex04;

import java.util.Scanner;

public class Ch04Ex01_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);
		
		System.out.println("번호를 입력하세요.>"+a);
		
		if(a==1) {
			System.out.println("dog");
		}else if(a==2){
			System.out.println("cat");
		}else if(a==3) {
			System.out.println("chick");
		}else {
			System.out.println("error");
		}
	}

}
