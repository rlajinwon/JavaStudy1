package com.winter.app.controls;

import java.util.Scanner;

public class StudyControl1 {

	public static void main(String[] args) {
		
		/**
		 * 제어문
		 * 
		 * if - 만약 ~면 
		 * 1) 단일 if
		 * 
		 *   if(조건식){
		 *   	조건식이 true 일떄만 수행
		 *   }
		 *   
		 * 
		 * 
		 */
		
	
		System.out.println("Hello world");
		int num = 4;
		
		if(num % 2 == 0) {
			System.out.println("Num : " + num);
			
			
		}
		
		System.out.println("프로그램 종료");
		
		
		Scanner sc = new Scanner(System.in);
		// 국어, 영어, 수학 점수를 입력 받아서
		// 총점과 평균을 계산 후에 90점 이상이면 우수상 수상 출력
		
		System.out.println("국어 점수를 입력하세요: ");
		int k = sc.nextInt();
		
		// 국어점수 범위가 0 ~ 100면 통과 아니라면 에러 출력 
		
		if(k < 0 || k > 100) {
			System.out.println("에러");
		}	
		
		
		
		
		
		System.out.println("수학점수를 입력하세요:");
		int m = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요: ");
		int e = sc.nextInt();
		
		int total = k + m + e;
		
		int avg = total / 3;
		
		
		if(avg >= 60) {
			
			if(avg >= 90) {
			
				System.out.println("우수상 수상");
			}   
			
			System.out.println("통과");
	
		}		
		
		System.out.println(avg);
		
		// 평균이 90점 이상이면 A출력 
		// 평균이 80점 이상이면 B출력 
		// 평균이 70점 이상이면 C출력 
		// 평균이 60점 이상이면 D출력
		// 그 외 F출력 
		
		
		if(avg >= 90) {
			System.out.println('A');
		}if(avg >= 80 && avg < 90 ) {
			System.out.println('B');
		}if(avg >=70 && avg < 80) {
			System.out.println('C');
		}if(avg >=60 && avg < 70) {
			System.out.println('D');
		}if(avg < 60 ) {
			System.out.println('F');
		}
		
		
		
		
		}
			
		

	}
