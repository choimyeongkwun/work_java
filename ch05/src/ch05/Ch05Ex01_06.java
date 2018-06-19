package ch05;

import java.util.Scanner;

public class Ch05Ex01_06 {

	private static boolean changed;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input[] = scanner.nextLine().split(" ");
		int[] numArr = new int[input.length];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(input[i]);
			//System.out.print(numArr[i]);
		}

		/*for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크한다
			for (int j = 0; i < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true;
				}
			}
			if (!changed)
				break;
		}*/
		int min = numArr[0];	
		for(int i = 0;i<numArr.length;i++) {
			for(int j=0;j<numArr.length;j++) {
				if( numArr[i]>numArr[j]) { 
			 min = numArr[j];
			 
				}
		}
		
	}
		System.out.println(min);
}
}