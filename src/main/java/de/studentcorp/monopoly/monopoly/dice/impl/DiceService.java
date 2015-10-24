package de.studentcorp.monopoly.monopoly.dice.impl;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import de.studentcorp.monopoly.monopoly.dice.interfaces.DiceRMI;

public class DiceService {
	
	public int getRoll(){
		int roll = 0;
		try{
			Registry registry = LocateRegistry.getRegistry("192.168.2.6",1099);
			DiceRMI stub = (DiceRMI)registry.lookup("Dice");
			roll = stub.roll().roll();
		}
		catch (RemoteException e) {System.out.println(e);}
		catch (NotBoundException e) {System.out.println(e);}
		return roll;
	}
	
	
}

