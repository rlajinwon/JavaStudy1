package com.winter.app;

import java.util.Scanner;

public class Study6 {

	public static void main(String[] args) {
		
		// 나머지 연산자 % 
		
		Scanner sc = new Scanner(System.in);
		// 편의점에서 자동 계산 
		// 물건의 총합계를 입력받는다.
		// 물건의 합계가 25300
		// 낸 금액 50000원권
		// 거스름돈 ?  ?  24700
		// 만원 2 , 천원 4, 백원 7 
		
		
		int sum = 25300; 
		int don = 50000;
		
		int jandon = don - sum;
		int m = jandon / 10000; // 2 
		System.out.println(m);
		
		int n = (jandon % 10000) / 1000; // 4
		// 24700 % 10000 = 4700 / 1000 = 4
		System.out.println(n);
		
		int w = (jandon % 1000) / 100; // 7
	  // 24700 % 1000 = 700 / 100  = 7
		System.out.println(w);
		
		
		
		
		
			
		

	}

}
