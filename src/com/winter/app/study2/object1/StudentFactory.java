package com.winter.app.study2.object1;

public class StudentFactory {

	
	//리턴타입 
	public int t1(int num, int num2) {
		
		int sum = num + num2;
		int avg = sum / 2;
		
		if(sum<0) {
			return sum;
		}
		
		//return 은 한개의 값만 가능하다.
		//메서드의 종료는 {}끝을 만나거나 
		//return 을 만났을때 
		
		return sum;
		
		
	}
	
	public void t2() {
	
		
		
	}
	public void t3(int num) {
		
		if(num<0) {
			return;
		}
		
		
	}
	
}
