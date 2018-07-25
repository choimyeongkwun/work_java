import java.util.Scanner;

public class Ch05Ex01_05 {
	public static void main(String[] args) {
		int[] classes = new int[2];
		double[] score = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		double sum = 0;
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		
		classes[0] = Integer.parseInt(inputs[0]);
		classes[1] = Integer.parseInt(inputs[1]);
		
		sum = score[classes[0]-1] + score[classes[1]-1];
		
		System.out.println(sum);
	}
}
