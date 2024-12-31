package com.winter.app.study2.object1;

public class ObjectMain {

	public static void main(String[] args) {
		
		//OOP 기초 
		//객체 생성
		//변수 선언 같다
		//클래스는 데이터 타입이다
		//데이터타입 변수명;
		//Reference, 지역변수, 참조변수
		
		
		Student st = new Student();
		
		st.name = "winter";
		st.num = 1;

		Teacher tc = new Teacher();
		
		tc.name = "철수";
		tc.kind = "국어";
		
		//
		Student [] students = new Student[5];
		students[0] = st;
		
		System.out.println(students[0].name);

		
		for(int i=0; i<5; i++) {
		students[i]	= new Student();
		}
		
		
		tc.students = students;
		
		
		System.out.println(tc.name);
		System.out.println(tc.students[0].name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Student st2 = new Student();
//		
//		st2.name = "iu";
//		st2.num = 2;
//		
//		st = st2;
//		
//		st.name = "철수";
//		
//		System.out.println(st.num);
//		System.out.println(st2.name);
//		
//		
//		Monster ms = new Monster();
//		
//		ms.name = "주황버섯";
//		ms.lv = 15;
//		ms.att = 20;
//		ms.hp = 200;
//		ms.ex = 30;
//		
//		System.out.println("name:"+ms.name);
//		System.out.println("level:"+ms.lv);
//		System.out.println("str:"+ms.att);
//		System.out.println("hp:"+ms.hp);
//		System.out.println("ex:"+ms.ex);
//		
//		
//		
//		
		
		
		

	}

}
