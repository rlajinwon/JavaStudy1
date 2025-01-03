package com.winter.app.himart;

public class Customer {

	private int don=1000;
	private int point=0;
	
	public void info() {
		System.out.println("현재 금액:"+this.don);
		System.out.println("현재 포인트:"+this.point);
		
	}
	
	
	
	public void buy(Appliance appliance) {
	this.don =this.don - appliance.getPrice();
	this.point = this.point + appliance.getPoint();
	System.out.println(this.don);
	System.out.println(this.point);
		
	}
	
	public void buy(Appliance [] appliances) {
		
		for(int i=0; i<appliances.length; i++) {
			this.buy(appliances[i]);
		}
		
	}
	
	
	
	
	
	
	public int getDon() {
		return don;
	}
	public void setDon(int don) {
		this.don = don;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	
	
}
