package ch04;

import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력해주세요.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); //화면을 통해 입력받은 점수를 score에 저장
		
		System.out.printf("당신의 점수는 %d 입니다.%n", score);
		
		if (score >= 90) {grade='A'; // score가 90점보다 같거나 크면 A학점(grade)
		if(score >= 98) { opt ='+';} //90점 이상 중이도 98점 이상은 A+
		else if (score < 94) //점 이하는 A-) 
		{opt = '-';}
		} else if (score>=80 ) //score가 80점 보다 같거나 크면 B학점 (grade)
		{grade = 'B'; 
		if(score >= 88) {opt = '+';} //80점 이상 중에도 88이상은 B+
		else if (score < 84) {opt = '-';} //84점 이하는 B-
		} else { grade = 'c';//나머지는 C학점
		}
		
		System.out.printf("당신의 학점은 %c%c입니다.%n",grade,opt);
	}

}
