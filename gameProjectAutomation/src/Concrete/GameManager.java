package Concrete;

import java.rmi.RemoteException;

import Abstract.IGameService;

import Entities.Game;

public class GameManager  implements IGameService{

	@Override
	public void addGame(Game game) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + "the game succesfully added to system.");
		
	}

	@Override
	public void deleteGame(Game game) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + "the game succesfully deleted from system.");
	}

	@Override
	public void updateGame(Game game) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + "the game succesfully updated to system.");
	}

}
