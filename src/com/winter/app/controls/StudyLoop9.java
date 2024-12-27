package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop9 {

	/**
	 * 
	 * MMORPG
	 * 
	 * 
	 * 레벨 1 - 15레벨 
	 * 
	 * 몬스터의 경험치가 동일
	 * 
	 * 1 -> 2 : 3
	 * 2 -> 3 : 6
	 * 3 -> 4 : 9
	 * 4 -> 5 : 12
	 * ...
	 * 14-> 15 : 42 
	 * 
	 * Gold : 0
	 * 레벨 5 달성 시 1000골드 지급 
	 * 레벨 10 달성 시 2000골드 지급
	 * 레벨 15 달성 시 3000골드 지급
	 * 
	 * 
	 * 
	 * 1.사냥 하기     2.종료하기 
	 * 
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int level = 1;
		
		int gold = 0;
		
		
		for(;level<15; level++) {
			
			System.out.println("1.사냥 2.종료");
			int select= sc.nextInt();
			if(select != 1) {
				break;
				
				
			}
			
			

			
			
			for(int mon =0;mon<level*3;mon++) {
				System.out.println(mon+1+"마리 사냥 성공");
			}
			
			
			
			System.out.println("축 레벨업!");
			
			if((level+1)%5==0) {
				
				
				gold = gold+(level+1)/5*1000;
				
				
			}
			
			
		}
		
		System.out.println("현재 레벨 : " + level);
		System.out.println("현재 골드 : " + gold);
				
		
		
		
	}
}

		
		
		
		
		
		
		
		
//		
//		int gold = 1000;
//		int lv = 1;
//		int mob =3;
//		
//		boolean check = true;
//		
//		
//		while(check) {
//			System.out.println("1.사냥하기     2.종료하기");
//			int kkk = sc.nextInt();
//			
//			if(kkk == 1) {
//				System.out.println("사냥을 시작합니다.");
//				lv++;
//				System.out.println("축하합니다 " + lv + "레벨 달성");
//				
//				System.out.println("잡은 몬스터 " + mob+"마리입니다");
//				mob+=3;
//				
//				
//				if(lv==5) {
//					System.out.println(gold+"gold 획득");
//				}if(lv==10) {
//					System.out.println(2*gold+"gold 획득");
//				}if(lv==15) {
//					System.out.println("만렙 달성! "+ 3*gold+"gold 획득");
//					
//					System.out.println("총 골드는"+ 6*gold + "gold 획득");
//					check = !check;
//				}
//				
//				
//			}else if(kkk ==2){
//				System.out.println("프로그램을 종료합니다.");
//				check = !check;
//				
//			}
//			
//			
//			
//		}
//		
//		
		
		
		