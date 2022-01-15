package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface IGamerService {
	void addGamer(Gamer gamer) throws NumberFormatException, RemoteException;
	void deleteGamer(Gamer gamer)throws NumberFormatException, RemoteException;
	void updateGamer(Gamer gamer)throws NumberFormatException, RemoteException;
}
