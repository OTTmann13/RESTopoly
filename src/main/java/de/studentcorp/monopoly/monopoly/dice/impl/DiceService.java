package de.studentcorp.monopoly.monopoly.dice.impl;

public class DiceService {
	public Dice getDice(){
		//Create a new Dice with a max value
		Dice dice = new Dice();
		//Return a random number given by the Roll class
		dice.roll(6);
		return dice;
	}
}

