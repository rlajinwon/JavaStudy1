package com.winter.app.himart;

public abstract class Appliance {
	private int price;
	private int point;
	private String brand;

	
public void info() {
	System.out.println(this.price);
	System.out.println(this.point);
	System.out.println(this.brand);
}
	



public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getPoint() {
	return point;
}

public void setPoint(int point) {
	this.point = point;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}


	
	
}
