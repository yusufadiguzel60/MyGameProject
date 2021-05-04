package Campaign;

import Game.Game;
import Gamer.Gamer;

public class CampaignManager implements CampaginService{

	@Override
	public void SuperMayCampaign(Gamer gamer, Game game, Campaign campaign) {
		
		System.out.println(gamer.getGamerName() + " isimli kullanýcý " + campaign.getCampaignName() + " kampanyasýyla " + game.getGameName() + " adlý oyunu indirimli satýn aldý" );
		
	}

	@Override
	public void FestalCampaign(Gamer gamer, Game game, Campaign campaign) {
		
		System.out.println(gamer.getGamerName() + " isimli kullanýcý " + campaign.getCampaignName() + " kampanyasýyla " + game.getGameName() + " adlý oyunu indirimli satýn aldý" );
		
	}

}
