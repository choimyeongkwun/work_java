package ch04;

public class FlowEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// c언어 사용자를 위한 배열 선언 및 초기화 모드
		// 자세한 내용은 5장에서 설명
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		//기존 for문
		//배열변수.length = 배열의 크기
		for(int i=0;i<arr.length;i++) {
		System.out.printf("%d ", arr[i]);
	}
		System.out.println();
		
		//향상된 for문(jdk 1.5버전부터 사용가능)
		// 형태 :for(타입 변수명 : 배열 또는 컬렉션)
		// 컬렉션은? 11 장에서 설명
		for(int tmp :arr){
			System.out.printf("%d ", tmp);
			sum +=tmp;
		}
		System.out.println();
		System.out.println("sum="+sum);
	}

}
