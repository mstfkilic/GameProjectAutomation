package Abstract;

import java.rmi.RemoteException;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface IGameSaleService {
	void sell(Gamer gamer,Game game,Campaign campaign) throws NumberFormatException, RemoteException;
}
