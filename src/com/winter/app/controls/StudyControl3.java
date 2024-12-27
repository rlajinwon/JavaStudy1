package com.winter.app.controls;



public class StudyControl3 {

	public static void main(String[] args) {
		
		
		/**
		 * 
		 * 여러개 중 하나를 선택
		 * if(조건식1){
		 * 		조건식 1이 true 일 때 실행
		 * 
		 * }else if (조건식2){
		 * 		조건식 2가 true 일 때 실행
		 * 
		 * }else if (조건식3){
		 * 		조건식 3이 true 일 떄 실행
		 * 
		 * }else {
		 * 		그 외 나머지
		 * }
		 * 
		 * 
		 */
		
		
		System.out.println("프로그램 시작");
		
		
		String result = "";
		int avg =75;
		
		if(avg >= 90) {
			result = "A";

		}else if(avg >= 80) {
			result = "B";
			
		}else if(avg >= 70) {
			result = "C";
			
		}else if(avg >=60) {
			result = "D";
			
		}else {
			result = "F";
		}
		
		
		
		System.out.println(result);
	
		System.out.println("프로그램 종료");
		
		
	}
}
