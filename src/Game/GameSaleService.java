package Game;

import Gamer.Gamer;

public interface GameSaleService {
	
	void GameSale(Game game, Gamer gamer);
	
	void GameGift(Game game, Gamer gamer, Gamer gamer2);
	
	void ShowGameSaleNumber(Game game);
}
