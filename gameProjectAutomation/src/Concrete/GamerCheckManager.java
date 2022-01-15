package Concrete;

import java.rmi.RemoteException;

import Abstract.IGamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements IGamerCheckService {

	@Override
	public boolean checkIfRealGamer(Gamer gamer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		return true;	}

	@Override
	public boolean CheckIfRealPlayer(Gamer gamer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
