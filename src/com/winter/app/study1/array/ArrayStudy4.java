package com.winter.app.study1.array;

public class ArrayStudy4 {

	// 0 - > 1 , 0 -> 2 0 -> 3 0 -> 4
	// 1 - > 2 , 1 -> 3 1 -> 4
	// 2 - > 3 , 2 -> 4
	// 3 - > 4
	public static void main(String[] args) {
		
		
		int [] nums = {6,9,7,4,1};
		
		for(int i=0; i<nums.length-1; i++) {
			System.out.println(i);
			for(int j =i+1;j<5;j++) {
				System.out.print(j);
				int tmp = nums[i];
				if(nums[i]<nums[j]) {
					nums[i] = nums[j];
					nums[j] = tmp;

				
			}
				System.out.println();
			
		}
			System.out.println("==============");
			for(i=0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		}
		
	}
}
