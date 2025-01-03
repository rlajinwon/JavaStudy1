package com.winter.app.units;

public class Monster {

	private String name;
	private int level;
	private int hp;
	private int mp;
	private int power;
	private int exp;
	
	
	public Monster() {
		this.name = "슬라임";
		this.level = 10;
		this.hp = 100;
		this.mp = 50;
		this.power = 15;
		this.exp = 20;
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
}
