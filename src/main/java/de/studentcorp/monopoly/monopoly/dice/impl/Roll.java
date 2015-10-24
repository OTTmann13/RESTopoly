package de.studentcorp.monopoly.monopoly.dice.impl;

import java.io.Serializable;

public class Roll implements Serializable{
	private static final long serialVersionUID = 1337L;
	private int number;
	private final int MINIMUM = 1;
	
	public Roll(int number) {this.number  = number;}
	
	public int getNumber() {return this.number;}
	
	public int roll() {return MINIMUM + (int)(Math.random()* number); }
}
				
