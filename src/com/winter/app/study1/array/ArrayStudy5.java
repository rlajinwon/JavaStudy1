package com.winter.app.study1.array;

import java.util.Random;

public class ArrayStudy5 {

	public static void main(String[] args) {
		
		//로또 번호 6개 1-45
		
		Random random = new Random();
		int [] nums = new int[6];
		
		int idx = 0;
		
		for(int i=0; i<nums.length; i++) {
			// i = 0 , 0
			// i = 1 , 1
			// i = 2 , 2
			// i = 5 , 5
			
			nums[i] = random.nextInt(45)+1;

			for(int j=0; j<i;j++) {
				
				// i=1, j=0
				if(nums[i]==nums[j]) {
					i--;
					break;
					
					
				}
				
					
				
			}
			
			
		
		
		}
		for(int i=0;i<6; i++) {
			System.out.println(nums[i]);
		
		}
		
	}
	
}
