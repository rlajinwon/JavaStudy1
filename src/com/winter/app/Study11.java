package com.winter.app;

public class Study11 {

	/**
	 *   상항연산자
	 * 	 조건식은 결과물이 boolean
	 *   변수 = 조건식? 조건식이 true라면 실행: 조건식이 false일때 실행
	 *   
	 *   
	 *   비트 논리 연산자
	 *   &(and) , | (or), ~(not)
	 *   
	 *   
	 *   
	 *   
	 *   쉬프트 연산자
	 *   3 << 2 
	 *   정수 3을 2비트 만큼 왼쪽으로 밀고 빈칸은 0으로 채운다.
	 *   
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 */
	
	
	public static void main(String[] args) {

		//나이를 입력 받아서 미성년자 구분
		
    	//	int age = 22;
		
		//String result = age > 19? "성인":"미성년자";
		
	    //	System.out.println(result);
		
		
		int price = 50000;
		// 가격 30000원 이상 구매 시 배달료 무료 , 아니라면 2500 배달비 추가
		// 최종가격 
		
		int result = price >= 30000 ? price : price+2500;
		
		System.out.println(result);
		
		System.out.println(3&2);
		
		System.out.println(~2);
		
		
		
		
		
		
	}

}
