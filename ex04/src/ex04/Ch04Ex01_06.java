package ex04;

import java.util.Scanner;

public class Ch04Ex01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str[]= scanner.nextLine().split(" ");
		
		String adultAndKid="";
		String sex = str[0];
		
		if(sex.equals("M")) {
			if(Integer.parseInt(str[1])>=18) {
				adultAndKid="MAN";
			}else {
				adultAndKid="BOY";
			}
		}else if(sex.equals("F")){
			if(Integer.parseInt(str[1])>=18) {
				adultAndKid="WOMAN";
			}else {
				adultAndKid="GIRL";
			}
			
		}else {
			System.out.println("ERROR");
		}
		System.out.println(adultAndKid);
		
		
	}

}
