package com.winter.app.controls;

import java.util.Scanner;

import com.winter.app.units.Character;
import com.winter.app.units.Monster;
import com.winter.app.weapons.Sword;

public class GameControl {

	private Scanner sc;
	private GameStage gs;
	
	public GameControl() {
		this.sc = new Scanner(System.in);
		this.gs = new GameStage();
		
	}
	
	
	
	public void start() {
		Character ch = new Character();
		System.out.println("캐릭터의 이름 입력:");
		//String n = sc.next();
		ch.setName(sc.next());
		
		
		Sword sword = new Sword();
		
		ch.setSword(sword);
		
		gs.fight(ch);
		
		
		
		
		
		
		
	}
}
