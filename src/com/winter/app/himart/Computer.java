package com.winter.app.himart;

public class Computer extends Appliance {
	

	private String cpu;

	public Computer() {
		this.setPrice(200);
		this.setPoint(20);
		this.setBrand("삼성");
		this.setCpu("Intel I9");
	}
	
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	
	
	
}


