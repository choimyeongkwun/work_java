package ex04;

public class Ex4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*[방법1]
		int total = 0;
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				total+=j;
				
			}
		} System.out.println(total);
		*/
		 //[방법2]
		int sum=0; //(광호 안의 부분 합)
		int totalSum=0; //총합
		
		int count = 0;
		for(int i =1;i<=10;i++) {
			sum+=i;
			totalSum +=sum;
			count ++; //반복문을 몇번 수행했는지 체크
					
		}
		System.out.println(totalSum);
		System.out.println(count);
	}

}
