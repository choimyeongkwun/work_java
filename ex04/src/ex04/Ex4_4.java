package ex04;

public class Ex4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int sum=0;
		int change=1;
		int count = 0;
		int i = 0;
		while(sum<=100) {
			// sum이 100이상이면 while문 탈출
			count++;
			i++;
			if(i%2!=0) { // i값이 홀수일때 change의 부호는 + >>change =1;
				change = 1;
			}else {	// i값이 짝수일떄 change 의 부호는 - >> change = -1;
				change = -1;
				}sum +=i*change; //change의 값은 부호만 나타낼뿐 그래거 i값과 곲한다
				System.out.println(sum);
		}
		System.out.println(count);//몇번쨰를 구하는 값*/
		/*
		int sum=0;
		int num=1;
		
		while(true) {
			if(num%2 !=0) {
				sum += num;
			}else {
				sum -= num;
			}
			if(sum >= 100) {
				break;
				
			}
				num++;
		}
		System.out.println(num);
		System.out.println(sum);*/
		
		//[방법2]
		int s = 1;
		int sum = 0;
		int num = 0;
		for(int i =1;true;i++,s=-s) {
			num = s* i;
			sum += num;
			if(sum>=100) {
				break;
			} 
				} System.out.println(num);
	}
	
}
