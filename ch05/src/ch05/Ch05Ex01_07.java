package ch05;

import java.util.Scanner;

public class Ch05Ex01_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String [] input = scanner.nextLine().split(" ");
		int num[] = new int[input.length];
		for(int i = 0;i<input.length;i++) {
			num[i] = Integer.parseInt(input[i]);
			if(num[i]<100) {
				int max = num[0];
				for(int x =0;x<input.length;x++) {
					for(int y =0;y<input.length;y++) {
						if(num[x]>num[y]) {
							 max =num[x];
							
						}
					}
				}
			}
			
		}
	System.out.println(max);
	}

}
