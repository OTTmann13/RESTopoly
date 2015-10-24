package de.studentcorp.monopoly.monopoly;

import de.studentcorp.monopoly.monopoly.dice.DiceController;
import de.studentcorp.monopoly.monopoly.dice.DiceService;

public class Main {
	public static void main(String args[]){
		new DiceController(new DiceService());
	}
}
