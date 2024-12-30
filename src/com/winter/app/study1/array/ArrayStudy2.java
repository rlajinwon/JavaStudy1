package com.winter.app.study1.array;

import java.util.Scanner;

public class ArrayStudy2 {

	public static void main(String[] args) {
		//한반에서 국어시험의 결과를 저장
		//학생 수는 N명
		//학생 수를 입력 받아서 시작
		//국어의 총점과 평균을 계산
		int total = 0;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("학생 수 입력:");
		int n = sc.nextInt();
		int [] kor = new int[n];
		
		for(int i =0; i<kor.length; i++) {
			System.out.println("국어 시험 점수를 입력하세요:");
			kor[i] =sc.nextInt();			
		}
		for(int i = 0; i<kor.length;i++) {
			total += kor[i];
			
		}
		System.out.println("국어시험 총점:"+total);
		System.out.println("국어시험 평균:"+total/(double)kor.length);
		
		
		
	}
}
