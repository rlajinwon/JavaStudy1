package com.winter.app.controls;

import java.util.Scanner;

public class StudyControl2 {

	/**
	 * 
	 * if ~ else 둘 중 하나만 실행
	 * 
	 * if(조건식){
	 * 		조건식 true 일 때 실행
	 * 
	 * }else {
	 * 		조건식이 false 일 떄 실행
	 * 
	 * }
	 * 
	 * 
	 * @param args
	 */
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		System.out.println("프로그램 시작");
		
		int num = -5;
		int age = 0;
		
		
		
		if(num > 0) {
			num++; // 2
			age = 20; // 지역변수  
			age++; // 21
			
			}else {
				System.out.println("음수 입니다");
			}
		
		System.out.println(num);
		System.out.println(age);
		
		//=====================================================
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		
		System.out.println("id를 입력하세요:");
		int a = sc.nextInt();
	
		
		System.out.println("pw를 입력하세요:");
		int b = sc.nextInt();
		
		if(id == a && pw == b) {
			System.out.println("로그인 성공");
			
		}else {
			System.out.println("로그인 실패");
		}
		
		
		
		
		
		
		
		
		System.out.println("프로그램 종료");
		
		
		
		
	}
}
