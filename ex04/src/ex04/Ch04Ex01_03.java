package ex04;

import java.util.Scanner;

public class Ch04Ex01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int x = 0;
		if(i>=20) {
			System.out.println("adult");
		}else{
			x=20-i;
			System.out.println(x+"years later");
		}
	}

}
