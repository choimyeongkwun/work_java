import java.util.Scanner;

public class Ch05Ex01_01 {
	public static void main(String[] args) {
		char[] alphabet = new char[10];
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().split(" ");
		
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = str[i].charAt(0); 
		}
		
		System.out.println(alphabet);
		
		
		
	}
}
