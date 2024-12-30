package com.winter.app.study1.array;

import java.util.Scanner;

public class ArrayStudy6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// 학생 수를 입력 받는다
		
		// 학생 수 만큼 학생 이름을 입력 받는다. 출력.
		
		

		System.out.println("학생 수 입력: ");
		int count = sc.nextInt();
		String [] names = new  String [count];
		int [] kors = new int[count];
		int [] math = new int[count];
		int [] total = new int[count];
		
		
		for(int i=0;i<names.length; i++) {
		System.out.println(i+1+"번째 학생 이름 :");
		names[i]=sc.next();
		System.out.println(names[i] +"의 국어 점수 입력:");
		kors[i] = sc.nextInt();
		System.out.println(names[i] +"의 수학 점수 입력:");
		math[i] = sc.nextInt();
		total[i] = kors[i] + math[i];
		
		
		
		
		
		
		}
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(total[i] < total[j]) { //내림차순
					int tmp = total[i];
					total[i] = total[j];
					total[j] = tmp;
				}
			}
		}
	
		// 총점 기준으로 내림차순 정렬 
		
		
		
		
		
		//학생수 만큼 국어 점수 입력
		//입력한 이름의 국어 점수 , 수학 점수 입력 + 총점
		//ex)철수 : 국어점수 90
		
		
		
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i] + " : " + kors[i] + " : " + math[i] + " : "+total[i]);
	
		}
		
		
		
		
	}

}
