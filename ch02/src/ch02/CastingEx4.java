package ch02;

public class CastingEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 	i = 91234567;	//8자리의 10진수
		float	f = (float)i;	//int를 float로 형변환
		int		i2= (int)f;		// float를 다시 int로 형 변환
		
		double d = (double)i;	// int를 double로 형변환
		int    i3 = (int)d;		// double 를 다시 int로 형변환
		
		float  f2 = 1.666f;
		int	   i4=(int)f2;
		
		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f i2=%d\n", f, i2);	// int와int ->float->int 비교
		System.out.printf("d=%f i3=%d\n", d, i3);	// int와int -> double -> int 비교
		System.out.printf("(int, args)%f=%d\n", f2, i4); // float과 float -> int 비교
	}

}
