package de.studentcorp.monopoly.monopoly.dice.impl;

import java.io.Serializable;

public class Roll implements Serializable{
	private static final long serialVersionUID = 1337L;
	private int number;
	private final int MINIMUM = 1;
	private int maximum = 6;
	
	public Roll(int number) {this.maximum  = number;}
	
	//Return the max value of the dice
	public int getNumber() {return this.number;}
	
	//Return a random integer with a given max value
	public int roll() {return number = MINIMUM + (int)(Math.random()* maximum); }
}
				
