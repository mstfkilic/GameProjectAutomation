package Concrete;

import java.rmi.RemoteException;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void addCampaign(Campaign campaign) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " succesfully added to system.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " succesfully deleted from system.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " succesfully updated to system.");
		
	}

}
