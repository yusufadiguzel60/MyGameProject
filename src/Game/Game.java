package Game;

public class Game {
	
	private String gameName;
	private double gamePrice;
	private long gameId;
	private long gameSaleNumber;
	
	public Game(String gameName, double gamePrice, long gameId, long gameSaleNumber) {
		super();
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.gameId = gameId;
		this.gameSaleNumber = gameSaleNumber;
	}
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	public long getGameId() {
		return gameId;
	}
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}
	public long getGameSaleNumber() {
		return gameSaleNumber;
	}
	public void setGameSaleNumber(long gameSaleNumber) {
		this.gameSaleNumber = gameSaleNumber;
	}

}
