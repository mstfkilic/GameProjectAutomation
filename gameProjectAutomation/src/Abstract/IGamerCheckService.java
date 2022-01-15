package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface IGamerCheckService {
	boolean checkIfRealGamer(Gamer gamer) throws NumberFormatException, RemoteException;

	boolean CheckIfRealPlayer(Gamer gamer) throws NumberFormatException, RemoteException;
}
