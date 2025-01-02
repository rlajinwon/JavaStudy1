package com.winter.app;

import com.winter.app.controls.GameControl;
import com.winter.app.weapons.Sword;

public class Main {
	
	public static void main(String[] args) {
		
		
		// RPG 
		GameControl gc = new GameControl();
		gc.start();
		
		Sword sword = new Sword();
		sword.info();
		
	}

}
