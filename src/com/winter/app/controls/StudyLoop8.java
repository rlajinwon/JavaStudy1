package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw =5678;
		boolean flag = true;
		// 1.로그인 시도  2.프로그램 종료 
		
		while(flag) {
			System.out.println("1.로그인시도    2.프로그램 종료");
			int input =sc.nextInt();
			
			if(input == 1) {
				System.out.println("아이디를 입력하세요:");
				int kid = sc.nextInt();
				System.out.println("비밀번호를 입력하세요:");
				int kpw = sc.nextInt();
				
				if(kid == id && kpw== pw) {
					System.out.println("로그인 성공");
					flag = !flag;
				}
				
				
			}else if(input == 2) {
				System.out.println("프로그램을 종료합니다.");
				flag = !flag;
				
			}
				
			
			int gold = 1000;
			int lv = 1;
			int mob =3;
			
			boolean check = true;
			
			
			while(check) {
				System.out.println("1.사냥하기     2.종료하기");
				int kkk = sc.nextInt();
				
				if(kkk == 1) {
					System.out.println("사냥을 시작합니다.");
					lv++;
					System.out.println("축하합니다 " + lv + "레벨 달성");
					
					System.out.println("잡은 몬스터 " + mob+"마리입니다");
					mob+=3;
					
					
					if(lv==5) {
						System.out.println(gold+"gold 획득");
					}if(lv==10) {
						System.out.println(2*gold+"gold 획득");
					}if(lv==15) {
						System.out.println("만렙 달성! "+ 3*gold+"gold 획득");
						
						System.out.println("총 골드는"+ 6*gold + "gold 획득");
						check = !check;
					}
					
					
				}else if(kkk ==2){
					System.out.println("프로그램을 종료합니다.");
					check = !check;
					
				}
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
		}System.out.println("종료");
		
		
	}
}
