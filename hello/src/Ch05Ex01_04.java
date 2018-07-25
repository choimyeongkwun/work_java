import java.util.Scanner;

public class Ch05Ex01_04 {
	public static void main(String[] args) {
		int[] numbers = new int[2];
		
		int i = 0;
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			
			if (i == numbers.length) {
				int[] tmp = new int[numbers.length * 2];
				System.arraycopy(numbers, 0, tmp, 0, numbers.length);
				numbers = tmp;
			}
			
			numbers[i] = Integer.parseInt(input);
			
			if(numbers[i] == 0) {
				break;
			}
			
			i++;
		}
		
		for (i = numbers.length-1; i >= 0; i--) {
			if(numbers[i] != 0) {
			System.out.print(numbers[i]+ " ");
			}
		}
		
		
	}
}
