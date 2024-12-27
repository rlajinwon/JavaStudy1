package com.winter.app.controls;

public class StudyLoop1 {

	/**
	 * 
	 * 반복잡업
	 * 1. for   2.while
	 * 
	 * 1. for ~동안 
	 * 	  for (초기식; 조건식; 증감식){
	 * 		조건식이 true 일때 실행
	 * }
	 * 
	 * 1) 초기식 진행
	 * 2) 조건식 진행 
	 * 		true 라면 {} 실행
	 * 			증감식 실행
	 * 			조건식 진행
	 * 
	 * 		false 라면 for 문 종료 
	 * 
	 * 
	 * @param args
	 */
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		for(int i=0; i<10; i+=2) {
			
			// 0 - 9 짝수만 출력 
			// 0 2 4 6 8 
			System.out.print(i);
			
					
		}System.out.println();
		
		for(int i = 0; i<10; i++) {	
			if(i%2==0) {
			System.out.print(i);
			
		}
			
		}System.out.println();
		
		
		int count = 6;
		int sum = 0;
		//누적함수
		// 0+1+2+3+4+5=15
		// sum 
		for(int i=1; i<count;i++) {
			sum = sum+i;      // 1 2 3 4 
			
		}System.out.println(sum);
		
		
		
		
		System.out.println("프로그램 종료");
	}
}
