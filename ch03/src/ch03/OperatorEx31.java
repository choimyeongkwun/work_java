package ch03;

public class OperatorEx31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xF;
		
		System.out.printf("hex = %x%n", hex);
		System.out.printf("%x%n",hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%x%n",hex &mask);
		
		hex = hex >> 4;
		System.out.printf("%x%n", hex &mask);
		
		hex = hex >> 4;
			System.out.printf("%x%n",hex & mask);
		
	} // main의 끝

}
