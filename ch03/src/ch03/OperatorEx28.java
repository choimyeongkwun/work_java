package ch03;

public class OperatorEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0xAB, y = 0xF;
		
		// %x = 16진수 , %#x = 0x16진수
		
		System.out.printf("x = %#X \t\t%s%n",x, toBinaryStirng(x));
		System.out.printf("y= %#X \t\t\t%s%n",y, toBinaryStirng(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x,y,x|y, toBinaryStirng(x|y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x,y, x&y, toBinaryStirng(x%y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x,y, x^y, toBinaryStirng(x^y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n ", x,y,y, x^y^y , toBinaryStirng(x^y^y));
		} // main의 끝
	
	// 10진 정수를 2진수로 변환하는 메소드
	// num 이라는 변수로 x,y 가 들어감
	static String toBinaryStirng(int num) {
		String zero = "0000000000000000000000000000000"; //32비트(32개)
				String tmp = zero + Integer.toBinaryString(num);
				/*
				 * substring(int) 메소드
				 * 관호안의 int 값에 해당하는 문자부터 문자열로 잘라낸다.
				 */
				return tmp.substring(tmp.length()-32);
		}

}
