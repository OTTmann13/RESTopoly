package de.studentcorp.monopoly.monopoly.dice;

public class Dice {
	private int minimum = 1;
	private int maximum = 6;
	
	public void setMaximum(int newMaximum){this.maximum = newMaximum;}
	
	public int roll(){return minimum + (int)(Math.random()* maximum);}
}
