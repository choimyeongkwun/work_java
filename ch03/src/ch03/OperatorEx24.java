package ch03;

public class OperatorEx24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		char ch = ' ';
		
		//x값이 10초과이고 20미만인지 확인
		x= 15;
		System.out.printf("x=%2d, 10< x && x < 20 = %b%n",x, 10<x&&x<20);
		
		// ||(or)는 좌변이 true 일 경우 우변을 계산하지 않고 true를 리턴한다.
		x= 6;
		System.out.printf("x=%2d, x%%2==0 || x %%3 ==0 && x %%6!=0 =%b%n",x, x%2==0||x%3==0&&x%6!=0);
		
		
		// &&(and)는 좌변이 false일 경우 우변을 계산하지 않고 false를 리턴한다
		// 여기서는 좌변이 ture이기 때문에 우변을 확인하지 않고 결과를 리턴한다.
		System.out.printf("x=%2d, (x%%2==0 || x %%3==0) && x%%6! =0 =%b%n", x, (x%2 ==0||x%3==0)&&x%6!=0);
		
		// 변수 ch가 문자 '0'이상 문자 '9' 이하인지 확인
		ch='1';
		System.out.printf("ch='%c','0' <= ch && ch <= '9' = %b%n", ch, '0' <= ch && ch <='9');
		
		// 변수 ch가 문자 'a' 이상 문자 'z' 이하인지 확인
		ch= 'a';
		System.out.printf("ch='%c', '0' <= ch && ch <= 'z' = %b%n", ch, 'a' <=ch &&ch <= 'z');
		
		// 변수 ch가 문자 'A' 이상 문자  'Z' 이하인지 확인
		ch= 'A';
		System.out.printf("ch='%c', 'A' <= ch&&ch <= 'z' =%b%n", ch, 'A' <= ch && ch <= 'z');
		
		// 변수 ch가 문자 'q' 이거나 'Q'이면 true
		ch='q';
		System.out.printf("ch='%c', ch=='q' || ch == 'Q' = %b%n", ch, ch=='q' || ch=='Q');
		
	}

}
