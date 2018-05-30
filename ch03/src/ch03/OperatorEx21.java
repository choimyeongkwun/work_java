package ch03;

public class OperatorEx21 {

	public static void main(String[] args) {
		// int과 float보가 작으므로 int를 float과 같은 타입으로 변경
		// 같은 타입으로 변경하여 비교한다. 10.0f == 10.0f 와같다
		System.out.printf("10 ==10.of \t %b%n",  10==10.0f);
		
		// 문자 '0'의 아스키코드값인 48과 비교  48== 0 의 결과는 false
		System.out.printf("'0'==0 \t\t%b%n",'0'== 0);
		
		// 문자 'A'의 아스키 코드값인 65와 비교 65 == 65 의 결과는 true
		System.out.printf("'A'==65 \t %b%n", 'A' == 65);
		
		// 각 문자의 아스키 코드값과 비교 65> 66의 결과는 false
		System.out.printf("'A' > 'B' \t %b%n", 'A' > 'B');
		 
		// 리터럴 타입에서 연산은  컴파일 단계에서 'A' + 1은 'B'로 치환
		// 각 문자의 아스키 코드값으로 비교 66 != 66 의결과는 false
		System.out.printf("'A' +1 !='B' \t %b%n", 'A' +1 != 'B');
		
	}

}
