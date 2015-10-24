package de.studentcorp.monopoly.monopoly.dice.impl;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class DiceServer {
	public static void main(String args[]){
		try {
			Dice dice =  new Dice();
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("Dice", (Remote) dice);
			System.out.println("Server is ready!");
		} 
		catch (RemoteException e) {System.out.println(e);}	
	}
}	
