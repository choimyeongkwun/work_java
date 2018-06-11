package ex04;

import java.util.Scanner;

public class Ch04Ex01_08 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		float a = Float.parseFloat(input);
		
		switch((int)a){
		case 4:
		System.out.println("scholarship");
		break;
		case 3:
			System.out.println("next semester");
			break;
		case 2:
			System.out.println("seasonal semester");
			break;
		case 1: case 0 :
			System.out.println("retake");
		}
	}
}
