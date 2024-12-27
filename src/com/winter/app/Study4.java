package com.winter.app;

public class Study4 {
	
	/**
	 *   형변환(Cascading, data type 변환)
	 *   
	 *   (변환할 타입명) 변수명
	 *   
	 *   primitive type 끼리만 가능하다. 단, boolean 제외
	 *   
	 *   
	 *   
	 *   1. 자동 형변환
	 *   	값의 변화가 없다.
	 *   	byte -> short(char) -> int -> long -> float -> double
	 *   
	 *   
	 *   2. 강제 형변환
	 *   	값의 변화가 있을 수 있다. 
	 *   
	 *   OverFlow & UnderFlow
	 *   OverFlow : 표현 할 수 있는 최대값을 넘어가면 최소값으로 이동
	 *   UnderFlow : 표현 할 수 있는 최소값을 넘어가면 최대값으로 이동	
	 * 
	 * 
	 * 
	 * @param args
	 */


	

	public static void main(String[] args) {
		
		char ch = 'b';
		
		int num = ch;
		
		
		num = 99;
		
		ch = (char)num;
		
		System.out.println(ch);
		
		
		System.out.println(num);
		
		double d = 23.56;
		
		num = (int)d;
		System.out.println(num);
		
		num = 5;
		d = num;
		
		System.out.println(d);
		
		long n1 = 0L;
		float f1 = 0.0F;
		
		n1 = (int)f1;
		
		
		
		
		
		
		
		
		

	}

}
