package com.winter.app.himart;

public class Washer extends Appliance {
		
	private int volume;
	private String kind;
	
	public Washer() {
		this.setPoint(10);
		this.setPrice(100);
		this.setBrand("Daewoo");
		this.volume = 20;
		this.kind ="통돌이";
	}

	@Override
	public void info() {
		super.info();
		
		System.out.println(this.volume);
		System.out.println(this.kind);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	

}
