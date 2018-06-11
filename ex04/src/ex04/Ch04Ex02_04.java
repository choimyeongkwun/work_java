package ex04;

import java.util.Scanner;

public class Ch04Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int num =0;
		int count = 0;
		int sum = 0;
		for(int i = 0; i<100; i++) {
			int a = scanner.nextInt();
			count ++;
			sum += a;
			if(a>=100) {
				break;
			}
			} System.out.println(sum);
			double avg = (float)sum/count;
			System.out.printf("%.1f", avg);
		}
	}


