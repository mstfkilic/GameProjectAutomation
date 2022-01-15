package Concrete;

import java.rmi.RemoteException;

import Abstract.IGameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameSaleManager implements IGameSaleService {

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		
		double gamePrice = game.getGamePrice() - (game.getGamePrice() * campaign.getCampaignDiscount()/100);
		
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName()+ "bought" + game.getGameName() + "game with " + campaign.getCampaignDiscount() + gamePrice );
		
	}

}
