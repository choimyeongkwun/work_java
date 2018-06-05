package ch04;

public class FlowEx31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0; i<= 10; i ++) {
			if(i%3==0)
				//continue 를 실행하면 아래 문장들은 실행을 하지 않고 for문 처음으로 이동
				continue;
			System.out.println(i);
		}
	}

}
