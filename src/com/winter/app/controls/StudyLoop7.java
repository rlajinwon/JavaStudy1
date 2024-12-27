package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop7 {

	/**
	 * while(조건식){ 
	 * 조건식이 true 일 때 실행
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @param args
	 */
	
	
	
	
	
	public static void main(String[] args) {
		
	
		// 1.정보입력  2. 정보수정  3.정보출력  4.프로그램 종료
		
	
		Scanner sc = new Scanner(System.in);
		
		boolean j = true;
		
		while(j){
			System.out.println("1.정보입력  2. 정보수정  3.정보출력  4.프로그램 종료");
			int put = sc.nextInt();
			
			switch(put) {
			case 1:
				System.out.println("정보입력코드 --------");
				break;
			case 2:
				System.out.println("정보수정코드 --------");
				break;
			case 3:
				System.out.println("정보출력코드 --------");
				break;
			case 4:
				System.out.println("프로그램종료 --------");
				j=!j;
				break;
				
			default:
				System.out.println("다시 입력하세요.");

			
			
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			if(put ==1) {
//				System.out.println("정보입력코드------");
//			}else if(put == 2) {
//				System.out.println("정보수정코드------");
//			}else if(put ==3) {
//				System.out.println("정보출력코드------");
//			}else if(put ==4) {
//				j = !j;
//				System.out.println("프로그램이 종료됩니다.");
//			}else {
//				System.out.println("유효하지 않은 숫자입니다.");
//			}
//			
//			
			
		}
		
		
		
	}

}
