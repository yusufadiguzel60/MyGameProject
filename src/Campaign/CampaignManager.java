package Campaign;

import Game.Game;
import Gamer.Gamer;

public class CampaignManager implements CampaginService{

	@Override
	public void SuperMayCampaign(Gamer gamer, Game game, Campaign campaign) {
		
		System.out.println(gamer.getGamerName() + " isimli kullan�c� " + campaign.getCampaignName() + " kampanyas�yla " + game.getGameName() + " adl� oyunu indirimli sat�n ald�" );
		
	}

	@Override
	public void FestalCampaign(Gamer gamer, Game game, Campaign campaign) {
		
		System.out.println(gamer.getGamerName() + " isimli kullan�c� " + campaign.getCampaignName() + " kampanyas�yla " + game.getGameName() + " adl� oyunu indirimli sat�n ald�" );
		
	}

}
