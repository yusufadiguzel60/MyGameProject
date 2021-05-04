package Game;

import Gamer.Gamer;

public class GameSaleManager implements GameSaleService{

	@Override
	public void GameSale(Game game, Gamer gamer) {
	
		System.out.println(gamer.getGamerName() + " isimli kullan�c� " + game.getGameName() + " adl� oyunu " + game.getGamePrice() + " TL kar��l���nda sat�n ald�");
		
	}

	@Override
	public void GameGift(Game game, Gamer gamer, Gamer gamer2) {
		
		System.out.println(gamer.getGamerName() + " isimli kullan�c� " + game.getGameName() + " adl� oyunu " + game.getGamePrice() + " TL kar��l���nda " + gamer2.getGamerName() + " adl� kullan�c�ya hediye etti");
		
	}

	@Override
	public void ShowGameSaleNumber(Game game) {
		
		System.out.println(game.getGameName() + " isimli oyun " + game.getGameSaleNumber() + " adet sat�� say�s�na ula�t�! Tebrikler!");
		
	}
	
	

}
