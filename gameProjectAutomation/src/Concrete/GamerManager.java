package Concrete;

import java.rmi.RemoteException;

import Abstract.IGamerCheckService;
import Abstract.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService{
	
	IGamerCheckService gamerCheckService;
	
	

	public GamerManager(IGamerCheckService gamerCheckService) {
		
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void addGamer(Gamer gamer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		if(gamerCheckService.checkIfRealGamer(gamer)) {
			System.out.println(gamer.getFirstName() + " is successfully added to system.");
		}else {
			System.out.println("Player is not found.");
		}
		
	}

	@Override
	public void deleteGamer(Gamer gamer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		if(gamerCheckService.checkIfRealGamer(gamer)) {
			System.out.println(gamer.getFirstName() + " is successfully deleted from system.");
		}else {
			System.out.println("Player is not found.");
		}
		
	}

	@Override
	public void updateGamer(Gamer gamer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		if(gamerCheckService.checkIfRealGamer(gamer)) {
			System.out.println(gamer.getFirstName() + " is successfully updated to system.");
		}else {
			System.out.println("Player is not found.");
		}
		
	}

}
