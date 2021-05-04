package Main;

import Campaign.CampaginService;
import Campaign.Campaign;
import Campaign.CampaignManager;
import Game.Game;
import Game.GameSaleManager;
import Gamer.DateOfBirthValidation;
import Gamer.Gamer;
import Gamer.GamerManager;
import Gamer.GamerValidationService;
import Gamer.NameValidation;
import Gamer.NationallyIdValidation;

public class Main {

	public static void main(String[] args) {
		
	//Gamer
	Gamer gamer1 = new Gamer("Yusuf", 58156, "example@gmail.com", "12345", "66792349238", 1990);
	Gamer gamer2 = new Gamer("Ali", 77616, "example2@gmail.com", "12345678", "98631346972", 2002);
	Gamer gamer3 = new Gamer("Ayþe", 93115, "example3@gmail.com", "986424", "986412", 2005);
	
	//Game
	Game game1 = new Game("PUBG", 29.90, 684520, 10000000);
	Game game2 = new Game("Fortnite", 12.99, 894627, 15000000);
	Game game3 = new Game("Counter-Strike", 25.00, 965426, 30000000);
	
	//Gamer methods
	GamerManager gamer = new GamerManager();
	gamer.Add(gamer1);
	gamer.Remove(gamer2);
	gamer.Update(gamer3);
	
	System.out.println("------------------------------------------------------");
	
	
	//Game sale
	GameSaleManager game = new GameSaleManager();
	game.GameSale(game1, gamer1);
	game.GameGift(game2, gamer2, gamer3);
	game.ShowGameSaleNumber(game3);
	
	System.out.println("------------------------------------------------------");
	
	//gamer validation
	GamerValidationService gamerValidation = new DateOfBirthValidation();
	gamerValidation.CheckIfPerson(gamer3);
	
	GamerValidationService gamerValidation1 = new NationallyIdValidation();
	gamerValidation1.CheckIfPerson(gamer2);
	
	GamerValidationService gamerValidatin2 = new NameValidation();
	gamerValidatin2.CheckIfPerson(gamer1);
	
	System.out.println("------------------------------------------------------");
	
	//campaign
	Campaign campaign1 = new Campaign("Süper Mayýs");
	Campaign campaign2 = new Campaign("Bayram");
	
	CampaignManager campaignManager = new CampaignManager();
	campaignManager.FestalCampaign(gamer3, game3, campaign2);
	campaignManager.SuperMayCampaign(gamer1, game1, campaign1);
	
	
	
	
 
	}

}
