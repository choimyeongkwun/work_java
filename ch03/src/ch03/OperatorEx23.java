package ch03;

public class OperatorEx23 {

	public static void main(String[] args) {
		// JAVA 메모리 구조 그림을 통해 확인 가능
		String str1 = "abc";
		// new 라는 언어가 나오면 heap 영역에 저장
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2 == "abc");
		
		//String 클래스에 있는 메소드 equal()
		// str.equal("abc"); = 변수의 값과 equals 괄호안의 값 비교
		// == 메모리 주소 비교
		System.out.printf("str1.equals(\"abc\") ? %b%n",str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		// equalsIgnoreCase() = 대소문자 무시하고 비교
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		
	}

}
