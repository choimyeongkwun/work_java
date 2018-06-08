package ex04;

public class Ex4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			int num = str.charAt(i)-'0';
			sum+=num;
		}
		System.out.println("sum="+sum);
	}

}
