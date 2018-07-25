
public class Ex04_01 {

	public static void main(String[] args) {
		int x = 15;
		char ch = 'A';
		int year = 2000;
		boolean powerOn = false;
		String str = "yes";
		
		// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		boolean one = 10 < x && x < 20;
		// 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		boolean two = ch != ' ' && ch != '\t';
		// 3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		boolean three = ch == 'x' || ch == 'X';
		// 4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		boolean four = '0' < ch && ch < '9';
		System.out.printf("%b%b%b%b", one,two,three,four);
	}

}
