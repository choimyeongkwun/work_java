package ch03;

public class OperatorEx09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1 = 1_000_000 * 1_000_000;
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		long b1 = 1_000_000L * 1_000_000L;
		
		System.out.println("a1="+a1);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("b1="+b1);
	}

}
