package ex04;

public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int sum = 0;
		
		// num을 10으로 나눈 몫이 0일 될때까지 반복
		while(num!=0) {
			//num을 10으로 나눈 나머지는 현재 num의 일의 자리 숫자이다
			//일의 자리 숫자를 sum변수에 저장
			sum += num %10; 
			
			// 현재 num을 10으로 나눈 값을 다시 num 변수에 저장
			// 일의자리에 있던 숫자가 지워진다.
			num /= 10;
		}
		System.out.println("sum="+sum);
	}

}
