package gameProjectAutomation;

import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstract.IGamerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		
		// TODO Auto-generated method stub
		Gamer gamer1 = new Gamer(1,"Mustafa","Kılıç",1992,"12423095006");
		Game game1 = new Game(1,"FIFA 2022",475.50,5000,"PS4 and PS5");
		Campaign campaign1 = new Campaign(1,"Summer Discount",0, LocalDate.of(2021,8,21), LocalDate.of(2021,9,30));

		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		
		gamerManager.addGamer(gamer1);
		
		GameManager gameManager = new GameManager();
		gameManager.addGame(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1);
		
		IGamerCheckService gamerCheckService = new MernisServiceAdapter();
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		if(gamerCheckService.checkIfRealGamer(gamer1)== true) {
			gameSaleManager.sell(gamer1, game1, campaign1);
		}else {
			System.out.println("Gamer is not found and sales are failed.");
		}
		
		
	}

}
