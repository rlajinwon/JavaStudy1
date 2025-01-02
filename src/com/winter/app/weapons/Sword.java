package com.winter.app.weapons;

public class Sword {

	
	private String name;
	private int str;
	private int range;
	
	
	public Sword() {
		name = "냉동참치";
		str = 30;
		range = 1;
	}
	public void info() {
		System.out.println(name);
		System.out.println(str);
		System.out.println(range);
		System.out.println("================");
		
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	
	
	
}
