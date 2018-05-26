package ch02;

public class OverflowEx {
	public static void main(String [] args) {
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		System.out.println("sMin =" + sMin);
		System.out.println("sMin-1= " + (short) ( sMin-1));
		System.out.println("sMax= " + sMax);
		System.out.println("sMax+1= "+ (short)(sMax+1));
		System.out.println("cMin = "+ (int)cMin);
		System.out.println("cMin-1=" + (int)cMin--); 
		//--min : 1먼저 감소하고 사용, Min-- :Min먼저 사용후 -1 감소
		System.out.println("cMax =" + (int) cMax);
		System.out.println("cMax + 1 =" + (int)++cMax);
		
		int a= 10;
		System.out.println("a: "+a--);
		//System.out.println("a: "+a);
	} 
}
