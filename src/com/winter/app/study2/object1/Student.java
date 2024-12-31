package com.winter.app.study2.object1;

public class Student {

	//멤버변수(instance 변수) 메모리 영역 힙 영역 차지
	//접근지정자 [그 외 지정자] 데이터타입 변수명;
 	
	//Reference , Instance 변수, 참조변수
	String name;
	//primitive , Instance 변수
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	
	
	
	// 하늘 일 멤버메서드(instance 메서드)
	// 접근지정자 [그 외 지정자] 리턴타입 메서드명([매개변수들 선언]){
	// 메서드 실행 코드들 - - -
// }
	
	public void info(int num1, double num2) {
		System.out.println("학생 입니다");
		//두개의 숫자를 합을 계산
		System.out.println(num1 + num2);
		
		
	}
	
	public void print() {
		System.out.println("프린트합니다");
	}
	
}
