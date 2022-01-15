package Abstract;

import java.rmi.RemoteException;

import Entities.Game;

public interface IGameService {

	void addGame(Game game) throws NumberFormatException,RemoteException;
	void deleteGame(Game game) throws NumberFormatException,RemoteException;
	void updateGame(Game game) throws NumberFormatException,RemoteException;
}
