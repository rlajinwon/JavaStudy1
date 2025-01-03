package com.winter.app.himart;

public class HimartMain {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		Computer computer = new Computer();
		Washer washer = new Washer();
		
		tv.info();
		System.out.println("============");
		computer.info();
		System.out.println("============");
		washer.info();
		System.out.println("============");
			
		Customer customer = new Customer();
		customer.info();
		customer.buy(washer);
		
	
		
	}
}