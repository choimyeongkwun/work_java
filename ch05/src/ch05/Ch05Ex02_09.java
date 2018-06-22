package ch05;

import java.util.Scanner;

public class Ch05Ex02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[100];
		Scanner scanner = new Scanner(System.in);
		int inputNum=0;
		int count =0;
		
		while(true) {
			inputNum = Integer.parseInt(scanner.nextLine());
			if(inputNum==0) {
				break;
			}else {
				num[count]=inputNum;
				count++;
			}
		}
	}

}
