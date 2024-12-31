package com.winter.app.study2.object2;

import java.util.Scanner;

public class SchoolMateFactory {

	//make
	//SchoolMate 객체 생성
	//모든 정보를 입력받아서 대입
	// 이름\t번호\t국어\t영어\t수학\t총점\t평균
	
	public SchoolMate [] make(SchoolMate[] schoolMates) {
		SchoolMate sm = new SchoolMate();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름:");
		sm.name = sc.next();
		
		System.out.println("번호:");
		sm.num = sc.nextInt();
		
		System.out.println("국어:");
		sm.kor = sc.nextInt();
		
		System.out.println("영어:");
		sm.eng = sc.nextInt();
		
		System.out.println("수학:");
		sm.math = sc.nextInt();
		
		sm.total = sm.kor+sm.eng+sm.math;
		
		sm.avg = sm.total/3.0;
		
		// 1. +1 된 새로운 배열 생성
		// 2. 기존의 값을 새로운배열로 값을 저장
		//3. 마지막 index 새로만든 schoolmate 대입 
		
		
		SchoolMate[] scm = new SchoolMate[schoolMates.length+1];
		for(int i=0; i<schoolMates.length;i++) {
		scm[i] = schoolMates[i];
		}
		
		scm[schoolMates.length] = sm;
		
		
		
		
		
		return scm;
		
		
		
	}
}
