package ch02;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 20;
		int temp = 0;
		//String str = "우도";
		System.out.println("x: " + x + " y: " + y);
		temp = x;
		x = y;
		y = temp;

		System.out.println("x: " + x + " y: " + y);
		
		
	}
	public int meta(int i){
		return 1;
	}
	
}
