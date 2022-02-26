package com.blz.stock.account;

class StockDetail {
	// variables
	private String stockName;
	private Integer numOfShare;
	private double sharePrice;

	// Parameterized constructor
	public StockDetail(String stockName, Integer numOfShare, double sharePrice) {
		super();
		this.stockName = stockName;
		this.numOfShare = numOfShare;
		this.sharePrice = sharePrice;
	}

	// getters and setters
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Integer getNumOfShare() {
		return numOfShare;
	}

	public void setNumOfShare(Integer numOfShare) {
		this.numOfShare = numOfShare;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	// Calculation methods
	public double CalculateStockTotalValue() {
		return getNumOfShare() * getSharePrice();
	}

	public double CalculateTotalValue() {
		return CalculateTotalValue() * getNumOfShare();
	}
}

public class StockAccountManagement {
	// main method
	public static void main(String args[]) {

		// StockDetail array
		StockDetail st[] = new StockDetail[4];

		st[0] = new StockDetail("Parle", 23, 34.5);
		st[1] = new StockDetail("cheese", 10, 45.6);
		st[2] = new StockDetail("sauce", 20, 25.4);
		st[3] = new StockDetail("corn", 21, 30.8);

		for (StockDetail st1 : st) {
			System.out.println("The Name of the Stock==" + st1.getStockName());
			System.out.println("The number of share ==" + st1.getNumOfShare());
			System.out.println("The share price ==" + st1.getSharePrice());
			System.out.println("Total ==" + st1.CalculateStockTotalValue());
		}
		double total = 0.0;
		for (int i = 0; i < 4; i++) {
			total += st[i].CalculateTotalValue();
		}
		System.out.printf("Total Value  is==", total);
	}
}
