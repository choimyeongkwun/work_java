package ch03;

public class Exercise3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples = 123; //사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		//int numOfBucket = numOfApples/sizeOfBucket+1; // 모든 사과를 담는데 필요한 바구니의 수
		
		int numOfBucket = (int) Math.round((numOfApples/(double)sizeOfBucket+0.5));
		System.out.println(numOfBucket);
		
		//numOfApples/sizeOfbucket +(numOfApples % sizeOfBucket > 0? 1: 0);
	}

}
