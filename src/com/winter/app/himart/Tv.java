package com.winter.app.himart;

import java.util.Set;

public class Tv extends Appliance{
	
	private int pixel;
	private int size;
	
	public Tv() {
		this.setPrice(600);
		this.setPoint(60);
		this.setBrand("LG");
		this.setPixel(8);
		this.setSize(50);
	}
	
	
	public void info() {
		super.info();
		System.out.println(this.pixel);
		System.out.println(this.size);
	}
	
	
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}	
