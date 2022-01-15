package Abstract;

import java.rmi.RemoteException;

import Entities.Campaign;

public interface ICampaignService {
	void addCampaign(Campaign campaign) throws NumberFormatException, RemoteException;
	void deleteCampaign(Campaign campaign) throws NumberFormatException, RemoteException;
	void updateCampaign(Campaign campaign) throws NumberFormatException, RemoteException;
}
