package ch03;

public class OperatorEx07 {
	public static void main(String[] args) {
		byte a =10;
		byte b = 30;
		byte c =(byte)(a * b);
		
		System.out.println(c);
		
		int a1 = 10;
		int b1 = 30;
		int c1 = a1 * b1;
		
		System.out.println(c1);
		
		/* 
		 * 예제 6번과 같은 이야기
		 * 곱셈도 마찬가지로 자바에서 정수의 기본형인 int형으로 병경 후
		 * 곱셈을 수행한다
		 * 결론은 별일 없으면 int를 사용해라
		 */
		}
}
