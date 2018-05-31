package ch03;

public class OperatorEx32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z ;
		int absX, absY, absZ;
		char signX, signY, signZ;

		x = 10;
		y = -5;
		z = 0;


		//(조건) ? (조건이 참일 경우 실행) : (조건이 거짓일 경우 실행)
		absX = x >= 0? x: -x; //x 값이 음수이면, 양수로 만든다, x값이 참이니까 10 이 저장
		absY = y >= 0? y: -y; // y 값이 거짓이니까 5 가 저장
		absZ = z >= 0? z: -z; // z 값이 참이니까 0 이 저장

		signX = x> 0? '+' : (x==0 ? ' ' : '-'); // 조건 연사자를 중첩
		signY = y>0 ? '+' : (y==0 ? ' ' : '-');
		signZ = z>0 ? '+' : (z==0 ? ' ' : '-');


		System.out.printf("x=%c%d%n", signX , absX);
		System.out.printf("y=%c%d%n", signY , absY);
		System.out.printf("z=%c%d%n", signZ , absZ);
	}

}
