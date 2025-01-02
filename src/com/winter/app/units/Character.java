package com.winter.app.units;

import com.winter.app.weapons.Sword;

public class Character {
	
	// Maple , 
	
	private String name;
	private String job;
	private int hp;
	private int mp;
	private int exp;
	private int level;
	private int power;
	private Sword sword;
	private Pet pet;

	
	
	

	
	public Sword getSword() {
		return sword;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public Character() {
		this.job = "전사";
		this.hp = 1000;
		this.mp = 500;
		this.exp = 0;
		this.level = 1;
		this.power = 100;
		this.pet = new Pet();
		
	}

	// info
	public void info() {
		System.out.println(this.name);
		System.out.println(this.job);
		System.out.println(this.hp);
		System.out.println(this.mp);
		System.out.println(this.exp);
		System.out.println(this.level);
		System.out.println(this.power);
		System.out.println("=================");
	}




	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getJob() {
		return job;
	}






	public void setJob(String job) {
		this.job = job;
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






	public int getExp() {
		return exp;
	}






	public void setExp(int exp) {
		this.exp = exp;
	}






	public int getLevel() {
		return level;
	}






	public void setLevel(int level) {
		this.level = level;
	}






	public int getPower() {
		return power;
	}






	public void setPower(int power) {
		this.power = power;
	}
	
	
	
	
}
