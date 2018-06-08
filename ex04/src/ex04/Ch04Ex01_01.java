package ex04;

import java.util.Scanner;

public class Ch04Ex01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int i = Integer.parseInt(input);
		
		String input2 = scanner.nextLine();
		int j = Integer.parseInt(input2); 
		System.out.println(i); // 입력된 i의 값을 출력
		
		 //j의 값을 입력
		if(i<0) {//i가 음수이면 "minus'를 출력
			System.out.println("minus");
			
		} 
		System.out.println(j); //j의 값을 출력
	}

}
