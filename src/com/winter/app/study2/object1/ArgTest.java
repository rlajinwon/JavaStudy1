package com.winter.app.study2.object1;

public class ArgTest {

	
	public void info(int num) {
		num*=3;
		
		System.out.println(num);
		
		
		
	}
	
	public void info2(Student st) {
		
		st = new Student();
		st.kor = 60;
		System.out.println(st.kor);
	}
}
