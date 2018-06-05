package ch03;

public class Exercise3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fahrenheit = 100;
		float celcius = Float.parseFloat(String.format("%.2f",(fahrenheit-32)*5/9f));//37.78f;
		//float celcius = (int)((5/9f * (f-32))* 100 + o.5)/100f
		
		
		System.out.println("fahrenheit :" +fahrenheit);
		System.out.println("Celcius:"  +celcius);
	}

}
