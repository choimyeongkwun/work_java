package test03;

import java.util.ArrayList;

public class Exec {

		public static void main(String[] args) {
			/*Person p1 = new Person();
			p1.setName("박경훈");
			p1.setAge(1);
			p1.setPoint(2);
			System.out.println(p1.getName()+","+p1.getAge()+","+p1.getPoint()); 
			System.out.println(p1);*/
			
			ArrayList<Person> pList = new ArrayList<Person>();
			for(int i =0;i<5;i++) {
				String name = "테스트"+(i+1);
				int age = (i+1)*10;
				Person p = new Person();
				p.setName(name);
				p.setAge(age);
				pList.add(p);
			}
			for(int i = 0;i<5;i++) {
				Person p = pList.get(i);
				System.out.println(p.getName()+","+p.getAge());
			}
			/*for(int i = 0;i<5;i++) {
				Person pi = new Person();
				if(i==0) {
					pi.setName("test1");
					pi.setAge(10);
					pi.setPoint(23);
				}else if(i==1) {
					pi.setName("test2");
					pi.setAge(20);
					pi.setPoint(24);
				}else if(i==2) {
					pi.setName("test3");
					pi.setAge(30);
					pi.setPoint(24);
				}else if(i==3) {
					pi.setName("test3");
					pi.setAge(30);
					pi.setPoint(25);
				}else{pi.setName("test4");
				pi.setAge(30);
				pi.setPoint(24);
			
			}
				System.out.println(pList.get(i).getName()+","+pList.get(i).getAge()+","+pList.get(i).getPoint());*/
			/*Person p = new Person();
			System.out.println(p.getName());
			pList.add(p);
			p.setName("명권");
			p = new Person();
			p.setName("홍길동");
			System.out.println(pList.get(0).getName());
			*/
		}
		}

