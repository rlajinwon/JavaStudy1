package com.winter.app.study2.object1;

public class ArgTestMain {

	
	public static void main(String[] args) {
		
		ArgTest test = new ArgTest();
		
		int num = 5;
		
		
		test.info(num);
		
		System.out.println(num);
		
		
		Student st = new Student();
		st.kor = 30;
		test.info2(st);

		System.out.println(st.kor);
		
		
		
		
		
	}
}
