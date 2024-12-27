package com.winter.app.controls;

import java.util.Random;

public class StudyControl5 {

	public static void main(String[] args) {
		
		Random random = new Random(); //무작위 데이터 생성
		
		int salt = random.nextInt(8)+1; // 1~8까지
		int ch = random.nextInt(26)+97; // 97부터 122뽑기
		char word = (char)ch;
		
		int result = word + salt; //122+3 => 123 - 122 => 1
		
		if(result >122) {
			// 97:a
			// 98:b
			// 99:c
			result = result - 'z' + 96;
		}
	
		
		
		
		
		
		
		System.out.println(salt); 
		System.out.println(word); 
		System.out.println((char)result);
	
		
		// ===================================
		//디코딩 코드 작성
		
		
		
	}
}
