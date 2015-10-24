package de.studentcorp.monopoly.monopoly.dice.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import de.studentcorp.monopoly.monopoly.dice.impl.Roll;

public interface DiceRMI extends Remote{
	
	Roll roll() throws RemoteException;

}

