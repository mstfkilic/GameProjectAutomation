package Entities;

public class Game {
	private int gameId;
	private String gameName;
	private double gamePrice;
	private int stockAmount;
	private String systemRequirement;
	public Game(int gameId, String gameName, double gamePrice, int stockAmount, String systemRequirement) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.stockAmount = stockAmount;
		this.systemRequirement = systemRequirement;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
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
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getSystemRequirement() {
		return systemRequirement;
	}
	public void setSystemRequirement(String systemRequirement) {
		this.systemRequirement = systemRequirement;
	}
}
