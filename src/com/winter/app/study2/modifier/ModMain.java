package com.winter.app.study2.modifier;

public class ModMain {
	
	public static void main(String[] args) {
		
		Test test = new Test();
		test.num1 = 30;
		Test.num3 = 1010;
		
		
		System.out.println(Test.num3);
		System.out.println(test.num1);
		
		
		Test test2 = new Test();
		
		System.out.println("===============");
		System.out.println(Test.num3);
		System.out.println(test2.num1);
		
	
		System.out.println("==============");
		
	}

}