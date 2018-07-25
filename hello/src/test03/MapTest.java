package test03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapTest {
	public static void main(String[] args) {
		// key		value
		LinkedHashMap<String,String> personinfo =
				new LinkedHashMap<String,String>();
		personinfo.put("이름","홍길동");
		personinfo.put("나이","33");
		personinfo.put("주소","서울");
		
		System.out.println(personinfo);
		String age = personinfo.get("나이");
		System.out.println("personinfo의 나이 : " + age);
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		
		//al.add(new HashMap<String,String>());
		al.add(personinfo);
		System.out.println(al.add(personinfo));
		System.out.println(al);
		System.out.println(al);
	}
}
