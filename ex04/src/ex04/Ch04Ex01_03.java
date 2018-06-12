package ex04;

import java.util.Scanner;

public class Ch04Ex01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int i =Integer.parseInt(scanner.nextLine());
		
		
		// 20살 이상이면 "adult" 출력
		if(i>=20) {
			System.out.println("adult");
		}else{//3. 그렇지 않으면 몇년뒤 성인위 되는지 출력
		int	x=20-i;
			System.out.println(x+"years later");
		}
	}

}
