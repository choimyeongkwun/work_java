import java.util.Scanner;

public class Ch05Ex01_03 {
	public static void main(String[] args) {
		char[] ch = new char[10];
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().split(" ");
		
		for (int i = 0; i < str.length; i++) {
			ch[i] = str[i].charAt(0);
			if(i == 0 || i == 3 || i == 6) {
				System.out.print(ch[i] + " ");
			}
		}
		
	}
}
