package de.studentcorp.monopoly.monopoly.dice.impl;
import de.studentcorp.monopoly.monopoly.dice.impl.Roll;

public class Dice {
	private int number;

	public void roll(int maxDice) {
		number = new Roll(maxDice).roll();
	}
	
	public int getNumber(){
		return number;
	}

}