package com.winter.app.controls;

import java.util.Random;

import com.winter.app.units.Character;
import com.winter.app.units.Monster;

public class GameStage {

	
	private Random random;
	
	public GameStage() {
		random = new Random();
	}
	
	
	public void fight(Character character) {
		
		Random random = new Random();
		int count = random.nextInt(3)+1;
		Monster[] monster = new Monster[count];
		
		for(int i = 0; i < monster.length; i++) {
			
			monster[i] = new Monster();
		}
		
		this.attack(character,monster);
	}
	
	private void attack(Character character, Monster[]monster) {
		
		Character ch = new Character();
		
		for(int i=0; i<monster.length; i++) {
			int d = monster[i].getPower();
			d = random.nextInt(d);
			
			character.setHp(character.getHp()-d);
			
			
		}
		
		
		
		
		
	}
	
	
	
	
}
