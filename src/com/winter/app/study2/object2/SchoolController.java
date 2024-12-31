package com.winter.app.study2.object2;

import java.util.Scanner;

public class SchoolController {

	
	
	
	// start 메서드 
	
	public void start() {
		// 1. 학생정보입력  2. 학생정보출력  3.프로그램종료
		Scanner sc = new Scanner(System.in);
		SchoolMateFactory sf = new SchoolMateFactory();
		boolean check = true;
		SchoolMate st = null;
		SchoolMateView sv = new SchoolMateView();
		SchoolMate [] schoolMates = new SchoolMate[0];
		
		
		

	while(check) {
		System.out.println("(1)학생정보입력 (2)학생정보출력 (3)학생번호검색 (4)프로그램 종료");
		int select = sc.nextInt();
		if(select == 1) {
		schoolMates = sf.make(schoolMates);
		
		}else if(select == 2){
			sv.viewAll(schoolMates);
			
			
		}else if(select ==3) {
			
		SchoolMate schoolMate =	sf.find(schoolMates);
		if(schoolMate != null) {
		sv.view(schoolMate);
		}else {
			System.out.println("일치하는 학생이 없습니다.");
		}
		
		
		}
		else {
		System.out.println("종료");
		break;
	
		
		}
		
	}
	}	
	}

