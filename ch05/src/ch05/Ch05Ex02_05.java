package ch05;

import java.util.Scanner;

public class Ch05Ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String []input = scanner.nextLine().split(" ");
		double weight[] = new double[6];
		double sum = 0;
		int count = 0;
		for(int i =0;i<input.length;i++) {
			weight[i] = Double.parseDouble(input[i]);
			sum += weight[i];
			count ++;
		}
		double avg= sum/count;
		System.out.printf("%.1f",avg);
	}

}
