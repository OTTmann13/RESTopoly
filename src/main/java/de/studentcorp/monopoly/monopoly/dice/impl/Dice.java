package de.studentcorp.monopoly.monopoly.dice.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import de.studentcorp.monopoly.monopoly.dice.impl.Roll;
import de.studentcorp.monopoly.monopoly.dice.interfaces.DiceRMI;

public class Dice extends UnicastRemoteObject implements DiceRMI{

	protected Dice() throws RemoteException {}

	private static final long serialVersionUID = 7856407424598201679L;

	public Roll roll() throws RemoteException {
		return new Roll(6);
	}

}