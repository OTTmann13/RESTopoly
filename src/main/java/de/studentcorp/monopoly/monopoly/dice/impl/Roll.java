package de.studentcorp.monopoly.monopoly.dice.impl;

import java.io.Serializable;

public class Roll implements Serializable{
	private static final long serialVersionUID = 1337L;
	private int number;
	private final int MINIMUM = 1;
	
	public Roll(int number) {this.number  = number;}
	
	//Return the max value of the dice
	public int getNumber() {return this.number;}
	
	//Return a random integer with a given max value
	public int roll() {return MINIMUM + (int)(Math.random()* number); }
}
				
