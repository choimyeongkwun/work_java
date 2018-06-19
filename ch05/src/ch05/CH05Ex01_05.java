package ch05;

import java.util.Scanner;

public class CH05Ex01_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []num = {85.6,79.5,83.1,80.0,78.2,75.0};
	     
	     Scanner scanner = new Scanner(System.in);
	     String input[] = scanner.nextLine().split(" ");
	     int x= Integer.parseInt(input[0]);
	     int y= Integer.parseInt(input[1]);
	     
	    double avg = num[x-1] + num[y-1];
	    	 System.out.println(avg);
	    	
	     
	   
	}
}
