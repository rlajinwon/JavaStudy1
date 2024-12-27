package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop6 {
	public static void main(String[] args) {
		
		/**
		 * 0분 0초 
		 * 0분 1초
		 * 0분 2초
		 * ...
		 * 0분 59초
		 * 1분 0초
		 * ...
		 * 59분 59초까지
		 * 
		 * 분 초 를 입력받음
		 * ex) 1 , 5 
		 *  1분 5초까지 출력하고 종료 .
		 *  
		 * 
		 */
		
		
		
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("분을 입력하세요");
		int m =sc.nextInt();

		System.out.println("초을 입력하세요");
		int s =sc.nextInt();

		boolean flag =false;
		
		
		
		for(int i=0; i<60; i++) {	
			for(int j =0; j<60; j++) {
			
				
				
				System.out.println(i + ":" +j);
				if(m==i&&s==j) {
					flag=true;
					break;
				}
			
			}
			if(flag) {
				break;
			}
			
			
			
			
		}
		
				
		System.out.println("프로그램 종료");
				
		
	
	}
		
		
		
}

	
	
		
	
