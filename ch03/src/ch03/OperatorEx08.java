package ch03;

public class OperatorEx08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000;	//1,000,000 1백만
		int b = 2_000_000;	//2,000,000 2백만
		
		// 대입연산자(=)는 오른쪽부터 계산한 다음 왼쪽으로 대입한다
		// int a, int b 곱한 결과는 int 타입이다
		// 곱한 결과가 int 범위를 초과하므로 오버플로우가 일어나 -145475993으로 계산
		
		long c = a * b;	//a * b = 2,000,000,000,000 ? NO
		
		System.out.println(c);
		
		long a1 = 1_000_000;
		long b1 = 2_000_000;
		
		long c1 = a1 * b1;
		
		System.out.println(c1);
	}
}
