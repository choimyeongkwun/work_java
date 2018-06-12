package ex04;

import java.util.Scanner;

public class Ch04Ex01_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int month = Integer.parseInt(input);
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 9: case 11:
			System.out.println(31);
			break;
		case 2:
			System.out.println(28);
			break;
		case 4: case 6: case 8: case 10: case 12:
			System.out.println(30);
		}
	}

}	/*
		2. if문 사용
		if(1<=month && month<=12){
		boolean isOdd = month % 2 !=0; // 홀수이면 true
		boolean is90rLess = month <=9;// 9월 이하이면 true
		boolean is0ctDec = month == 10 || month == 12;
		//10월이거나 12월이면 true
		if(isOdd && is90rLess || isOctDec){
		System.out.println(31);
		}else if (month == 2){
		System.out.println(2);
		}else {
		System.out.println(31)
 		}
 		*/
