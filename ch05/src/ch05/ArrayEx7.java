package ch05;

public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numArr = new int[10];
		
		for(int i =0; i< numArr.length; i++) {
			numArr[i]=i; //배열을 0~9의 숫자로 초기화 한다.
			System.out.print(numArr[i]);
		} System.out.println();
		
		for (int i =0; i<100; i++) { //100번실행
			int n = (int)(Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] =numArr[n];
			numArr[n] =tmp;	 		//섞는다
		}
		for (int i = 0; i< numArr.length ; i++) {
			System.out.print(numArr[i]);
		}
	}
	

}
