package ch03;

public class OperatorEx30 {

	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "000000000000000000000000000000";
		String tmp = zero  + Integer.toBinaryString(x);
		return tmp .substring(tmp.length()-32);
	}
	public static void main(String[] args) {
		int dec = 8;
		
		/*
		 * 127쪽 간추려서 작성
		 * 
		 * 코드 자동 정렬볍
		 * 1. Ctrl + A 눌러 정렬할 범위 지정(전체범위)
		 * 2. Ctrl + i 눌러 지정한 범위 자동 정렬
		 */

		//비트를 오른쪽으로  0 칸 이동
		System.out.printf("%s%n", toBinaryString(dec>>0));
		//비트를 오른쪽으로 1칸 이동
		System.out.printf("%s%n", toBinaryString(dec>>1));
		//비트를 오른쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec>>2));
		
		//비트를 왼쪽으로 0칸 이동
		System.out.printf("%s%n", toBinaryString(dec<<0));
		//비트를 왼쪽으로 1칸 이동
		System.out.printf("%s%n", toBinaryString(dec<<1));
		//비트를 왼쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec<<2));

		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec>>0));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec>>1));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec>>2));
		System.out.printf("%d <<% d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec<<0));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec<<1));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec<<2));
		System.out.println();

		dec = -8;
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec>>0));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec>>1));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec>>2));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 1, toBinaryString(dec<<0));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec<<1));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec<<2));
		System.out.println();
		
		dec = 8;
		System.out.printf("%d >> %2d = %4d \t%s%n" ,dec,0,dec>>0, toBinaryString(dec>>0));
		System.out.printf("%d >> %2d = %4d \t%s%n",dec,32, dec >> 32, toBinaryString(dec>>32));
	}

}
