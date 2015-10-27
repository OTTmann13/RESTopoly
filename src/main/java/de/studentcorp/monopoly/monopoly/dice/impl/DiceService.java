package de.studentcorp.monopoly.monopoly.dice.impl;

public class DiceService {
	public int getRoll(){
		//Create a new Dice with a max value
		Dice dice = new Dice(6);
		//Return a random number given by the Roll class
		return dice.roll().roll();
	}
}

