package ch06;

public class PerseonTest {

	public static void main(String[] args) {
		// 1.사람 3명(객체 3개) 만들기
		Person [] p = new Person[3];
		
		/*Person p = new Person();
		Person p1 = new Person();
		Person p2 = new Person();*/
		// 2.각 사람(객체)마다 이름,나이,주소를 설정하세요
		//(자기 자신 포함해서 옆사람 정보 작성하기)
		for(int i =0;i<p.length;i++) {
			p[i] = new Person();
		}
		p[0].name = "최명권";
		p[1].name = "이우도";
		p[2].name = "조치헌";
		p[0].age = 25;
		p[1].age = 26;
		p[2].age =23;
		p[0].adress ="광명";
		p[1].adress = "가산";
		p[2].adress = "신림";
		
		for(int i=0;i<p.length;i++) {
		p[i].selfIntroduce();
		}
		// 3.Person클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		
		
		/*p.selfIntroduce();
		p1.selfIntroduce();
		p2.selfIntroduce();*/
	}

	}


