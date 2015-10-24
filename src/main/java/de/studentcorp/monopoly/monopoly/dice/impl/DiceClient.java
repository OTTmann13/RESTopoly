package de.studentcorp.monopoly.monopoly.dice.impl;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import de.studentcorp.monopoly.monopoly.dice.interfaces.DiceRMI;

public class DiceClient {
	public static void main(String args[]){
		try {
			Registry registry = LocateRegistry.getRegistry("192.168.2.6",4567);
			DiceRMI stub = (DiceRMI)registry.lookup("Dice");
			int roll = stub.roll().roll();
			System.out.println("Dice rolls: " + roll);
		} 
		catch (RemoteException e) {System.out.println(e);}
		catch (NotBoundException e) {System.out.println(e);}
	}
}
