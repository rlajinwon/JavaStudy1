package com.winter.app.study1.array;

import java.util.Scanner;

public class ArrayStudy1 {

	public static void main(String[] args) {
		
		//배열 선언 공식 -> 데이터타입 변수명;
		//
		
		int [] nums = new int [4];
		double [] avgs = new double[3]; 
		
		
		//사람이름 10000명을 모을 배열
		String [] names = new String[10000];
		
		
		
		nums[0]=20;
		nums[1]=30;
		nums[2]=40;
		nums[3]=50;
		
		avgs[1]=3.12;
		
		
		System.out.println(nums[1]);
		System.out.println(avgs[0]);
		
		
		
//		for(int i=0; i<10000;i++) {
//		System.out.println(names[i]);
//		}
//		
	
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<nums.length; i++) {
			System.out.println("숫자를 입력하세요:");
		nums[i] =sc.nextInt();

		}
		
		// nums에 있는 모든 데이터 출력
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}

		
		
		
		
		
		
		
		
	}

}
