package de.studentcorp.monopoly.monopoly;

import de.studentcorp.monopoly.monopoly.dice.impl.DiceController;
import de.studentcorp.monopoly.monopoly.dice.impl.DiceService;

public class Main {
	public static void main(String args[]){
		new DiceController(new DiceService());
	}
}
