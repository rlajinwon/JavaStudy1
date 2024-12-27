package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop2 {

	public static void main(String[] args) {
		// for(초기식;조건식;증감식){}
		//0초 ~59초
		
	Scanner sc = new Scanner(System.in);
//	System.out.println("초를 입력하세요: ");
//	int sec = sc.nextInt(); // 5 
//	
//	
//		
//	for(int i=0;i<60;i++) {
//		System.out.println(i + "초");
//		
//		if(sec == i) {
//			i = 111;
//		}
//			
//		}
	
	
	
	int id = 1234;
	int pw = 5678;
	
	//id 와 pw 입력받아서 로그인 유무 판단
	// 최대 5번까지 기회
	// 5번 내에서 성공하면 로그인 성공을 출력 후 종료
	// 5번이 넘어가면 은행 방문을 출력 후 종료
	
	
	for(int i=0;i<5; i++) {
		System.out.println(i + 1 + "번째 시도입니다" );
		System.out.println("id를 입력하세요: ");
		int kid = sc.nextInt();
		
		System.out.println("pw를 입력하세요: ");
		int kpw = sc.nextInt();
		
		
	
	if(id == kid && pw == kpw) {
		System.out.println("로그인 성공");
		i = 100;
		
	}else {
		System.out.println("로그인 실패");
		if(i==4) {
			System.out.println("은행 방문 필요");
		}
		
	}
	
	}
	
	System.out.println("프로그램 종료");
	
		
	
	
	
	} // main 끝
} // class 끝
