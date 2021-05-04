package Game;

import Gamer.Gamer;

public class GameSaleManager implements GameSaleService{

	@Override
	public void GameSale(Game game, Gamer gamer) {
	
		System.out.println(gamer.getGamerName() + " isimli kullanýcý " + game.getGameName() + " adlý oyunu " + game.getGamePrice() + " TL karþýlýðýnda satýn aldý");
		
	}

	@Override
	public void GameGift(Game game, Gamer gamer, Gamer gamer2) {
		
		System.out.println(gamer.getGamerName() + " isimli kullanýcý " + game.getGameName() + " adlý oyunu " + game.getGamePrice() + " TL karþýlýðýnda " + gamer2.getGamerName() + " adlý kullanýcýya hediye etti");
		
	}

	@Override
	public void ShowGameSaleNumber(Game game) {
		
		System.out.println(game.getGameName() + " isimli oyun " + game.getGameSaleNumber() + " adet satýþ sayýsýna ulaþtý! Tebrikler!");
		
	}
	
	

}
