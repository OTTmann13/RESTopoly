package de.studentcorp.monopoly.monopoly.dice.impl;
import de.studentcorp.monopoly.monopoly.dice.impl.Roll;

public class Dice {
	private int number;

	//Create a dice with a set maximum value
	public Dice(int number) {
		this.number = number;
	}

	public Roll roll() {
		return new Roll(number);
	}

}