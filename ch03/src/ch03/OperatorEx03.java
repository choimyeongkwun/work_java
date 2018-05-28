package ch03;

public class OperatorEx03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =5, j =5;
		String str="aaa";
		String stt="최명권";
		int i2 = 25;
		System.out.println(i ++); //변수 i 먼저 사용하기 때문에 5 출력
		System.out.println(++j);	// 1 증가하고 변수 j 사용하기 때문에 6출력
		System.out.println("i=" + i +", j = " + j+"str="+str );
		System.out.print("i=");		System.out.print(i);
		System.out.println("내이름은 ="+stt+",내 나이는 = "+ i2);
	
	}
}

