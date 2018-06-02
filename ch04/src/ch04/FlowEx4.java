package ch04;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0; //점수를 저장하기 위한 변수
		char grade = ' '; // 학점을 저장하기 위한 변수. 공백으로 초기화 한다/
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score >= 90)		// score 가 90 점 보다 같거나 크면 A학점
		{ grade = 'A';}
		else if (score >= 80)	//score 가 80점 보다 같거나 크면 b학점
		{ grade = 'B';}
		else if (score >= 70)  //score 가  70 점 보다 같거나 크면 c학점
		{ grade = 'c';}
		else { grade = 'D';}    //나머지는 d학점
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}

}
